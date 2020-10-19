
package com.ruoyi.system.domain.zhuangxiumain.shopMain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

/**
 *角标表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("corner_mark")
public class CornerMark implements Serializable {

  private static final long serialVersionUID = 1L;
  @TableId(value = "cornemark_id",type = IdType.ID_WORKER_STR)
  private long cornemarkId;
  @TableField("product_id")
  private long productId;
  @TableField("corner_quantity")
  private long cornerQuantity;



}
