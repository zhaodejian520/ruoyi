package com.ruoyi.system.mapper.zhuangxiumapper.shopMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;
import com.ruoyi.system.domain.zhuangxiumain.vo.ProductInfoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface ProductInfoMapper  {

    public ProductInfo selectListId(ProductInfo productInfo);

    public List<ProductInfo> findAllList(ProductInfo productInfo);
    //修改数据
    public int updataProduct(ProductInfo productInfo);

    //删除
    public int deleteConfigById(Long productid);
    //批量删除
    public int deleteConfigByIds(Long[] productids);
}
