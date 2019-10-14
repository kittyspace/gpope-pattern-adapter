package com.gp.opelyan.pattern.adapter.adapters.v2;

import com.gp.opelyan.pattern.adapter.adapters.ResultMsg;

/**
 * 只扩展
 * Created by Tom on 2019/3/16.
 */
public interface IPassportForThird {

    /**
     * QQ登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

}
