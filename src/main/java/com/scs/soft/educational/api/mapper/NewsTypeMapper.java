package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.entity.NewsType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 */
public interface NewsTypeMapper {

    /**
     * 查询出所有资讯分类的数据
     * @return
     * @throws SQLException
     */
    @Select("SELECT * FROM news_type WHERE is_deleted=false")
    List<NewsType> getAllNewsType() throws SQLException;

    /**
     * 查询某个分类下的资讯信息
     * @param typeId
     * @return
     * @throws SQLException
     */
    @Select("SELECT t2.pk_news_id,t2.title,t2.content " +
            "FROM news_type t1 " +
            "LEFT JOIN news t2 " +
            "ON t1.news_id = t2.pk_news_id " +
            "WHERE t1.type_id = #{typeId} AND t2.is_deleted=false")
    List<Map> getAllNewsByType(@Param("typeId")Long typeId)throws SQLException;

}
