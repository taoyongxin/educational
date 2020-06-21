package com.scs.soft.educational.api.service.impl;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.common.ResultCode;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.entity.Book;
import com.scs.soft.educational.api.mapper.BookMapper;
import com.scs.soft.educational.api.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName BookServiceImpl
 * @Description TODO
 * @date 2020-06-20 17:51
 **/
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    /**
     * 分页查询所有图书
     *
     * @param pageDto
     * @return
     */
    @Override
    public Result getAllBook(PageDto pageDto) {
        List<Map> mapList = bookMapper.getAllBooks(pageDto);
        return Result.success(mapList);
    }

    /**
     * 逻辑删除图书
     *
     * @param pkBookId
     * @return
     */
    @Override
        public Result deletedBook(Long pkBookId) {
            Book book = bookMapper.getBookByPkBookId(pkBookId);
            if (book != null) {
                try {
                    bookMapper.deleteBook(pkBookId);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return Result.success("删除图书成功");
            } else {
                return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
            }
    }

    /**
     * 批量删除图书
     *
     * @param ids
     * @return
     */
    @Override
    public Result batchDeletedBooks(String ids) {
        //判断是否有数据
        if (ids.length() != 0) {
            //将接收到的ids字符串，使用逗号分割
            String[] idArr = ids.split(",");
            for (String s : idArr) {
                //查询该图书是否存在
                Book book = bookMapper.getBookByPkBookId(Long.valueOf(s));
                if (book != null) {
                    try {
                        bookMapper.deleteBook(Long.valueOf(s));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            return Result.success("批量删除图书成功");
        } else {
            return Result.failure(ResultCode.PARAM_IS_BLANK);
        }

    }

    /**
     * 新增成功
     * @param book
     * @return
     */
    @Override
    public Result insertBook(Book book) {
        Book book1 = Book.builder()
                .author(book.getAuthor())
                .bookName(book.getBookName())
                .bookNumber(book.getBookNumber())
                .bookResidueNumber(book.getBookResidueNumber())
                .cover(book.getCover())
                .description(book.getDescription())
                .gmtCreate(Timestamp.valueOf(LocalDateTime.now()))
                .gmtModified(Timestamp.valueOf(LocalDateTime.now()))
                .isDeleted(false)
                .type(book.getType())
                .build();
        try {
            bookMapper.insert(book1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Result.success("新增成功");
    }

    /**
     * 修改图书
     * @param book
     * @return
     */
    @Override
    public Result updateBook(Book book) {
        try {
            bookMapper.updateBook(book);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Result.success("修改成功");
    }

}
