package com.usercenter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
public class TsRole extends Model<TsRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键标识
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色代码
     */
    private String code;
    /**
     * 备注
     */
    private String note;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 创建人
     */
    private String operUsername;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TsRole{" +
        ", id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", note=" + note +
        ", createTime=" + createTime +
        ", operUsername=" + operUsername +
        "}";
    }
}
