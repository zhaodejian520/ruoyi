package com.ruoyi.system.domain.zhuangxiumain.shopMain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 *标签表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("product_label")
public class ProductLabel implements Serializable {

  private static final long serialVersionUID = 1L;
  @TableId(value = "label_id",type = IdType.ID_WORKER_STR)
  private long labelId;

  @TableField("product_id")
  private long productId;

  @TableField("label_name")
  private String labelName;




}
