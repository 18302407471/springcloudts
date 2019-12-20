package com.usercenter.common.shiro;

import com.usercenter.entity.TsUser;
import com.usercenter.service.ITsResourceService;
import com.usercenter.service.ITsUserService;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRealm extends AuthorizingRealm {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private ITsUserService tsUserService;

    @Autowired
    private ITsResourceService tsResourceService;


    /**
     * 必须重写此方法，不然Shiro会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /**
     * 授权
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        TsUser tsUser = (TsUser) principals.getPrimaryPrincipal();
//        List<String> sysPermissions = sysPermissionService.selectPermissionByUserId(tsUser.getId());

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addStringPermissions(sysPermissions);
        LOGGER.info("doGetAuthorizationInfo");
        return info;
    }

    /**
     * 认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = (String) authenticationToken.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JwtUtil.getUsername(token);
        if (StringUtils.isEmpty(username)){
            throw new AuthenticationException("token无效");
        }
        TsUser tsUser = tsUserService.queryUserByUserName(username);
        if (tsUser == null) {
            throw new AuthenticationException("用户不存在!");
        }
        if (!JwtUtil.verify(token, username, tsUser.getPassword())) {
            throw new AuthenticationException("用户名或密码错误");
        }
        return new SimpleAuthenticationInfo(token, token, getName());
    }
}