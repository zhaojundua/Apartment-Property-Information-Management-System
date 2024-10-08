package com.project.property.entity;

import lombok.Data;

import java.util.Date;

/**
    * 出入登记表
    */
@Data
public class AccessVisit {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 用户姓名
    */
    private String userName;

    /**
    * 用户手机号
    */
    private String phone;

    /**
    * 登记时间
    */
    private String createDate;

    /**
    * 是否本小区居民 0否 1是
    */
    private String type;

    /**
     * 是否特殊人群 0否 1是
     */
    private String type1;

    /**
     * 备用 0否 1是
     */
    private String type2;

    /**
    * 备注信息
    */
    private String desc;

    /**
     * 登记的用户 ID
     */
    private Integer userId;

    /**
     * 身份码路径
     */
    private String healthCodePath;

    /**
     * 访问凭证路径
     */
    private String travelCodePath;

    /**
     * 查询日期（开始）
     */
    private Date createDateStart;

    /**
     * 查询日期（结束）
     */
    private Date createDateEnd;
}