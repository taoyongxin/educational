package com.scs.soft.educational.api.domain.entity;

import java.sql.Timestamp;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Admin
 * @Description 超级管理员实体类
 * @date 2020-06-18 23:01
 **/
public class Admin {
    /**
     * 管理员id
     */
    private Integer pkAdminId;
    /**
     * 管理员名
     */
    private String adminName;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Timestamp gmtCreate;
    /**
     * 修改时间
     */
    private Timestamp gmtModified;
    /**
     * 是否删除
     */
    private Boolean isDeleted;
}
