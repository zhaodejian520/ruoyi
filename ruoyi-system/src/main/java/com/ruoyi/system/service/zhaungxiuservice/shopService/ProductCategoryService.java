package com.ruoyi.system.service.zhaungxiuservice.shopService;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductCategory;

import java.util.List;

public interface ProductCategoryService {

    //    查询一级分类
    public List<ProductCategory> findAllList(ProductCategory productCategory);
    //    添加一级分类
    public int insertCategory(ProductCategory productCategory);
    //    删除一级分类
    public int deleteCategoryByIds(Long[] categoryId);
    //禁用
    public int updataByOneId(ProductCategory productCategory);


}
