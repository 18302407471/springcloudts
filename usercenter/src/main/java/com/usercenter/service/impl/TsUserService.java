package com.usercenter.service.impl;

import com.usercenter.entity.TsUser;
import com.usercenter.mapper.TsUserMapper;
import com.usercenter.service.ITsUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台登录的用户 服务实现类
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
@Service
public class TsUserService extends ServiceImpl<TsUserMapper, TsUser> implements ITsUserService {

    @Autowired
    TsUserMapper tsUserMapper;

    @Override
    public TsUser queryUserByUserName(String userName) {
        return tsUserMapper.queryUserByUserName(userName);
    }
}
