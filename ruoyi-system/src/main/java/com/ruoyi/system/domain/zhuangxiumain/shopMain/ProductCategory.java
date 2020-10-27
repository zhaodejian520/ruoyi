package com.ruoyi.system.domain.zhuangxiumain.shopMain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;

import java.util.Date;

/**
 *分类信息表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCategory extends BaseEntity {

  private static final long serialVersionUID = 1L;

  /** 分类ID */
  private Integer categoryId;

  /** brand_info表的自增ID */
  @Excel(name = "brand_info表的自增ID")
  private Integer brandId;

  /** 分类名称 */
  @Excel(name = "分类名称")
  private String categoryName;

  /** 分类编码 */
  @Excel(name = "分类编码")
  private String categoryCode;

  /** 父分类ID */
  @Excel(name = "父分类ID")
  private Integer parentId;

  /** 分类层级 */
  @Excel(name = "分类层级")
  private Integer categoryLevel;

  /** 分类状态 */
  @Excel(name = "分类状态")
  private Integer categoryStatus;

  /** 最后修改时间 */
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Excel(name = "最后修改时间", width = 30, dateFormat = "yyyy-MM-dd")
  private Date modifiedTime;

  /** 分类状态 */
  @Excel(name = "用户ID")
  private Integer customerId;

  /** 分类状态 */
  @Excel(name = "用户ID")
  private Long userId;


}
