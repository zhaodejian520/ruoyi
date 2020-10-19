package com.ruoyi.system.service.zhaungxiuservice.shopService.impl;

import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.system.domain.zhuangxiumain.shopMain.TyjrNoticeFile;
import com.ruoyi.system.mapper.zhuangxiumapper.shopMapper.TyjrNoticeFileMapper;
import com.ruoyi.system.service.zhaungxiuservice.shopService.TyjrNoticeFileService;
import com.ruoyi.system.utils.FileUtil;
import com.ruoyi.system.utils.IdentifiedGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class TyjrNoticeFileServiceImpl implements TyjrNoticeFileService {

    @Autowired(required = false)
    private TyjrNoticeFileMapper tyjrNoticeFileMapper;

    @Override
    public String addTyjrNoticeFile(HttpServletRequest request) {
        System.err.println(request);
        try {
            List<Map<String,Object>> uploadResultList = FileUtil.upload(request);
            System.err.println("+++++++++++++++111111111111111111+++++++++++++");
            String token = IdentifiedGenerator.generate();
            Integer effectFlag = 0;
            System.err.println("+++++++++++++++222222222222222222+++++++++++++");
            for (Map<String,Object> uploadResultMap : uploadResultList){
                String showName = (String) uploadResultMap.get("showName");
                String savePath = (String) uploadResultMap.get("savePath");
                System.err.println("+++++++++++++++333333333333333+++++++++++++");
                TyjrNoticeFile noticeFile = new TyjrNoticeFile();
                noticeFile.setId(IdentifiedGenerator.generate());
                noticeFile.setAttachmentPath(savePath);
                noticeFile.setNoticeId(token);
                noticeFile.setCategoryId(1);
                System.err.println("+++++++++++++++444444444444444+++++++++++++");
                Integer effect = this.tyjrNoticeFileMapper.insertNoticeFile(noticeFile);
                if (effect == 1){
                    System.err.println("+++++++++++++++555555555555+++++++++++++");
                    effectFlag++;
                }
            }

            if (effectFlag == uploadResultList.size()){
                return token;
            }


        }catch (IOException e){
            e.printStackTrace();
        }



        return null;
    }
}
