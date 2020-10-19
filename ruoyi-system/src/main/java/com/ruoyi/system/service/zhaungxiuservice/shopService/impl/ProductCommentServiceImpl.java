package com.ruoyi.system.service.zhaungxiuservice.shopService.impl;

import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductComment;
import com.ruoyi.system.mapper.zhuangxiumapper.shopMapper.ProductCommentMapper;
import com.ruoyi.system.service.zhaungxiuservice.shopService.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class ProductCommentServiceImpl implements ProductCommentService {

    @Autowired(required = false)
    private ProductCommentMapper productCommentMapper;

    @Override
    public ProductComment findAllById(Long productid) {
        ProductComment productComment1 = new ProductComment();
        productComment1.setProductId(productid);
        return productCommentMapper.findAllById(productComment1);
    }

    @Override
    public List<ProductComment> findAllList(ProductComment productComment, Long userId) {
        return productCommentMapper.findAllList(productComment);
    }

    @Override
    public int updateStatus(ProductComment productComment) {
        return productCommentMapper.updateStatus(productComment);
    }

    @Override
    public int deleteProductById(Long[] commentId) {
        return productCommentMapper.deleteProductById(commentId);
    }
}
