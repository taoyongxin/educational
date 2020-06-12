package com.scs.soft.educational.api.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Type
 * @Description TODO
 * @date 2020-06-12 17:34
 **/
@Builder
@Data
public class NewsType {
    /**
     * 主键
     */
    private Long pkNewsTypeId;
    /**
     * 分类ID
     */
    private Long typeId;
    /**
     * 资讯ID
     */
    private Long newsId;
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
