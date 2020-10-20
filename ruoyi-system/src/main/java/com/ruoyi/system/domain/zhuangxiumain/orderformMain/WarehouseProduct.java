package com.ruoyi.system.domain.zhuangxiumain.orderformMain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 *商品库存表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WarehouseProduct implements Serializable {

  private static final long serialVersionUID = 1L;
  @TableId(value = "wp_id",type = IdType.ID_WORKER_STR)
  private long wpId;

  @TableField("product_id")
  private long productId;

  @TableField("w_id")
  private long wId;

  @TableField("current_cnt")
  private long currentCnt;

  @TableField("lock_cnt")
  private long lockCnt;

  @TableField("in_transit_cnt")
  private long inTransitCnt;

  @TableField("average_cost")
  private double averageCost;

  @TableField("modified_time")
  private Date modifiedTime;



}
