package com.ruoyi.system.mapper.zhuangxiumapper.shopMapper;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductComment;

import java.util.List;

public interface ProductCommentMapper {

    public List<ProductComment> findAllList(ProductComment productComment);

    public ProductComment findAllById(ProductComment productComment);

    public int updateStatus(ProductComment productComment);

    public int deleteProductById(Long[] commentId);

}
