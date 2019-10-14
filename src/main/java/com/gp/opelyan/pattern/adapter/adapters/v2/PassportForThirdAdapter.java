package com.gp.opelyan.pattern.adapter.adapters.v2;

import com.gp.opelyan.pattern.adapter.adapters.ResultMsg;
import com.gp.opelyan.pattern.adapter.adapters.v1.SiginService;
import com.gp.opelyan.pattern.adapter.adapters.v2.loginadapter.LoginAdapter;
import com.gp.opelyan.pattern.adapter.adapters.v2.loginadapter.LoginForQQAdapter;
import com.gp.opelyan.pattern.adapter.adapters.v2.loginadapter.LoginForTokenAdapter;
import com.gp.opelyan.pattern.adapter.adapters.v2.loginadapter.LoginForWechatAdapter;

/**
 * 结合策略模式、工厂模式、适配器模式
 * Created by Tom on 2019/3/16.
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {

    public ResultMsg loginForQQ(String id) {
//        return processLogin(id,RegistForQQAdapter.class);
        return processLogin(id, LoginForQQAdapter.class);
    }

    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);
    }

    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }


    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try{
            //适配器不一定要实现接口
            LoginAdapter adapter = clazz.newInstance();

            //判断传过来的适配器是否能处理指定的逻辑
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
