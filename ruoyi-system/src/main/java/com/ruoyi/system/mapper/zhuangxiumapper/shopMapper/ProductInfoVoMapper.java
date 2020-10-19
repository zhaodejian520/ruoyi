package com.ruoyi.system.mapper.zhuangxiumapper.shopMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.system.domain.zhuangxiumain.vo.ProductInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


public interface ProductInfoVoMapper {


   public ProductInfoVo selectConfig(ProductInfoVo productInfoVo);

   public List<ProductInfoVo> selectConfigList(ProductInfoVo productInfoVo);

//    @Select(" <script> select DISTINCT pi.product_name as '商品名称',pi.price as '金额',pi.descript as '商品描述',wp.current_cnt as '商品数量',pi.product_core as '商品编码',cm.corner_quantity as '角标数量',pl.label_name as '标签名称',sv.sales_quantity as '角标数量'   \n" +
//            " from product_info pi,product_pic_info ppi,supplier_info si,warehouse_product wp,corner_mark cm,product_label pl,sales_volume sv \n" +
//            " where pi.product_id = ppi.product_id and si.supplier_id=pi.supplier_id and wp.product_id=pi.product_id  \n" +
//            " and pi.product_id=pl.product_id and pi.product_id=cm.product_id and sv.product_id = pi.product_id  \n" +
//            " limit #{page},#{size} </script> ")
//    List<ProductInfoVo> getPage(@Param("page") Integer page, @Param("size") Integer size);
//    @Select(" <script> select count(*)\n" +
//            " from product_info pi,product_pic_info ppi,supplier_info si,warehouse_product wp,corner_mark cm,product_label pl,sales_volume sv  \n" +
//            " where pi.product_id = ppi.product_id and si.supplier_id=pi.supplier_id and wp.product_id=pi.product_id   \n" +
//            " and pi.product_id=pl.product_id and pi.product_id=cm.product_id and sv.product_id = pi.product_id  </script> ")
//    Integer getTotal(Map<String,Object> map);



}
