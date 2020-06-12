package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Tao
 * @version 1.0
 * @ClassName StudentMapper
 * @Description TODO
 * @date 2020-06-10 20:30
 **/
public interface StudentMapper {
    /**
     * 查询所有学生
     * @return
     * @throws SQLException
     */
    @Select("SELECT * FROM student WHERE is_deleted=false")
    List<Student> getAllStudent() throws SQLException;

    /**
     * 学生登录
     * @param mobile
     * @param password
     * @return
     * @throws SQLException
     */
    @Select("SELECT * FROM student WHERE mobile = #{mobile} AND password = #{password}")
    Student studentLogin(String mobile,String password) throws SQLException;
}
