package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.entity.Book;

/**
 * @author Tao
 */
public interface BookService {

    /**
     * 分页查询所有图书
     * @param pageDto
     * @return
     */
    Result getAllBook(PageDto pageDto);

    /**
     * 根据id删除图书
     * @param pkBookId
     * @return
     */
    Result deletedBook(Long pkBookId);

    /**
     * 批量删除图书
     * @param ids
     * @return
     */
    Result batchDeletedBooks(String ids);

    /**
     * 新增图书
     * @param book
     * @return
     */
    Result insertBook(Book book);

    /**
     * 修改图书
     * @param book
     * @return
     */
    Result updateBook(Book book);
}
