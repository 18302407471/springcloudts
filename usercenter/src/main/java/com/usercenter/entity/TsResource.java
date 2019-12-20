package com.usercenter.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 资源表
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
public class TsResource extends Model<TsResource> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键标识
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    private String name;
    private String code;
    private String parentId;
    private String path;
    private Double isMenu;
    private String createTime;
    private String operUsername;
    private String iconCls;
    private String action;
    private BigDecimal orderNum;
    private String btnFunction;
    private String btnTitle;
    private String btnClass;
    private String note;


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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Double getIsMenu() {
        return isMenu;
    }

    public void setIsMenu(Double isMenu) {
        this.isMenu = isMenu;
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

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BigDecimal getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(BigDecimal orderNum) {
        this.orderNum = orderNum;
    }

    public String getBtnFunction() {
        return btnFunction;
    }

    public void setBtnFunction(String btnFunction) {
        this.btnFunction = btnFunction;
    }

    public String getBtnTitle() {
        return btnTitle;
    }

    public void setBtnTitle(String btnTitle) {
        this.btnTitle = btnTitle;
    }

    public String getBtnClass() {
        return btnClass;
    }

    public void setBtnClass(String btnClass) {
        this.btnClass = btnClass;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TsResource{" +
        ", id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", parentId=" + parentId +
        ", path=" + path +
        ", isMenu=" + isMenu +
        ", createTime=" + createTime +
        ", operUsername=" + operUsername +
        ", iconCls=" + iconCls +
        ", action=" + action +
        ", orderNum=" + orderNum +
        ", btnFunction=" + btnFunction +
        ", btnTitle=" + btnTitle +
        ", btnClass=" + btnClass +
        ", note=" + note +
        "}";
    }
}
