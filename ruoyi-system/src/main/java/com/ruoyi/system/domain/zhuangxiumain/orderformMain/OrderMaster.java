package com.ruoyi.system.domain.zhuangxiumain.orderformMain;



import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 *订单主表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderMaster implements Serializable {

  private static final long serialVersionUID = 1L;

  private long orderId;
  private long orderSn;
  private long customerId;
  private String shippingUser;
  private long province;
  private long city;
  private long district;
  private String address;
  private long paymentMethod;
  private double orderMoney;
  private double districtMoney;
  private double shippingMoney;
  private double paymentMoney;
  private String shippingCompName;
  private String shippingSn;
  private Date createTime;
  private Date shippingTime;
  private Date payTime;
  private Date receiveTime;
  private long orderStatus;
  private long orderPoint;
  private String invoiceTime;
  private Date modifiedTime;


}
