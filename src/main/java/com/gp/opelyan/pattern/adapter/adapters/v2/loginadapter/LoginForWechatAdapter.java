package com.gp.opelyan.pattern.adapter.adapters.v2.loginadapter;


import com.gp.opelyan.pattern.adapter.adapters.ResultMsg;

public class LoginForWechatAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
