package com.ruoyi.web.controller.zhuangxiucontroller.shopController;

import com.ruoyi.system.service.zhaungxiuservice.shopService.TyjrNoticeFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/notice")
public class TyjrNoticeFileController {

    @Autowired
    private TyjrNoticeFileService tyjrNoticeFileService;

    @RequestMapping(value = "/addNoticeFile")
    @ResponseBody
    public Object addNoticeFile(HttpServletRequest request){
        System.err.println("+++++++++++++++66666666666666666+++++++++++++");
        String token = this.tyjrNoticeFileService.addTyjrNoticeFile(request);
        System.err.println(token.toString());
        System.err.println(token);
        System.err.println("+++++++++++++++77777777777777777+++++++++++++");
        return token;
    }


}
