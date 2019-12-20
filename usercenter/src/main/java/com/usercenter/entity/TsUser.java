package com.usercenter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 后台登录的用户
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
public class TsUser extends Model<TsUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键标识
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码，AES加密
     */
    private String password;
    /**
     * 姓名
     */
    private String realname;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 部门ID
     */
    private String deptId;
    /**
     * 1:有效，0：无效，无效时禁止登录
     */
    private Double isValid;
    /**
     * 删除时在用户管理无法显示出来，也没法登录
     */
    private Double isDel;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 创建人用户名
     */
    private String operUsername;
    /**
     * 角色ID
     */
    private String roleId;
    /**
     * 会员ID
     */
    private String memberId;
    /**
     * 分检中心ID
     */
    private String sortCheckId;
    /**
     * 起始有效时间
     */
    private String effectiveStartTime;
    /**
     * 截止有效时间
     */
    private String effectiveEndTime;
    /**
     * 申请汇集服务有效链接http://ip:port/c/uid?isuse=0/
     */
    private String effectiveHref;
    /**
     * 单位ID
     */
    private String unitId;
    /**
     * 地方平台用户ID
     */
    private String govermentId;
    /**
     * 类型说明（1.车企2.地方政府）
     */
    private Integer userType;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Double getIsValid() {
        return isValid;
    }

    public void setIsValid(Double isValid) {
        this.isValid = isValid;
    }

    public Double getIsDel() {
        return isDel;
    }

    public void setIsDel(Double isDel) {
        this.isDel = isDel;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOperUsername() {
        return operUsername;
    }

    public void setOperUsername(String operUsername) {
        this.operUsername = operUsername;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getSortCheckId() {
        return sortCheckId;
    }

    public void setSortCheckId(String sortCheckId) {
        this.sortCheckId = sortCheckId;
    }

    public String getEffectiveStartTime() {
        return effectiveStartTime;
    }

    public void setEffectiveStartTime(String effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
    }

    public String getEffectiveEndTime() {
        return effectiveEndTime;
    }

    public void setEffectiveEndTime(String effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
    }

    public String getEffectiveHref() {
        return effectiveHref;
    }

    public void setEffectiveHref(String effectiveHref) {
        this.effectiveHref = effectiveHref;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getGovermentId() {
        return govermentId;
    }

    public void setGovermentId(String govermentId) {
        this.govermentId = govermentId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TsUser{" +
        ", id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", realname=" + realname +
        ", email=" + email +
        ", mobile=" + mobile +
        ", deptId=" + deptId +
        ", isValid=" + isValid +
        ", isDel=" + isDel +
        ", createTime=" + createTime +
        ", operUsername=" + operUsername +
        ", roleId=" + roleId +
        ", memberId=" + memberId +
        ", sortCheckId=" + sortCheckId +
        ", effectiveStartTime=" + effectiveStartTime +
        ", effectiveEndTime=" + effectiveEndTime +
        ", effectiveHref=" + effectiveHref +
        ", unitId=" + unitId +
        ", govermentId=" + govermentId +
        ", userType=" + userType +
        "}";
    }
}
