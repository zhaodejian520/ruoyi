package com.ruoyi.system.service.zhaungxiuservice.shopService;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductComment;

import java.util.List;

public interface ProductCommentService {

    public ProductComment findAllById(Long productid);

    public List<ProductComment> findAllList(ProductComment productComment, Long userId);
    // 修改 状态 已审核
    public int updateStatus(ProductComment productComment);

    public int deleteProductById(Long[] commentId);

}
