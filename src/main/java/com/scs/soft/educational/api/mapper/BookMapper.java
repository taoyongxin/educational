package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 */
public interface BookMapper {
    /**
     * 分页查询所有
     * @param pageDto
     * @return
     */
    @Select("SELECT * FROM book WHERE is_deleted=false " +
            "LIMIT ${pageDto.pageSize*(pageDto.currentPage-1)},#{pageDto.pageSize}")
    List<Map> getAllBooks(@Param("pageDto") PageDto pageDto);

    /**
     * 根据图书id查询数据
     * @param pkBookId
     * @return
     */
    @Select("SELECT * FROM book WHERE pk_book_id = #{pkBookId} AND is_deleted = false")
    Book getBookByPkBookId(Long pkBookId);

    /**
     * 逻辑删除图书
     * @param pkBookId
     * @throws SQLException
     */
    @Update("UPDATE book SET is_deleted=true WHERE pk_book_id=#{pkBookId}")
    void deleteBook(Long pkBookId) throws SQLException;


    /**
     * 新增图书
     * @param book
     * @throws SQLException
     */
    @Insert("INSERT INTO book VALUES " +
            "(null,#{author},#{bookName},#{bookNumber},#{bookResidueNumber},#{cover},#{description}," +
            "#{gmtCreate},#{gmtModified},#{isDeleted},#{type})")
    @Options(useGeneratedKeys = true, keyProperty = "pkBookId")
    void insert(Book book) throws SQLException;

    /**
     * 修改图书
     * @param book
     * @throws SQLException
     */
    @Update("UPDATE book SET author=#{author},description=#{description},book_name=#{bookName}," +
            "cover=#{cover} WHERE pk_book_id=#{pkBookId}")
    void updateBook(Book book) throws SQLException;

}
