package com.usercenter.service.impl;

import com.usercenter.entity.TsRoleResource;
import com.usercenter.mapper.TsRoleResourceMapper;
import com.usercenter.service.ITsRoleResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色-资源中间表 服务实现类
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
@Service
public class TsRoleResourceService extends ServiceImpl<TsRoleResourceMapper, TsRoleResource> implements ITsRoleResourceService {

}
