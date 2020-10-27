package com.ruoyi.system.mapper.zhuangxiumapper.orderformMapper;

import com.ruoyi.system.domain.zhuangxiumain.orderformMain.OrderMaster;

import java.util.List;

public interface OrderMasterMapper {
    // 查询有哪些订单
    public List<OrderMaster> findAllList(OrderMaster orderMaster);
    // 根据id查询这个 商品的全部订单
    public OrderMaster findAllById(Long productid);

    public List<OrderMaster> findAll(OrderMaster orderMaster);




    // 以下是 店铺订单中用的
    public List<OrderMaster> selectOrderDingDanList(OrderMaster orderMaster);
    public OrderMaster selectOrderDingDanById(Integer orderId);



    // 总权限的订单管理 以下


    public OrderMaster selectOrderMasterById(Integer orderId);
    public List<OrderMaster> selectOrderMasterList(OrderMaster orderMaster);
    public int insertOrderMaster(OrderMaster orderMaster);
    public int updateOrderMaster(OrderMaster orderMaster);
    public int deleteOrderMasterById(Integer orderId);
    public int deleteOrderMasterByIds(Integer[] orderIds);











}
