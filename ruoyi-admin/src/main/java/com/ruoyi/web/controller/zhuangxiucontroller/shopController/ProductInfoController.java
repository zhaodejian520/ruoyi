package com.ruoyi.web.controller.zhuangxiucontroller.shopController;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;

import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;
import com.ruoyi.system.domain.zhuangxiumain.vo.ProductInfoVo;
import com.ruoyi.system.response.Result;
import com.ruoyi.system.service.zhaungxiuservice.shopService.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/productinfo")
public class ProductInfoController extends BaseController {

    @Autowired(required = false)
    private ProductInfoService productInfoService;

//    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
//    public Result findAll(@RequestBody Map<String,Object> map){
//        System.err.println("查询成功");
//        return productInfoService.findAll(map);
//    }

    /**
     * 根据参数编号获取详细信息
     */

    @GetMapping(value = "/{productId}")
    public AjaxResult getInfo(@PathVariable Long productid)
    {
        return AjaxResult.success(productInfoService.selectConfigById(productid));
    }

    /**
     * 获取参数配置列表
     * TableDataInfo 分页工具类
     */

    @GetMapping("/list")
    public TableDataInfo list(ProductInfoVo productInfoVo)
    {
//        设置请求分页数据
        startPage();
        List<ProductInfoVo> list = productInfoService.selectConfigList(productInfoVo);
        System.err.println("*********************查询成功**********************************");
        return getDataTable(list);
    }

    /***
     * 查询商品
     * */
    @Log(title = "查询商品列表", businessType = BusinessType.EXPORT)
    @GetMapping("/findAllList")
    public TableDataInfo findAllList(ProductInfo productInfo){
        startPage();
        List<ProductInfo> list = productInfoService.findAlList(productInfo);
        return getDataTable(list);
    }


    /**
     * 修改数据
     * **/

    @Log(title = "修改商品", businessType = BusinessType.UPDATE)
    @PutMapping("/changeStatus")
    public AjaxResult updataProduct(@RequestBody ProductInfo productInfo){
//        productInfo.setUpdateBy(SecurityUtils.getUsername());
        return toAjax(productInfoService.updataProduct(productInfo));
    }

    /**
     * 批量删除
     * */
    @Log(title = "参数数据", businessType = BusinessType.DELETE)
    @DeleteMapping("/{productids}")
    public AjaxResult deleteConfigByIds(@RequestBody Long[] productids){
        return toAjax(productInfoService.deleteConfigByIds(productids));
    }



}
