package com.ruoyi.system.mapper.zhuangxiumapper.shopMapper;

import com.ruoyi.common.core.domain.entity.ProductInfow;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;

import java.util.List;

//@Mapper
public interface ProductInfoMapper  {

//    这个是在店铺订单里面展示的

    public ProductInfo selectListddId(Integer categoryId);

    public List<ProductInfo> findAllddList(ProductInfo productInfo);

    public List<ProductInfo> findAllddListTwo(ProductInfo productInfo);

//    ****************

    public ProductInfo selectListId(ProductInfo productInfo);

    public List<ProductInfo> findAllList(ProductInfo productInfo);
    //修改数据
    public int updataProduct(ProductInfo productInfo);

    //删除
    public int deleteConfigById(Long productid);
    //批量删除
    public int deleteConfigByIds(Long[] productids);


    /**
     * 查询商品信息
     *
     * @param productId 商品信息ID
     * @return 商品信息
     */
    public ProductInfo selectProductInfoById(Integer productId);

    /**
     * 查询商品信息列表
     *
     * @param productInfo 商品信息
     * @return 商品信息集合
     */
    public List<ProductInfo> selectProductInfoList(ProductInfo productInfo);


    public List<ProductInfow> selectProductByType(String productName);

}
