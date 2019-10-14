package com.gp.opelyan.pattern.adapter.adapters.v2.loginadapter;


import com.gp.opelyan.pattern.adapter.adapters.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
