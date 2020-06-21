package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.entity.News;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 */
public interface NewsMapper {
    /**
     * 分页查询资讯
     * @param pageDto
     * @return
     */
    @Select("SELECT * FROM news WHERE is_deleted=false " +
            "LIMIT ${pageDto.pageSize*(pageDto.currentPage-1)},#{pageDto.pageSize}")
    List<Map> getAllNews(@Param("pageDto") PageDto pageDto);

    /**
     * 新增资讯
     * @param news
     * @throws SQLException
     */
    @Insert("INSERT INTO news VALUES " +
            "(null,#{title},#{content}," +
            "#{gmtCreate},#{gmtModified},#{isDeleted})")
    @Options(useGeneratedKeys = true, keyProperty = "pkNewsId")
    void insert(News news) throws SQLException;

    /**
     * 修改资讯
     * @param news
     * @throws SQLException
     */
    @Update("UPDATE news SET title=#{title},content=#{content} WHERE pk_news_id=#{pkNewsId}")
    void updateNews(News news) throws SQLException;

    /**
     * 逻辑删除资讯
     * @param pkNewsId
     * @throws SQLException
     */
    @Update("UPDATE news SET is_deleted=true WHERE pk_news_id=#{pkNewsId}")
    void deleteNews(Long pkNewsId) throws SQLException;

    /**
     * 通过ID查询咨询
     * @param pkNewsId
     * @return
     */
    @Select("SELECT * FROM news WHERE pk_news_id = #{pkNewsId} AND is_deleted = false")
    News getNewsByPkNewsId(Long pkNewsId);
}
