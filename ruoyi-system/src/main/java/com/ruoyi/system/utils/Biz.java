package com.ruoyi.system.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "biz")
public class Biz {
    private String fileUploadPath;
    private String conferenceFileUploadPath;
    public String getFileUploadPath() {
        return fileUploadPath;
    }

    public void setFileUploadPath(String fileUploadPath) {
        this.fileUploadPath = fileUploadPath;
    }

    public String getConferenceFileUploadPath() {
        return conferenceFileUploadPath;
    }

    public void setConferenceFileUploadPath(String conferenceFileUploadPath) {
        this.conferenceFileUploadPath = conferenceFileUploadPath;
    }
}

