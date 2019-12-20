package com.vehts.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author dhl
 * @since 2019-09-06
 */
public class TsDict extends Model<TsDict> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 值
     */
    private String val;
    /**
     * 显示顺序
     */
    private BigDecimal type;
    /**
     * 操作人，存的是用户名
     */
    private String operUser;
    /**
     * 备注
     */
    private String note;
    /**
     * 1:公用  0:私用
     */
    private BigDecimal isPub;
    /**
     * 组编码
     */
    private String groupName;


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

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public String getOperUser() {
        return operUser;
    }

    public void setOperUser(String operUser) {
        this.operUser = operUser;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getIsPub() {
        return isPub;
    }

    public void setIsPub(BigDecimal isPub) {
        this.isPub = isPub;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TsDict{" +
        ", id=" + id +
        ", name=" + name +
        ", val=" + val +
        ", type=" + type +
        ", operUser=" + operUser +
        ", note=" + note +
        ", isPub=" + isPub +
        ", groupName=" + groupName +
        "}";
    }
}
