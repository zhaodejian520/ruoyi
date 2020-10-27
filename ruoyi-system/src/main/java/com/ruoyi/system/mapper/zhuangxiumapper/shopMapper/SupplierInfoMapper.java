package com.ruoyi.system.mapper.zhuangxiumapper.shopMapper;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.SupplierInfo;

import java.util.List;

public interface SupplierInfoMapper {
    // 查询供应商信息
    public List<SupplierInfo> selectSupplierInfoList(SupplierInfo supplierInfo);


    /**
     * 根据所有供应商
     *
     * @return 供应商集合信息
     */
    public List<SupplierInfo> selectSuppTypeAll();

    /**
     * 根据字典类型ID查询信息
     *
     * @param supplierId 供应商类型ID
     * @return 供应商类型
     */
    public SupplierInfo selectSuppTypeById(Integer supplierId);


    /**
     * 根据字典类型查询信息
     *
     * @param supplierName 供应商
     * @return 供应商
     */
    public SupplierInfo selectSuppTypeByType(String supplierName);

    /**
     * 校验供应商称是否唯一
     *
     * @param supplierName 供应商
     * @return 结果
     */
    public SupplierInfo checkSuppTypeUnique(String supplierName);




}
