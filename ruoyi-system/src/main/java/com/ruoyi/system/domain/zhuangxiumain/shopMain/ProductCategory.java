package com.ruoyi.system.domain.zhuangxiumain.shopMain;


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

  private long categoryId;
  private long brandId;
  private String categoryName;
  private String categoryCode;
  private long parentId;
  private long categoryLevel;
  private long categoryStatus;
  private Date modifiedTime;




}
