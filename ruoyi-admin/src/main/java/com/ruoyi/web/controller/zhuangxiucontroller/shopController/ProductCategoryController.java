package com.ruoyi.web.controller.zhuangxiucontroller.shopController;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.annotation.RepeatSubmit;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductCategory;
import com.ruoyi.system.service.zhaungxiuservice.shopService.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productcategory")
public class ProductCategoryController extends BaseController {

    @Autowired(required = false)
    private ProductCategoryService productCategoryService;






//    以上是店铺分类用的
//    以下忘了是干的了

    @Log(title = "查询一级分类", businessType = BusinessType.EXPORT)
    @GetMapping("/findAllList")
    public TableDataInfo findAllList(ProductCategory productCategory){
        startPage();
        List<ProductCategory> list = productCategoryService.findAllList(productCategory);
        return getDataTable(list);
    }



    @Log(title = "添加一级分类", businessType = BusinessType.INSERT)
    @RepeatSubmit
    @PostMapping("/insertCategory")
    public AjaxResult insertCategory(@Validated @RequestBody ProductCategory productCategory){
//        productCategory.setCreateBy(SecurityUtils.getUsername());
        return toAjax(productCategoryService.insertCategory(productCategory));
    }


    /**
     * 批量删除
     * */
    @Log(title = "参数数据", businessType = BusinessType.DELETE)
    @DeleteMapping("/{categoryId}")
    public AjaxResult deleteCategoryByIds(@RequestBody Long[] categoryId){
        return toAjax(productCategoryService.deleteCategoryByIds(categoryId));
    }

    @Log(title = "禁用分类", businessType = BusinessType.UPDATE)
    @PutMapping("/updataByOneId")
    public AjaxResult updataByOneId(@RequestBody ProductCategory productCategory){
        return toAjax(productCategoryService.updataByOneId(productCategory));
    }



}
