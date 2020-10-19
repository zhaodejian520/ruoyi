package com.ruoyi.system.response;

public enum ResultCode {
    SUCCESS(true,10000,"操作成功！"),

    FAIL(false,10001,"操作失败"),
    UNAUTHENTICATED(false,10002,"您还未登录"),

    UNAUTHORISE(false,10003,"权限不足"),
    LOGIN_TIME_OUT(false,99998,"已超时,请重新登录"),
    SERVER_ERROR(false,99999,"抱歉，系统繁忙，请稍后重试！"),

    MOBILEORPASSWORDERROR(false,20001,"用户名或密码错误"),

    USERNAME_PASSWORD_ISNULL(false,20002,"用户名或密码为空"),
    //权限 ------------------
    PERMISSION_IN_ROLE_HAS_DATA(false,11111,"无法删除权限,因为角色已经绑定了该权限"),


    //课程------------------
    CURRICULUM_HAS_CHAPTER(false,30001,"课程中存在章节"),




    DEPARTMENT_HAS_USERS(false,30001,"部门存在员工,无法删除");


    //---权限操作返回码----
    //---其他操作返回码----

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    ResultCode(boolean success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}
