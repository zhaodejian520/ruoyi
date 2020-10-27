package com.ruoyi.system.mapper.zhuangxiumapper.shopMapper;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductCategory;

import java.util.List;

public interface ProductCategoryMapper {

    // 以下是店铺 订单用的

    public ProductCategory selectProductCategoryById(Integer categoryId);
    public List<ProductCategory> selectProductCategoryList(ProductCategory productCategory);





    //  以下暂时忘了是啥的了

//    查询一级分类
    public List<ProductCategory> findAllList(ProductCategory productCategory);
//    添加一级分类
    public int insertCategory(ProductCategory productCategory);
//    删除一级分类
    public int deleteCategoryByIds(Long[] categoryId);

//   0 禁用  1 启动
    public int updataByOneId(ProductCategory productCategory);



}
