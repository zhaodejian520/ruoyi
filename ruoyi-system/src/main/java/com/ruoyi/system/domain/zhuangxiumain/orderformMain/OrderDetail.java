package com.ruoyi.system.domain.zhuangxiumain.orderformMain;


import lombok.*;

import java.io.Serializable;
import java.util.Date;
/**
 *订单详情表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private long orderDetailId;
  private long orderId;
  private long productId;
  private String productName;
  private long productCnt;
  private double productPrice;
  private double averageCost;
  private double weight;
  private double feeMoney;
  private long wId;
  private Date modifiedTime;



}
