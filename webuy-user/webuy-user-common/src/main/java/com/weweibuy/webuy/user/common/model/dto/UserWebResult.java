package com.weweibuy.webuy.user.common.model.dto;

import com.weweibuy.webuy.common.dto.CommonJsonResponse;
import com.weweibuy.webuy.common.eum.CommonStatus;
import com.weweibuy.webuy.user.common.eum.UserWebMsgEum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserWebResult
 * @Description
 * @Author durenhao
 * @Date 2018/12/1 9:41
 **/
@Data
@NoArgsConstructor
public class UserWebResult<T> extends CommonJsonResponse<T> {


    public UserWebResult(CommonStatus status, Integer code, String msg, T data){
        super(status.toString(), code, msg, data);
    }


    public static UserWebResult fail(){
        return new UserWebResult(CommonStatus.FAIL, UserWebMsgEum.UNKNOWN_WRONG.getCode(),
                UserWebMsgEum.UNKNOWN_WRONG.getMsg(), null);
    }

    public static UserWebResult fail(Object data){
        return new UserWebResult(CommonStatus.FAIL, UserWebMsgEum.UNKNOWN_WRONG.getCode(),
                UserWebMsgEum.UNKNOWN_WRONG.getMsg(), data);
    }

    public static UserWebResult fail(UserWebMsgEum userWebMsgEum){
        return new UserWebResult(CommonStatus.FAIL, userWebMsgEum.getCode(),
                userWebMsgEum.getMsg(), null);
    }

    public static UserWebResult fail(UserWebMsgEum eum, Object data){
        return new UserWebResult(CommonStatus.FAIL, eum.getCode(),
                eum.getMsg(), data);
    }

    public static UserWebResult paramWrong(){
        return new UserWebResult(CommonStatus.FAIL, UserWebMsgEum.PARAM_WRONG.getCode(),
                UserWebMsgEum.PARAM_WRONG.getMsg(), null);
    }

    public static UserWebResult paramBlank(){
        return new UserWebResult(CommonStatus.FAIL, UserWebMsgEum.PARAM_BLANK.getCode(),
                UserWebMsgEum.PARAM_BLANK.getMsg(), null);
    }

    public static UserWebResult success(){
        return new UserWebResult(CommonStatus.SUCCESS, null, null, null);
    }

    public static UserWebResult success(Object data){
        return new UserWebResult(CommonStatus.SUCCESS, null,
                null, data);
    }



}
