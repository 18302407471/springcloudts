package com.usercenter.controller;


import com.usercenter.common.shiro.JwtToken;
import com.usercenter.common.shiro.JwtUtil;
import com.usercenter.entity.TsUser;
import com.usercenter.service.ITsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 后台登录的用户 前端控制器
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
@RestController
@RequestMapping("/tsUser")
public class TsUserController {

    @Autowired
    ITsUserService iTsUserService;

    @PostMapping(value = "/login")
    public String login(@RequestBody TsUser tsUser){
        TsUser tsUser1 = iTsUserService.queryUserByUserName(tsUser.getUsername());
        String token = JwtUtil.sign(tsUser1.getUsername(),tsUser1.getPassword());
        return token;
    }

}

