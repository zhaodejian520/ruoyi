package com.ruoyi.system.service.zhaungxiuservice.shopService;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;
import com.ruoyi.system.domain.zhuangxiumain.vo.ProductInfoVo;

import java.util.List;

public interface ProductInfoService {

//    Result findAll(Map<String,Object> map);
    public ProductInfoVo selectConfigById(Long productid);

    public List<ProductInfoVo> selectConfigList(ProductInfoVo productInfoVo);

    public List<ProductInfo> findAlList(ProductInfo productInfo);

    public ProductInfo selectListId(Integer productid);


    public int updataProduct(ProductInfo productInfo);

   public int deleteConfigById(Long productid);
    public int deleteConfigByIds(Long[] productids);


// 这个是店铺订单用的
    public List<ProductInfo> findAllddList(ProductInfo productInfo);
    public ProductInfo selectListddId(Integer categoryId);
    public List<ProductInfo> findAllddListTwo(ProductInfo productInfo);
//**********


}
