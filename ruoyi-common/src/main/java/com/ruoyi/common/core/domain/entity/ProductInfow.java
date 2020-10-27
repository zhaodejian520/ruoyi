package com.ruoyi.common.core.domain.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 *商品信息表
 *赵德健
 * */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductInfow extends BaseEntity  {

    private static final long serialVersionUID = 1L;

    /** 商品ID */
    private Integer productId;

    /** 商品编码 */
    @Excel(name = "商品编码")
    private String productCore;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String productName;

    /** 国条码 */
    @Excel(name = "国条码")
    private String barCode;

    /** 品牌表的ID */
    @Excel(name = "品牌表的ID")
    private Integer brandId;

    /** 一级分类ID */
    @Excel(name = "一级分类ID")
    private Integer oneCategoryId;

    /** 二级分类ID */
    @Excel(name = "二级分类ID")
    private Integer twoCategoryId;

    /** 三级分类ID */
    @Excel(name = "三级分类ID")
    private Integer threeCategoryId;

    /** 商品的供应商ID */
    @Excel(name = "商品的供应商ID")
    private Integer supplierId;

    /** 商品的分类ID */
    @Excel(name = "商品的分类ID")
    private Integer categoryId;

    /** 商品销售价格 */
    @Excel(name = "商品销售价格")
    private BigDecimal price;

    /** 商品加权平均成本 */
    @Excel(name = "商品加权平均成本")
    private BigDecimal averageCost;

    /** 上下架状态：0下架1上架 */
    @Excel(name = "上下架状态：0下架1上架")
    private Integer publishStatus;

    /** 审核状态：0未审核，1已审核 */
    @Excel(name = "审核状态：0未审核，1已审核")
    private Integer auditStatus;

    /** 商品重量 */
    @Excel(name = "商品重量")
    private Long weight;

    /** 商品长度 */
    @Excel(name = "商品长度")
    private Long length;

    /** 商品高度 */
    @Excel(name = "商品高度")
    private Long height;

    /** 商品宽度 */
    @Excel(name = "商品宽度")
    private Long width;

    /** $column.columnComment */
    @Excel(name = "商品宽度")
    private String colorType;

    /** 生产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date productionDate;

    /** 商品有效期 */
    @Excel(name = "商品有效期")
    private Long shelfLife;

    /** 商品描述 */
    @Excel(name = "商品描述")
    private String descript;

    /** 商品录入时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "商品录入时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date indate;

    /** 最后修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifiedTime;

    /** $column.columnComment */
    @Excel(name = "最后修改时间")
    private Long cornerQuantity;

    /** $column.columnComment */
    @Excel(name = "最后修改时间")
    private String labelName;

    /** $column.columnComment */
    @Excel(name = "最后修改时间")
    private Long salesQuantity;




    /***
     * 商品库存字段
     * ***/

    @TableId(value = "wp_id",type = IdType.ID_WORKER_STR)
    private long wpId;



    @TableField("w_id")
    private long wId;

    @TableField("current_cnt")
    private long currentCnt;

    @TableField("lock_cnt")
    private long lockCnt;

    @TableField("in_transit_cnt")
    private long inTransitCnt;






}
