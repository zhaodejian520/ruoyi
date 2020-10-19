package com.ruoyi.system.service.zhaungxiuservice.shopService;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;
import com.ruoyi.system.domain.zhuangxiumain.vo.ProductInfoVo;
import com.ruoyi.system.response.Result;

import java.util.List;
import java.util.Map;

public interface ProductInfoService {

//    Result findAll(Map<String,Object> map);
    public ProductInfoVo selectConfigById(Long productid);

    public List<ProductInfoVo> selectConfigList(ProductInfoVo productInfoVo);

    public List<ProductInfo> findAlList(ProductInfo productInfo);

    public ProductInfo selectListId(Long productid);


    public int updataProduct(ProductInfo productInfo);

   public int deleteConfigById(Long productid);
    public int deleteConfigByIds(Long[] productids);

}
