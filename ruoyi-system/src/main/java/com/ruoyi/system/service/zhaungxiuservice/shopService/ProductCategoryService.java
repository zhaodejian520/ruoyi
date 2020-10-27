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

//        <!--*************  以上是忘了干啥的了  ***************-->
//    <!--*************** 以下是店铺中分类用的 *********************-->

    public ProductCategory selectProductCategoryById(Integer categoryId);

    public List<ProductCategory> selectProductCategoryList(ProductCategory productCategory);


}
