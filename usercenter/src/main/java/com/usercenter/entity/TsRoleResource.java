package com.usercenter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 角色-资源中间表
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
public class TsRoleResource extends Model<TsRoleResource> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键标识
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 角色ID
     */
    private String roleId;
    /**
     * 资源ID
     */
    private String resourceId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TsRoleResource{" +
        ", id=" + id +
        ", roleId=" + roleId +
        ", resourceId=" + resourceId +
        "}";
    }
}
