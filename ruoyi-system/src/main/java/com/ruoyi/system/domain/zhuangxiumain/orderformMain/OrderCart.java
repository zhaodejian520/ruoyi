package com.ruoyi.system.domain.zhuangxiumain.orderformMain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
/**
 *购物车表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderCart implements Serializable{

    private static final long serialVersionUID = 1L;

  private long cartId;
  private long customerId;
  private long productId;
  private long productAmount;
  private double price;
  private Date addTime;
  private Date modifiedTime;



}
