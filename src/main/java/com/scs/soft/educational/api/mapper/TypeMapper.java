package com.scs.soft.educational.api.mapper;

import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 */
public interface TypeMapper {
    /**
     * 获取所有分类
     * @return
     * @throws SQLException
     */
    @Select("SELECT * from type WHERE is_deleted=false")
    List<Map> getAllType() throws SQLException;
}
