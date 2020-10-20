package com.ruoyi.system.domain.zhuangxiumain.shopMain;


import lombok.*;

import java.io.Serializable;
import java.util.Date;
/**
 *评论表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductComment implements Serializable {

  private static final long serialVersionUID = 1L;
  private long commentId;
  private long productId;
  private long orderId;
  private long customerId;
  private String title;
  private String content;
  private long auditStatus;
  private Date auditTime;
  private Date modifiedTime;



  private long orderSn;
  private String productName;
  private String userName;
  private long userId;


}
