package com.usercenter.service.impl;

import com.usercenter.entity.TsMemberInfo;
import com.usercenter.mapper.TsMemberInfoMapper;
import com.usercenter.service.ITsMemberInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员信息表 服务实现类
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
@Service
public class TsMemberInfoService extends ServiceImpl<TsMemberInfoMapper, TsMemberInfo> implements ITsMemberInfoService {

}
