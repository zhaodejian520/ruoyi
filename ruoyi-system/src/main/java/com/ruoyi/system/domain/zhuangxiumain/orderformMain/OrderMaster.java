package com.ruoyi.system.domain.zhuangxiumain.orderformMain;



import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
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

  /** 订单ID */
  private Integer orderId;

  /** 订单编号 yyyymmddnnnnnnnn */
  @Excel(name = "订单编号 yyyymmddnnnnnnnn")
  private Long orderSn;

  /** 下单人ID */
  @Excel(name = "下单人ID")
  private Integer customerId;

  /** 收货人姓名 */
  @Excel(name = "收货人姓名")
  private String shippingUser;

  /** 省 */
  @Excel(name = "省")
  private Integer province;

  /** 市 */
  @Excel(name = "市")
  private Integer city;

  /** 区 */
  @Excel(name = "区")
  private Integer district;

  /** 地址 */
  @Excel(name = "地址")
  private String address;

  /** 支付方式：1现金，2余额，3网银，4支付宝，5微信 */
  @Excel(name = "支付方式：1现金，2余额，3网银，4支付宝，5微信")
  private Integer paymentMethod;

  /** 订单金额 */
  @Excel(name = "订单金额")
  private BigDecimal orderMoney;

  /** 优惠金额 */
  @Excel(name = "优惠金额")
  private BigDecimal districtMoney;

  /** 运费金额 */
  @Excel(name = "运费金额")
  private BigDecimal shippingMoney;

  /** 支付金额 */
  @Excel(name = "支付金额")
  private BigDecimal paymentMoney;

  /** 快递公司名称 */
  @Excel(name = "快递公司名称")
  private String shippingCompName;

  /** 快递单号 */
  @Excel(name = "快递单号")
  private String shippingSn;

  /** 发货时间 */
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Excel(name = "发货时间", width = 30, dateFormat = "yyyy-MM-dd")
  private Date shippingTime;

  /** 支付时间 */
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Excel(name = "支付时间", width = 30, dateFormat = "yyyy-MM-dd")
  private Date payTime;

  /** 收货时间 */
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Excel(name = "收货时间", width = 30, dateFormat = "yyyy-MM-dd")
  private Date receiveTime;

  /** 订单状态 */
  @Excel(name = "订单状态")
  private Integer orderStatus;

  /** 订单积分 */
  @Excel(name = "订单积分")
  private Integer orderPoint;

  /** 发票抬头 */
  @Excel(name = "发票抬头")
  private String invoiceTime;

  /** 最后修改时间 */
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Excel(name = "最后修改时间", width = 30, dateFormat = "yyyy-MM-dd")
  private Date modifiedTime;



  private String userName;
  private String productName;
  private double productPrice;
  private long userId;
  private long productId;



}
