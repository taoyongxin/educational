package com.scs.soft.educational.api.domain.entity;

import lombok.Builder;

import java.sql.Timestamp;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Book
 * @Description TODO
 * @date 2020-06-18 23:15
 **/
@Builder
public class Book {
    /**
     * 主键
     */
    private  Long pkBookId;

    /**
     * 作者
     */
    private  String author;

    /**
     * 书名
     */
    private  String bookName;

    /**
     * 库存总数
     */
    private  Integer bookNumber;

    /**
     * 库存剩余
     */
    private  Integer bookResidueNumber;

    /**
     * 封面
     */
    private  String cover;

    /**
     * 简介
     */
    private  String description;

    /**
     * 创建时间
     */
    private Timestamp gmtCreate;

    /**
     * 更新时间
     */
    private  Timestamp gmtModified;


    /**
     * 删除标志
     */
    private Boolean isDeleted;

    /**
     * 类型
     */
    private  String type;
}
