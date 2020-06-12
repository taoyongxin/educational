package com.scs.soft.educational.api.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Type
 * @Description TODO
 * @date 2020-06-12 17:44
 **/
@Builder
@Data
public class Type {
    /**
     * 主键
     */
    private Long pkTypeId;
    /**
     * 分类名称
     */
    private String name;
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
