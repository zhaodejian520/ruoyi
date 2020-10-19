package com.ruoyi.system.domain.zhuangxiumain.shopMain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
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
public class ProductInfo extends BaseEntity  {

    private static final long serialVersionUID = 1L;

    private Long productid;


    private String productcore;

    private String productname;

    private String barcode;

    private Long brandid;


    private Integer onecategoryid;


    private Integer twocategoryid;


    private Integer threecategoryid;


    private Long supplierid;


    private Long categoryid;


    private BigDecimal price;


    private BigDecimal averagecost;


    private Long publishstatus;


    private Long auditstatus;


    private Float weight;


    private Float length;


    private Float height;


    private Float width;


    private String colortype;

    private Date productiondate;



    private Long shelflife;


    private String descript;



    private Timestamp indate;


    private Timestamp modifiedtime;


    private long salesQuantity;


    private String labelName;


    private long cornerQuantity;




    /***
     * 商品库存字段
     * ***/

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
