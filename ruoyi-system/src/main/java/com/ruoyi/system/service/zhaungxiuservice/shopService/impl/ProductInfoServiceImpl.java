package com.ruoyi.system.service.zhaungxiuservice.shopService.impl;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;
import com.ruoyi.system.domain.zhuangxiumain.vo.ProductInfoVo;
import com.ruoyi.system.mapper.zhuangxiumapper.shopMapper.ProductInfoMapper;
import com.ruoyi.system.mapper.zhuangxiumapper.shopMapper.ProductInfoVoMapper;
import com.ruoyi.system.service.zhaungxiuservice.shopService.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {


    @Autowired(required = false)
    private ProductInfoVoMapper productInfoMapperVo;

    @Autowired(required = false)
    private ProductInfoMapper productInfoMapper;

    @Override
    public ProductInfoVo selectConfigById(Long productid) {
        ProductInfoVo productInfoVo = new ProductInfoVo();
        productInfoVo.setProductid(productid);

        return productInfoMapperVo.selectConfig(productInfoVo);
    }

    @Override
    public List<ProductInfoVo> selectConfigList(ProductInfoVo productInfoVo) {
        return productInfoMapperVo.selectConfigList(productInfoVo);
    }

    @Override
    public List<ProductInfo> findAlList(ProductInfo productInfo) {
        return productInfoMapper.findAllList(productInfo);
    }

    @Override
    public ProductInfo selectListId(Long productid) {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductid(productid);
        return productInfoMapper.selectListId(productInfo);
    }

    @Override
    public int updataProduct(ProductInfo productInfo) {
        int row = productInfoMapper.updataProduct(productInfo);
        return row;
    }

    @Override
    public int deleteConfigById(Long productid) {
        return productInfoMapper.deleteConfigById(productid);
    }

    @Override
    public int deleteConfigByIds(Long[] productids) {
        return productInfoMapper.deleteConfigByIds(productids);
    }

//    @Override
//    public Result findAll(Map<String, Object> map) {
//
//        Integer page =Integer.parseInt(map.get("page").toString());
//        Integer size =Integer.parseInt(map.get("size").toString());
//        List<ProductInfoVo> take_times = productInfoMapperVo.getPage((page - 1)* size,size);
//        Integer total = productInfoMapperVo.getTotal(map);
//
//        PageResult<ProductInfoVo> list = new PageResult<>(total,take_times);
//
//        return new Result(ResultCode.SUCCESS,list);
//    }
}
