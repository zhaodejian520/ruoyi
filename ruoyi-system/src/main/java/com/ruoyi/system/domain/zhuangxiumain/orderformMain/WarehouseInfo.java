package com.ruoyi.system.domain.zhuangxiumain.orderformMain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
/**
 *仓库信息表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WarehouseInfo implements Serializable {

  private static final long serialVersionUID = 1L;

  private long wId;
  private String warehouseSn;
  private String warehoustName;
  private String warehousePhone;
  private String contact;
  private long province;
  private long city;
  private long distrct;
  private String address;
  private long warehouseStatus;
  private Date modifiedTime;



}
