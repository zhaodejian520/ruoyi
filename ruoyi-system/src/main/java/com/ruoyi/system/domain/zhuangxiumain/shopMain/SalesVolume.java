package com.ruoyi.system.domain.zhuangxiumain.shopMain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 *销量表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("sales_volume")
public class SalesVolume implements Serializable {

  private static final long serialVersionUID = 1L;

  @TableId(value = "sales_id",type = IdType.ID_WORKER_STR)
  private long salesId;

  @TableField("product_id")
  private long productId;

  @TableField("sales_quantity")
  private long salesQuantity;




}
