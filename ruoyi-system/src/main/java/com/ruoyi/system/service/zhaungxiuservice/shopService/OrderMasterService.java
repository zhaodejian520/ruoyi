package com.ruoyi.system.service.zhaungxiuservice.shopService;

import com.ruoyi.common.core.domain.entity.ProductInfow;
import com.ruoyi.system.domain.zhuangxiumain.orderformMain.OrderMaster;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductInfo;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.SupplierInfo;

import java.util.List;

public interface OrderMasterService {

    public OrderMaster findAllById(Long productid);

    public List<OrderMaster> findAllList(OrderMaster orderMaster);

    // 店铺中的订单使用的 以下****************************
    public List<OrderMaster> selectOrderDingDanList(OrderMaster orderMaster);
    public OrderMaster selectOrderDingDanById(Integer orderId);
    public List<OrderMaster> findAllListVoYI(OrderMaster orderMaster);
    public int updateFaHuo(OrderMaster orderMaster);
    public OrderMaster selectById(Integer orderId);


    // 总权限的订单管理 以下******************************

    public OrderMaster selectOrderMasterById(Integer orderId);

    public List<OrderMaster> selectOrderMasterList(OrderMaster orderMaster);
    public int insertOrderMaster(OrderMaster orderMaster);
    public int updateOrderMaster(OrderMaster orderMaster);
    public int deleteOrderMasterByIds(Integer[] orderIds);
    public int deleteOrderMasterById(Integer orderId);
    public List<SupplierInfo> selectSupplierInfoList(SupplierInfo supplierInfo);
    public ProductInfo selectProductInfoById(Integer productId);
    public List<ProductInfo> selectProductInfoList(ProductInfo productInfo);



//    *****************************


    public List<SupplierInfo> selectSuppTypeAll();
    public SupplierInfo selectSuppTypeById(Integer supplierId);
    public SupplierInfo selectSuppTypeByType(String supplierName);
    public SupplierInfo checkSuppTypeUnique(String supplierName);
    public List<ProductInfow> selectDictDataByType(String productName);


}
