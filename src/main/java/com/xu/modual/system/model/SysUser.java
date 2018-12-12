package com.xu.modual.system.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    @Id
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 显示名
     */
    @Column(name = "display_name")
    private String displayName;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    @Column(name = "org_user_id")
    private String orgUserId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 办公电话
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 头像路径
     */
    @Column(name = "head_path")
    private String headPath;

    /**
     * 公司名称
     */
    private String company;

    /**
     * 部门名称
     */
    private String department;

    /**
     * 职位
     */
    @Column(name = "duty_name")
    private String dutyName;

    /**
     * 部门区域
     */
    @Column(name = "belong_depart_name")
    private String belongDepartName;

    /**
     * 人员类别 1：集团 2：第三方
     */
    private Byte type;

    /**
     * 日程安排通知方式 1：短信 0：不通知
     */
    @Column(name = "schedule_notice")
    private Byte scheduleNotice;

    /**
     * 代办工作通知方式 1：短信 0：不通知
     */
    @Column(name = "agency_notice")
    private Byte agencyNotice;

    /**
     * 阅知工作通知方式  1：短信 0：不通知
     */
    @Column(name = "read_notice")
    private Byte readNotice;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 人员级别
     */
    @Column(name = "p_order")
    private String pOrder;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取显示名
     *
     * @return display_name - 显示名
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 设置显示名
     *
     * @param displayName 显示名
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取盐
     *
     * @return salt - 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐
     *
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @return org_user_id
     */
    public String getOrgUserId() {
        return orgUserId;
    }

    /**
     * @param orgUserId
     */
    public void setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取办公电话
     *
     * @return telephone - 办公电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置办公电话
     *
     * @param telephone 办公电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取邮箱
     *
     * @return mail - 邮箱
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置邮箱
     *
     * @param mail 邮箱
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取头像路径
     *
     * @return head_path - 头像路径
     */
    public String getHeadPath() {
        return headPath;
    }

    /**
     * 设置头像路径
     *
     * @param headPath 头像路径
     */
    public void setHeadPath(String headPath) {
        this.headPath = headPath;
    }

    /**
     * 获取公司名称
     *
     * @return company - 公司名称
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司名称
     *
     * @param company 公司名称
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取部门名称
     *
     * @return department - 部门名称
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门名称
     *
     * @param department 部门名称
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取职位
     *
     * @return duty_name - 职位
     */
    public String getDutyName() {
        return dutyName;
    }

    /**
     * 设置职位
     *
     * @param dutyName 职位
     */
    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    /**
     * 获取部门区域
     *
     * @return belong_depart_name - 部门区域
     */
    public String getBelongDepartName() {
        return belongDepartName;
    }

    /**
     * 设置部门区域
     *
     * @param belongDepartName 部门区域
     */
    public void setBelongDepartName(String belongDepartName) {
        this.belongDepartName = belongDepartName;
    }

    /**
     * 获取人员类别 1：集团 2：第三方
     *
     * @return type - 人员类别 1：集团 2：第三方
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置人员类别 1：集团 2：第三方
     *
     * @param type 人员类别 1：集团 2：第三方
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取日程安排通知方式 1：短信 0：不通知
     *
     * @return schedule_notice - 日程安排通知方式 1：短信 0：不通知
     */
    public Byte getScheduleNotice() {
        return scheduleNotice;
    }

    /**
     * 设置日程安排通知方式 1：短信 0：不通知
     *
     * @param scheduleNotice 日程安排通知方式 1：短信 0：不通知
     */
    public void setScheduleNotice(Byte scheduleNotice) {
        this.scheduleNotice = scheduleNotice;
    }

    /**
     * 获取代办工作通知方式 1：短信 0：不通知
     *
     * @return agency_notice - 代办工作通知方式 1：短信 0：不通知
     */
    public Byte getAgencyNotice() {
        return agencyNotice;
    }

    /**
     * 设置代办工作通知方式 1：短信 0：不通知
     *
     * @param agencyNotice 代办工作通知方式 1：短信 0：不通知
     */
    public void setAgencyNotice(Byte agencyNotice) {
        this.agencyNotice = agencyNotice;
    }

    /**
     * 获取阅知工作通知方式  1：短信 0：不通知
     *
     * @return read_notice - 阅知工作通知方式  1：短信 0：不通知
     */
    public Byte getReadNotice() {
        return readNotice;
    }

    /**
     * 设置阅知工作通知方式  1：短信 0：不通知
     *
     * @param readNotice 阅知工作通知方式  1：短信 0：不通知
     */
    public void setReadNotice(Byte readNotice) {
        this.readNotice = readNotice;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取人员级别
     *
     * @return p_order - 人员级别
     */
    public String getpOrder() {
        return pOrder;
    }

    /**
     * 设置人员级别
     *
     * @param pOrder 人员级别
     */
    public void setpOrder(String pOrder) {
        this.pOrder = pOrder;
    }
}