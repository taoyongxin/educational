package com.scs.soft.educational.api.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Tao
 * @version 1.0
 * @ClassName news
 * @Description 资讯实体类
 * @date 2020-06-12 17:27
 **/
@Builder
@Data
public class News {
    /**
     * 主键
     */
    private Long pkNewsId;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
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
