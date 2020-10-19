package com.ruoyi.system.domain.zhuangxiumain.vo;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductInfoVo extends BaseEntity {

    private Long productid;
    private String productname;
    private BigDecimal price;
    private String descript;
    private long currentCnt;
    private String productcore;
    private long cornerQuantity;
    private String labelName;
    private long salesQuantity;
}
