package com.weweibuy.webuy.auth.core.social.weixin.connection;

import com.weweibuy.webuy.auth.core.model.vo.WeiXinUserInfo;
import com.weweibuy.webuy.auth.core.social.weixin.api.WeiXin;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;

/**
 * @ClassName WeiXinApiAdapter
 * @Description
 * @Author durenhao
 * @Date 2018/12/23 23:09
 **/
public class WeiXinApiAdapter implements ApiAdapter<WeiXin> {

    /**
     * 这里的openid 是为了获取微信的 WeiXinUserInfo；
     * 因为微信的api要求传入openid 获取用户信息
     */
    private String openid;

    public WeiXinApiAdapter(){
    }

    public WeiXinApiAdapter(String openid){
        this.openid = openid;
    }

    @Override
    public boolean test(WeiXin weiXin) {
        return true;
    }

    @Override
    public void setConnectionValues(WeiXin weiXin, ConnectionValues connectionValues) {
        // TODO 这里要传入openid
        WeiXinUserInfo userInfo = weiXin.getWeiXinUserInfo(openid);
        connectionValues.setDisplayName(userInfo.getNickname());
        connectionValues.setProviderUserId(userInfo.getOpenid());
        connectionValues.setProfileUrl(null);
        connectionValues.setImageUrl(userInfo.getHeadimgurl());
    }

    @Override
    public UserProfile fetchUserProfile(WeiXin weiXin) {
        return null;
    }

    @Override
    public void updateStatus(WeiXin weiXin, String s) {

    }
}
