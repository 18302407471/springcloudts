package com.usercenter.service;

import com.usercenter.entity.TsUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 后台登录的用户 服务类
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
public interface ITsUserService extends IService<TsUser> {

    /***
     * @description: 根据用户名获取用户信息
     * @param userName
     * @return com.usercenter.entity.TsUser
     * @author dhl
     * @date 2019/9/9 14:35
     */
    TsUser queryUserByUserName(@Param("userName") String userName);
}
