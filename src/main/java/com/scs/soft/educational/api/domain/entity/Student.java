package com.scs.soft.educational.api.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Student
 * @Description TODO
 * @date 2020-06-10 20:21
 **/
@Builder
@Data
public class Student {
    /**
     * 主键
     */
    private Long pkStudentId;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;
    /**
     * 性别
     */
    private String gender;
    /**
     * 生日
     */
    private Timestamp birthday;
    /**
     * 班级名称
     */
    private String className;


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
    /**
     * 头像
     */
    private String avatar;
    /**
     * 昵称
     */
    private String nickname;

    /**
     * 学号
     */
    private String jobNumber;


}
