package com.scs.soft.educational.api.domain.entity;

import lombok.Builder;

import java.sql.Timestamp;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Borrow
 * @Description TODO
 * @date 2020-06-18 23:16
 **/
@Builder
public class Borrow {
    /**
     * 主键
     */
    private  Long pkBorrowId;

    /**
     * 借阅人姓名
     */
    private  String borrowUserName;

    /**
     * 借阅人学号
     */
    private  String borrowUserNumber;

    /**
     * 借阅人手机号
     */
    private  String borrowUserPhone;

    /**
     * 借阅图书名称
     */
    private String borrowBookName;

    /**
     * 借阅图书编号
     */
    private  String borrowBookId;

    /**
     * 归还状态  0 未归还， 1 已归还）
     */
    private  Boolean isReturned;

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
    private  Boolean isDeleted;
}
