package com.ruoyi.system.mapper.zhuangxiumapper.shopMapper;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductCategory;

import java.util.List;

public interface ProductCategoryMapper {
//    查询一级分类
    public List<ProductCategory> findAllList(ProductCategory productCategory);
//    添加一级分类
    public int insertCategory(ProductCategory productCategory);
//    删除一级分类
    public int deleteCategoryByIds(Long[] categoryId);

//   0 禁用  1 启动
    public int updataByOneId(ProductCategory productCategory);



}
