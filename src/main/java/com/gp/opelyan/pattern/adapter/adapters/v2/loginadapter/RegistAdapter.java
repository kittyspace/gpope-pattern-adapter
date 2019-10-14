package com.gp.opelyan.pattern.adapter.adapters.v2.loginadapter;


import com.gp.opelyan.pattern.adapter.adapters.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
