package com.scs.soft.educational.api.mapper;

import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;

import java.sql.SQLException;

/**
 * @author Tao
 * @version 1.0
 * @ClassName CommonMapper
 * @Description TODO
 * @date 2020-06-12 23:40
 **/
public interface CommonMapper {
    /**
     * 重置指定数据表的主键自增，使之连续
     * @param tableName
     * @throws SQLException
     */
    @Update("ALTER TABLE ${tableName} AUTO_INCREMENT = 1 ")
    void alert(@Param("tableName") String tableName) throws SQLException;
}
