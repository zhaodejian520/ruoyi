package com.ruoyi.web.controller.zhuangxiucontroller.orderformController;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.zhuangxiumain.orderformMain.OrderMaster;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.SupplierInfo;
import com.ruoyi.system.service.zhaungxiuservice.shopService.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order/master")
public class OrderMasterZBController extends BaseController {

    @Autowired(required = false)
    private OrderMasterService orderMasterService;

    //商品表

    @PreAuthorize("@ss.hasPermi('order:master:productlist')")
    @GetMapping("/productlist")
    public TableDataInfo productlist(ProductInfo productInfo){
        startPage();
        List<ProductInfo> productlist = orderMasterService.selectProductInfoList(productInfo);
        return getDataTable(productlist);
    }

    @PreAuthorize("@ss.hasPermi('order:master:productlistbyid')")
    @GetMapping(value = "/{productId}")
    public AjaxResult productlistbyid(@PathVariable("productId") Integer productId)
    {
        return AjaxResult.success(orderMasterService.selectProductInfoById(productId));
    }


    /**
     * 根据供应商查询商品数据信息
     */
    @GetMapping(value = "/type/{productName}")
    public AjaxResult productName(@PathVariable String productName)
    {
        return AjaxResult.success(orderMasterService.selectDictDataByType(productName));
    }



    // 供应商 表
    @PreAuthorize("@ss.hasPermi('order:master:supplierlist')")
    @GetMapping("/supplierlist")
    public TableDataInfo supplierlist(SupplierInfo supplierInfo)
    {
        startPage();
        List<SupplierInfo> supplierInfos = orderMasterService.selectSupplierInfoList(supplierInfo);
        return getDataTable(supplierInfos);
    }
    @PreAuthorize("@ss.hasPermi('order:master:supplierIdlistbyid')")
    @GetMapping(value = "/{supplierId}")
    public AjaxResult selectSuppTypeById(@PathVariable("supplierId") Integer supplierId){
        return AjaxResult.success(orderMasterService.selectSuppTypeById(supplierId));
    }





    // 订单管表  以下****************************

    @PreAuthorize("@ss.hasPermi('order:master:list')")
    @GetMapping("/list")
    public TableDataInfo list(OrderMaster orderMaster){
        startPage();
        List<OrderMaster> list = orderMasterService.selectOrderMasterList(orderMaster);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('order:master:query')")
    @GetMapping(value = "/{orderId}")
    public AjaxResult getInfo(@PathVariable("orderId") Integer orderId)
    {
        return AjaxResult.success(orderMasterService.selectOrderMasterById(orderId));
    }


    @PreAuthorize("@ss.hasPermi('system:master:export')")
    @Log(title = "订单主表", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(OrderMaster orderMaster)
    {
        List<OrderMaster> list = orderMasterService.selectOrderMasterList(orderMaster);
        ExcelUtil<OrderMaster> util = new ExcelUtil<OrderMaster>(OrderMaster.class);
        return util.exportExcel(list, "master");
    }



    /**
     * 新增订单主
     */
    @PreAuthorize("@ss.hasPermi('system:master:add')")
    @Log(title = "订单主", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OrderMaster orderMaster)
    {
        return toAjax(orderMasterService.insertOrderMaster(orderMaster));
    }

    /**
     * 修改订单主
     */
    @PreAuthorize("@ss.hasPermi('system:master:edit')")
    @Log(title = "订单主", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OrderMaster orderMaster)
    {
        return toAjax(orderMasterService.updateOrderMaster(orderMaster));
    }

    /**
     * 删除订单主
     */
    @PreAuthorize("@ss.hasPermi('system:master:remove')")
    @Log(title = "订单主", businessType = BusinessType.DELETE)
    @DeleteMapping("/{orderIds}")
    public AjaxResult remove(@PathVariable Integer[] orderIds)
    {
        return toAjax(orderMasterService.deleteOrderMasterByIds(orderIds));
    }


    @GetMapping("/optionselect")
    public AjaxResult optionselect()
    {
        List<SupplierInfo> dictTypes = orderMasterService.selectSuppTypeAll();
        return AjaxResult.success(dictTypes);
    }



}
