package com.gp.opelyan.pattern.adapter.adapters.v2.loginadapter;


import com.gp.opelyan.pattern.adapter.adapters.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
