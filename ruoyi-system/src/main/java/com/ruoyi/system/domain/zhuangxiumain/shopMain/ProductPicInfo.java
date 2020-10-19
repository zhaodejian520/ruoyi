package com.ruoyi.system.domain.zhuangxiumain.shopMain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
/***
 * 商品图片信息表
 *
 * ***/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("product_pic_info")
public class ProductPicInfo implements Serializable {

    @TableId(value = "product_pic_id",type = IdType.ID_WORKER_STR)
    private Long productpicid;

    @TableField("product_id")
    private Long productid;

    @TableField("pic_desc")
    private String picdesc;

    @TableField("pic_url")
    private String picurl;

    @TableField("is_master")
    private Integer ismaster;

    @TableField("pic_order")
    private Integer picorder;

    @TableField("pic_status")
    private Integer picstatus;

    @TableField("product_id")
    private Timestamp modifiedtime;


}
