package com.ruoyi.system.service.zhaungxiuservice.shopService.impl;

import com.ruoyi.common.core.domain.entity.ProductInfow;
import com.ruoyi.common.utils.DictUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.zhuangxiumain.orderformMain.OrderMaster;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.SupplierInfo;
import com.ruoyi.system.mapper.zhuangxiumapper.orderformMapper.OrderMasterMapper;
import com.ruoyi.system.mapper.zhuangxiumapper.shopMapper.ProductInfoMapper;
import com.ruoyi.system.mapper.zhuangxiumapper.shopMapper.SupplierInfoMapper;
import com.ruoyi.system.service.zhaungxiuservice.shopService.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMasterServiceImpl implements OrderMasterService {

    @Autowired(required = false)
    private OrderMasterMapper orderMasterMapper;

    @Autowired(required = false)
    private SupplierInfoMapper supplierInfoMapper;

    @Autowired(required = false)
    private ProductInfoMapper productInfoMapper;

    @Override
    public OrderMaster findAllById(Long productid) {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setProductId(productid);
        return orderMasterMapper.findAllById(productid);
    }

    @Override
    public List<OrderMaster> findAllList(OrderMaster orderMaster) {
        return orderMasterMapper.findAllList(orderMaster);
    }



    // 以下是 店铺中的订单用的*******************************
    @Override
    public List<OrderMaster> selectOrderDingDanList(OrderMaster orderMaster) {
        return orderMasterMapper.selectOrderDingDanList(orderMaster);
    }

    @Override
    public OrderMaster selectOrderDingDanById(Integer orderId) {
        return orderMasterMapper.selectOrderDingDanById(orderId);
    }


    // 总权限的订单管理 以下****************************


    @Override
    public OrderMaster selectOrderMasterById(Integer orderId)
    {
        return orderMasterMapper.selectOrderMasterById(orderId);
    }

    @Override
    public List<OrderMaster> selectOrderMasterList(OrderMaster orderMaster)
    {
        return orderMasterMapper.selectOrderMasterList(orderMaster);
    }

    @Override
    public int insertOrderMaster(OrderMaster orderMaster)
    {
//        orderMaster.setCreateTime(DateUtils.getNowDate());
        return orderMasterMapper.insertOrderMaster(orderMaster);
    }


    @Override
    public int updateOrderMaster(OrderMaster orderMaster)
    {
        return orderMasterMapper.updateOrderMaster(orderMaster);
    }


    @Override
    public int deleteOrderMasterByIds(Integer[] orderIds)
    {
        return orderMasterMapper.deleteOrderMasterByIds(orderIds);
    }


    @Override
    public int deleteOrderMasterById(Integer orderId)
    {
        return orderMasterMapper.deleteOrderMasterById(orderId);
    }

    @Override
    public List<SupplierInfo> selectSupplierInfoList(SupplierInfo supplierInfo) {
        return supplierInfoMapper.selectSupplierInfoList(supplierInfo);
    }

    @Override
    public ProductInfo selectProductInfoById(Integer productId) {
        return productInfoMapper.selectProductInfoById(productId);
    }

    @Override
    public List<ProductInfo> selectProductInfoList(ProductInfo productInfo) {
        return productInfoMapper.selectProductInfoList(productInfo);
    }


//*******************************


    @Override
    public List<SupplierInfo> selectSuppTypeAll() {
        return supplierInfoMapper.selectSuppTypeAll();
    }

    @Override
    public SupplierInfo selectSuppTypeById(Integer supplierId) {
        return supplierInfoMapper.selectSuppTypeById(supplierId);
    }
    /**
     * 根据供应商查询字典数据
     * @param supplierName
     * @return 供应商数据集合信息
     */
    @Override
    public SupplierInfo selectSuppTypeByType(String supplierName) {
        return supplierInfoMapper.selectSuppTypeByType(supplierName);
    }

    @Override
    public SupplierInfo checkSuppTypeUnique(String supplierName) {
        return null;
    }

    @Override
    public List<ProductInfow> selectDictDataByType(String productName) {
        List<ProductInfow> prodDatas = DictUtils.getProduCache(productName);
        if (StringUtils.isEmpty(prodDatas)){
            return prodDatas;
        }
        prodDatas= productInfoMapper.selectProductByType(productName);
        if (StringUtils.isEmpty(prodDatas)){
            DictUtils.setProudCache(productName,prodDatas);
            return prodDatas;
        }

        return null;
    }


}
