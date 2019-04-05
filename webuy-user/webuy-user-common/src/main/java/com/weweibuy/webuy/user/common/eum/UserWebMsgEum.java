package com.weweibuy.webuy.user.common.eum;

import com.weweibuy.webuy.common.response.WebCodeAndMsg;

/**
 * @ClassName UserWebMsgEum
 * @Description
 * @Author durenhao
 * @Date 2018/12/1 9:19
 **/
public enum UserWebMsgEum implements WebCodeAndMsg {


    UNKNOWN_WRONG(10000, "未知错误"),
    PHONE_NUM_PATTERN_WRONG(10001, "手机号码格式错误"),
    GET_VERIFICATION_CODE_TOO_FREQUENT(10002, "手机验证码获取太频繁，稍后再试"),
    USERNAME_OR_PWD_NOT_NULL(10003, "用户名或密码不能为空"),
    PARAM_WRONG(10004, "输入参数错误"),
    VERIFICATION_CODE_WRONG(10005, "手机验证码错误"),
    DO_NOT_RESUBMIT(10006, "请勿重提交"),
    PARAM_BLANK(10007, "输入参数为空"),
    USER_INFO_NOT_EXIST(10008, "用户信息不存在"),
    USER_EXIST(10009, "用户已经存在"),

    ;

    private Integer code;
    private String msg;

    private UserWebMsgEum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

}
