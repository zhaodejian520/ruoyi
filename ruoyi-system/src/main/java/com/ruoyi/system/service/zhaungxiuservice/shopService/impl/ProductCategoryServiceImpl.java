package com.ruoyi.system.service.zhaungxiuservice.shopService.impl;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductCategory;
import com.ruoyi.system.mapper.zhuangxiumapper.shopMapper.ProductCategoryMapper;
import com.ruoyi.system.service.zhaungxiuservice.shopService.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired(required = false)
    private ProductCategoryMapper productCategoryMapper;


    @Override
    public List<ProductCategory> findAllList(ProductCategory productCategory) {
        return productCategoryMapper.findAllList(productCategory);
    }

    @Override
    public int insertCategory(ProductCategory productCategory) {

        productCategory.setCategoryLevel(1);
        productCategory.setCategoryStatus(1);
        productCategory.setModifiedTime(new Date());
        return productCategoryMapper.insertCategory(productCategory);
    }

    @Override
    public int deleteCategoryByIds(Long[] categoryId) {
        return productCategoryMapper.deleteCategoryByIds(categoryId);
    }

    @Override
    public int updataByOneId(ProductCategory productCategory) {
//        productCategory.setCategoryStatus(0);
        return productCategoryMapper.updataByOneId(productCategory);
    }
}
