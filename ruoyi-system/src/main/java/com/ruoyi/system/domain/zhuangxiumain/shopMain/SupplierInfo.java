package com.ruoyi.system.domain.zhuangxiumain.shopMain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("supplier_info")
public class SupplierInfo implements Serializable {

    @TableId(value = "supplier_id",type = IdType.ID_WORKER_STR)
    private Long supplierid;

    @TableField("supplier_code")
    private String suppliercode;

    @TableField("supplier_name")
    private String suppliername;

    @TableField("supplier_type")
    private Integer suppliertype;

    @TableField("supplier_typeform")
    private Integer suppliertypeform;

    @TableField("link_man")
    private String linkman;

    @TableField("phone_number")
    private String phonenumber;

    @TableField("bank_name")
    private String bankname;

    @TableField("bank_account")
    private String bankaccount;

    @TableField("address")
    private String address;


    @TableField("supplier_status")
    private Integer supplierstatus;

    @TableField("modified_time")
    private Timestamp modifiedtime;

    @TableField("supplier_info")
    private String supplierinfo;

    @TableField("shops_name")
    private String shopsname;

}
