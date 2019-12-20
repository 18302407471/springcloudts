package com.usercenter.mapper;

import com.usercenter.entity.TsUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 后台登录的用户 Mapper 接口
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
public interface TsUserMapper extends BaseMapper<TsUser> {

    /***
     * @description: 根据用户名获取用户信息
     * @param userName
     * @return com.usercenter.entity.TsUser
     * @author dhl
     * @date 2019/9/9 14:35
     */
    TsUser queryUserByUserName(String userName);
}
