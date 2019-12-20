package com.usercenter.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 会员信息表
 * </p>
 *
 * @author dhl
 * @since 2019-09-09
 */
public class TsMemberInfo extends Model<TsMemberInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键标识
     */
    @TableId(value = "id", type = IdType.UUID)
    private String id;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 1:有效，0：无效，无效时禁止登录
     */
    private String companyAddress;
    /**
     * 公司营业执照
     */
    private String businessLicPic;
    private String androidPushId;
    private String iosPushId;
    /**
     * 0：待审核 1：审核通过  2:审核不通过
     */
    private Integer state;
    /**
     * 审核人员用户名
     */
    private String applyUsername;
    /**
     * 审核意见
     */
    private String accreditLetter;
    /**
     * 组织机构代码
     */
    private String organizationCode;
    /**
     * 邮寄地址
     */
    private String mailingAddress;
    /**
     * 母账号id
     */
    private String parentId;
    /**
     * id路径
     */
    private String path;
    /**
     * 备注
     */
    private String remark;
    /**
     * 添加挂靠单位时间
     */
    private String addUnitDate;
    /**
     * 预约次数
     */
    private Integer userTime;
    /**
     * 经度
     */
    private String lngitude;
    /**
     * 纬度
     */
    private String latitude;
    /**
     * 0：正常 1：拉黑
     */
    private Integer type;
    /**
     * P主账号G挂靠单位C子账号
     */
    private String accountType;
    /**
     * 密码长度是否符合16位 0：不符合 1：符合
     */
    private Double passwordType;
    /**
     * 集团名称
     */
    private String blocName;
    /**
     * 企业类别
     */
    private String firmType;
    /**
     * 进口商名称
     */
    private String mporterName;
    /**
     * 车辆类别
     */
    private String carType;
    /**
     * 身份证图片
     */
    private String identityPic;
    /**
     * 区分地方平台和企业 1地方平台 0企业
     */
    private String companyFlag;
    @TableField("is_No_children")
    private Integer isNoChildren;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getBusinessLicPic() {
        return businessLicPic;
    }

    public void setBusinessLicPic(String businessLicPic) {
        this.businessLicPic = businessLicPic;
    }

    public String getAndroidPushId() {
        return androidPushId;
    }

    public void setAndroidPushId(String androidPushId) {
        this.androidPushId = androidPushId;
    }

    public String getIosPushId() {
        return iosPushId;
    }

    public void setIosPushId(String iosPushId) {
        this.iosPushId = iosPushId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getApplyUsername() {
        return applyUsername;
    }

    public void setApplyUsername(String applyUsername) {
        this.applyUsername = applyUsername;
    }

    public String getAccreditLetter() {
        return accreditLetter;
    }

    public void setAccreditLetter(String accreditLetter) {
        this.accreditLetter = accreditLetter;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddUnitDate() {
        return addUnitDate;
    }

    public void setAddUnitDate(String addUnitDate) {
        this.addUnitDate = addUnitDate;
    }

    public Integer getUserTime() {
        return userTime;
    }

    public void setUserTime(Integer userTime) {
        this.userTime = userTime;
    }

    public String getLngitude() {
        return lngitude;
    }

    public void setLngitude(String lngitude) {
        this.lngitude = lngitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getPasswordType() {
        return passwordType;
    }

    public void setPasswordType(Double passwordType) {
        this.passwordType = passwordType;
    }

    public String getBlocName() {
        return blocName;
    }

    public void setBlocName(String blocName) {
        this.blocName = blocName;
    }

    public String getFirmType() {
        return firmType;
    }

    public void setFirmType(String firmType) {
        this.firmType = firmType;
    }

    public String getMporterName() {
        return mporterName;
    }

    public void setMporterName(String mporterName) {
        this.mporterName = mporterName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getIdentityPic() {
        return identityPic;
    }

    public void setIdentityPic(String identityPic) {
        this.identityPic = identityPic;
    }

    public String getCompanyFlag() {
        return companyFlag;
    }

    public void setCompanyFlag(String companyFlag) {
        this.companyFlag = companyFlag;
    }

    public Integer getIsNoChildren() {
        return isNoChildren;
    }

    public void setIsNoChildren(Integer isNoChildren) {
        this.isNoChildren = isNoChildren;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TsMemberInfo{" +
        ", id=" + id +
        ", companyName=" + companyName +
        ", companyAddress=" + companyAddress +
        ", businessLicPic=" + businessLicPic +
        ", androidPushId=" + androidPushId +
        ", iosPushId=" + iosPushId +
        ", state=" + state +
        ", applyUsername=" + applyUsername +
        ", accreditLetter=" + accreditLetter +
        ", organizationCode=" + organizationCode +
        ", mailingAddress=" + mailingAddress +
        ", parentId=" + parentId +
        ", path=" + path +
        ", remark=" + remark +
        ", addUnitDate=" + addUnitDate +
        ", userTime=" + userTime +
        ", lngitude=" + lngitude +
        ", latitude=" + latitude +
        ", type=" + type +
        ", accountType=" + accountType +
        ", passwordType=" + passwordType +
        ", blocName=" + blocName +
        ", firmType=" + firmType +
        ", mporterName=" + mporterName +
        ", carType=" + carType +
        ", identityPic=" + identityPic +
        ", companyFlag=" + companyFlag +
        ", isNoChildren=" + isNoChildren +
        "}";
    }
}
