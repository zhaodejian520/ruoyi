package com.ruoyi.system.domain.zhuangxiumain.shopMain;


import java.io.Serializable;

public class TyjrNoticeFile implements Serializable {

  private static final long serialVersionUID = 8787736900574940057L;

  private String id;
  private String noticeId;
  private String attachmentName;
  private String attachmentPath;
  private long categoryId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getNoticeId() {
    return noticeId;
  }

  public void setNoticeId(String noticeId) {
    this.noticeId = noticeId;
  }


  public String getAttachmentName() {
    return attachmentName;
  }

  public void setAttachmentName(String attachmentName) {
    this.attachmentName = attachmentName;
  }


  public String getAttachmentPath() {
    return attachmentPath;
  }

  public void setAttachmentPath(String attachmentPath) {
    this.attachmentPath = attachmentPath;
  }


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }

}
