package com.usercenter.common.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author ：dhl
 * @date ： 2019/9/9 15:52
 * @description：自定义token 用来包装token
 * @version: v1.0
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
