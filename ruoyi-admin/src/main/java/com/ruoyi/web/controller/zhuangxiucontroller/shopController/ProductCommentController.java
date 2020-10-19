package com.ruoyi.web.controller.zhuangxiucontroller.shopController;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.framework.web.service.TokenService;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.ProductComment;
import com.ruoyi.system.service.zhaungxiuservice.shopService.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productcomment")
public class ProductCommentController extends BaseController {

    @Autowired(required = false)
    private ProductCommentService productCommentService;

    @Autowired(required = false)
    private TokenService tokenService;

    @GetMapping(value = "/{productId}")
    public AjaxResult findAllById(@PathVariable Long productid){
        return AjaxResult.success(productCommentService.findAllById(productid));
    }

    @GetMapping(value = "/findAllList")
    public AjaxResult findAllList(ProductComment productComment){
        startPage();
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        System.err.println("==============333333333333333333333"+ loginUser);
        //获取用户的ID
        Long userId = loginUser.getUser().getUserId();
        System.err.println("==============222222222222222222222"+ userId);
//        productComment.setCustomerId(userId);
        // 测试一下看看能不能用
        //刚那会忘了怎么弄得了 从新再弄一遍
        List<ProductComment> list = productCommentService.findAllList(productComment, userId);
        return AjaxResult.success(list);
    }

    @Log(title = "修改状态", businessType = BusinessType.UPDATE)
    @PutMapping("/updataByOneId")
    public AjaxResult updataByOneId(@RequestBody ProductComment productComment){
        return toAjax(productCommentService.updateStatus(productComment));
    }

    /**
     * 批量删除
     * */
    @Log(title = "参数数据", businessType = BusinessType.DELETE)
    @DeleteMapping("/{commentId}")
    public AjaxResult deleteProductById(@RequestBody Long[] commentId){
        return toAjax(productCommentService.deleteProductById(commentId));
    }






}
