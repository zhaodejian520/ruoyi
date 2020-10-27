package com.ruoyi.system.domain.zhuangxiumain.shopMain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
/**
 * 供应商信息对象 supplier_info
 *
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierInfo implements Serializable {

    /** 供应商ID */
    private Integer supplierId;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String supplierCode;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 供应商类型：1.自营，2.平台 */
    @Excel(name = "供应商类型：1.自营，2.平台")
    private Integer supplierType;

    /** 店铺类型：1.物品，2.技术 */
    @Excel(name = "店铺类型：1.物品，2.技术")
    private Integer supplierTypeform;

    /** 供应商联系人 */
    @Excel(name = "供应商联系人")
    private String linkMan;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phoneNumber;

    /** 供应商开户银行名称 */
    @Excel(name = "供应商开户银行名称")
    private String bankName;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String bankAccount;

    /** 供应商地址 */
    @Excel(name = "供应商地址")
    private String address;

    /** 状态：0禁止，1启用 */
    @Excel(name = "状态：0禁止，1启用")
    private Integer supplierStatus;

    /** 最后修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifiedTime;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String shopsName;

}
