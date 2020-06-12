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
    private Integer pkStudentId;
    private String name;
    private String mobile;
    private String password;
    private String gender;
    private Timestamp birthday;
    private String className;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;
    private Boolean isDeleted;
}
