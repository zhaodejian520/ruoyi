package com.ruoyi.web.controller.zhuangxiucontroller.orderformController;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.service.TokenService;
import com.ruoyi.system.domain.zhuangxiumain.orderformMain.OrderMaster;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductCategory;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;
import com.ruoyi.system.mapper.zhuangxiumapper.orderformMapper.OrderMasterMapper;
import com.ruoyi.system.service.zhaungxiuservice.shopService.OrderMasterService;
import com.ruoyi.system.service.zhaungxiuservice.shopService.ProductCategoryService;
import com.ruoyi.system.service.zhaungxiuservice.shopService.ProductInfoService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/shopping/ordermaster")
public class OrderMasterController extends BaseController {

    @Autowired(required = false)
    private OrderMasterService orderMasterService;

    @Autowired(required = false)
    private OrderMasterMapper orderMasterMapper;

    @Autowired(required = false)
    private TokenService tokenService;


    @PreAuthorize("@ss.hasPermi('system:ordermaster:query')")
    @GetMapping(value = "/getInfoPid/{productId}")
    public AjaxResult findAllById(@PathVariable Long productid){
        return AjaxResult.success(orderMasterService.findAllById(productid));
    }


    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:list')")
    @GetMapping(value = "/list")
    public TableDataInfo findAllList(OrderMaster orderMaster){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId1 = loginUser.getUser().getUserId();
        orderMaster.setUserId(userId1);
        List<OrderMaster> list = orderMasterService.findAllList(orderMaster);
        return getDataTable(list);

    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:export')")
    @Log(title = "订单信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(OrderMaster orderMaster){
        List<OrderMaster> allList = orderMasterMapper.findAllList(orderMaster);
        ExcelUtil<OrderMaster> util = new ExcelUtil<>(OrderMaster.class);
        return util.exportExcel(allList, "ordermaster");
    }

    /**
     * 修改订单主
     */
    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:edit')")
    @Log(title = "订单修改", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OrderMaster orderMaster)
    {
        return toAjax(orderMasterService.updateOrderMaster(orderMaster));
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:selectById')")
    @GetMapping(value = "/selectById/{orderId}")
    public AjaxResult selectById(@PathVariable("orderId") Integer orderId)
    {
        return AjaxResult.success(orderMasterService.selectById(orderId));
    }


//    以上是订单的***********************************



//    以下是店铺中的订单用的 **********************************
    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:listdd')")
    @GetMapping("/listdd")
    public TableDataInfo selectOrderDingDanList(OrderMaster orderMaster){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        System.err.println("****************" +userId);
        orderMaster.setUserId(userId);
        List<OrderMaster> list1 = orderMasterService.selectOrderDingDanList(orderMaster);
        return getDataTable(list1);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:querydd')")
    @GetMapping("/getInfodd/{orderId}")
    public AjaxResult selectOrderDingDanById(@PathVariable("orderId") Integer orderId){
        return AjaxResult.success(orderMasterService.selectOrderMasterById(orderId));
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:updateFaHuo')")
    @Log(title = "修改订单状态", businessType = BusinessType.UPDATE)
    @PutMapping("/updateFaHuo")
    public AjaxResult updateFaHuo(@RequestBody OrderMaster orderMaster){
        return toAjax(orderMasterService.updateFaHuo(orderMaster));
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:findAllListVoYI')")
    @GetMapping("/findAllListVoYI")
    public TableDataInfo findAllListVoYI(OrderMaster orderMaster){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        orderMaster.setUserId(userId);
        orderMaster.setOrderStatus(1);
        List<OrderMaster> list1 = orderMasterService.findAllListVoYI(orderMaster);
        return getDataTable(list1);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:findAllListVoER')")
    @GetMapping("/findAllListVoER")
    public TableDataInfo findAllListVoER(OrderMaster orderMaster){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        orderMaster.setUserId(userId);
        orderMaster.setOrderStatus(2);
        List<OrderMaster> list1 = orderMasterService.findAllListVoYI(orderMaster);
        return getDataTable(list1);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:findAllListVoSAN')")
    @GetMapping("/findAllListVoSAN")
    public TableDataInfo findAllListVoSAN(OrderMaster orderMaster){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        orderMaster.setUserId(userId);
        orderMaster.setOrderStatus(3);
        List<OrderMaster> list1 = orderMasterService.findAllListVoYI(orderMaster);
        return getDataTable(list1);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:findAllListVoSI')")
    @GetMapping("/findAllListVoSI")
    public TableDataInfo findAllListVoSI(OrderMaster orderMaster){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        orderMaster.setUserId(userId);
        orderMaster.setOrderStatus(4);
        List<OrderMaster> list1 = orderMasterService.findAllListVoYI(orderMaster);
        return getDataTable(list1);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:findAllListVoWU')")
    @GetMapping("/findAllListVoWU")
    public TableDataInfo findAllListVoWU(OrderMaster orderMaster){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        orderMaster.setUserId(userId);
        orderMaster.setOrderStatus(5);
        List<OrderMaster> list1 = orderMasterService.findAllListVoYI(orderMaster);
        return getDataTable(list1);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:findAllListVoLIU')")
    @GetMapping("/findAllListVoLIU")
    public TableDataInfo findAllListVoLIU(OrderMaster orderMaster){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        orderMaster.setUserId(userId);
        orderMaster.setOrderStatus(6);
        List<OrderMaster> list1 = orderMasterService.findAllListVoYI(orderMaster);
        return getDataTable(list1);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:findAllListVoQI')")
    @GetMapping("/findAllListVoQI")
    public TableDataInfo findAllListVoQI(OrderMaster orderMaster){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        orderMaster.setUserId(userId);
        orderMaster.setOrderStatus(7);
        List<OrderMaster> list1 = orderMasterService.findAllListVoYI(orderMaster);
        return getDataTable(list1);
    }


//    下别的是 店铺商品分类用的的****************************


    @Autowired(required = false)
    private ProductCategoryService productCategoryService;


    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:listpc')")
    @GetMapping("/listpc")
    public TableDataInfo list(ProductCategory productCategory)
    {
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId1 = loginUser.getUser().getUserId();
        System.err.println("****************" +userId1);
        productCategory.setUserId(userId1);
        List<ProductCategory> list = productCategoryService.selectProductCategoryList(productCategory);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:querypc')")
    @GetMapping(value = "/{categoryId}")
    public AjaxResult getInfo(@PathVariable("categoryId") Integer categoryId)
    {
        return AjaxResult.success(productCategoryService.selectProductCategoryById(categoryId));
    }


//**************************

//    这个是店铺商品用的
    @Autowired(required = false)
    private ProductInfoService productInfoService;

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:listpi')")
    @GetMapping("/listpi")
    public TableDataInfo listpi(ProductInfo productInfo)
    {
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        productInfo.setUserId(userId);
        List<ProductInfo> list = productInfoService.findAllddList(productInfo);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:listpiTwo')")
    @GetMapping("/listpiTwo")
    public TableDataInfo listpiTwo(ProductInfo productInfo)
    {
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        Long userId = loginUser.getUser().getUserId();
        productInfo.setUserId(userId);
        List<ProductInfo> list = productInfoService.findAllddListTwo(productInfo);
        return getDataTable(list);
    }

    @PreAuthorize("@ss.hasPermi('shopping:ordermaster:querypi')")
    @GetMapping(value = "/getInfopi/{categoryId}")
    public AjaxResult getInfopi(@PathVariable("categoryId") Integer categoryId)
    {
        return AjaxResult.success(productInfoService.selectListddId(categoryId));
    }


//    ****************



    @PostMapping(value = "/exportData")
    public String exportData(HttpServletResponse response, @RequestBody Map<String,Object> map) throws IOException {
        // 获得用户选中的复选框
        String excelOptions = map.get("excelOptions").toString();

        List<String> headerList = new ArrayList<>();

        if(excelOptions.contains("province")) headerList.add("省");
        if(excelOptions.contains("city")) headerList.add("市");
        if(excelOptions.contains("district")) headerList.add("区");
        if(excelOptions.contains("address")) headerList.add("地区");
        if(excelOptions.contains("shippingCompName")) headerList.add("快递公司名称");


        //创建excel对象
        Workbook workbook = new SXSSFWorkbook();
        //创建样式对象    单元格
        CellStyle cellStyle = workbook.createCellStyle();
        //创建字体对象
        Font font = workbook.createFont();
        //创建工作薄对象
        Sheet sheet = workbook.createSheet();


        //获得到数据
        String showOrHiddenHeader = map.get("showOrHiddenHeader").toString();

        //设置标题头
        if ("2".equals(showOrHiddenHeader)){ // 说明要设置大标题
            String headerContent = map.get("headerContent").toString(); // 获取用户输入的标题名称
            Row row = sheet.createRow(0);  // 获得行数
            int size = headerList.size();  // 获得列数

            Cell cell = row.createCell(0); // 获取带第一行 的第一个单元格
            cell.setCellValue(headerContent); // 往第一行 第一个单元格 进行赋值

            //设置字体
            font.setFontName("微软雅黑");
//            font.setFontHeightInPoints((short) 30); //设置字体的大小

            //设置样式
            cellStyle.setAlignment(HorizontalAlignment.CENTER); //剧中
            cellStyle.setFont(font); //渲染字体;
            cell.setCellStyle(cellStyle);  //当前单元格设置 单元格样式;

            //合并单元格
            CellRangeAddress region = new CellRangeAddress(0,0,0,size-1);
            sheet.addMergedRegion(region);
        }

        //原子性对象
        AtomicInteger headAi = new AtomicInteger();

        //设置表头
        //判断单选框 是0 还是1  是否开启标题头
        Row headRow = sheet.createRow("2".equals(showOrHiddenHeader) ? 1 : 0);

        for (String name : headerList) {
            Cell cell = headRow.createCell(headAi.getAndIncrement());
            cell.setCellValue(name);
            cellStyle.setAlignment(HorizontalAlignment.CENTER);
            cell.setCellStyle(cellStyle); //渲染  当前单元格设置单元格样式;
        }


        //设置数据
        AtomicInteger bodyAi = new AtomicInteger("2".equals(showOrHiddenHeader) ? 2 : 1);
        Cell cell = null;


        List<OrderMaster> areas = orderMasterMapper.findAll(null);
        for (OrderMaster area : areas) {

            int index = 0;

            Row bodyRow = sheet.createRow(bodyAi.getAndIncrement());

            if(excelOptions.contains("province")){
                cell = bodyRow.createCell(index);
                cell.setCellValue(area.getProvince());  //省

                cellStyle.setAlignment(HorizontalAlignment.CENTER);


                index = index + 1;
            }

            if(excelOptions.contains("city")){
                cell = bodyRow.createCell(index);
                cell.setCellValue(area.getCity());      //市

                cellStyle.setAlignment(HorizontalAlignment.CENTER);


                index = index + 1;
            }

            if(excelOptions.contains("district")){
                cell = bodyRow.createCell(index);
                cell.setCellValue(area.getDistrict());  //区

                cellStyle.setAlignment(HorizontalAlignment.CENTER);


                index = index + 1;
            }

            if(excelOptions.contains("address")){
                cell = bodyRow.createCell(index);
                cell.setCellValue(area.getAddress());  //地区

                cellStyle.setAlignment(HorizontalAlignment.CENTER);

                index = index + 1;
            }

            if(excelOptions.contains("shippingCompName")){
                cell = bodyRow.createCell(index);
                cell.setCellValue(area.getShippingCompName());  //快递公司名称

                cellStyle.setAlignment(HorizontalAlignment.CENTER);

                index = index + 1;
            }

        }



        String fileName = URLEncoder.encode("订单信息表.xlsx","UTF-8");

        response.setContentType("application/octet-stream");
        response.setHeader("content-disposition","attachment");
        workbook.write(response.getOutputStream());

        return null;
    }



}
