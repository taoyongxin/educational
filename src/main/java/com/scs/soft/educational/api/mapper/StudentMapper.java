package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

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

    @Select("SELECT * FROM student WHERE pk_student_id = #{id}")
    Student getStudentByPkStudentId(Long id);

    /**
     * 头像、昵称、性别
     * @param student
     * @throws SQLException
     */
    @Update("UPDATE student SET avatar=#{avatar},nickname=#{nickname},gender=#{gender} " +
            "WHERE pk_student_id=#{pkStudentId}")
    void update(Student student) throws SQLException;

    /**
     * 分页查询所有学生
     * @param pageDto
     * @return
     */
    @Select("SELECT * FROM student WHERE is_deleted=false " +
            "LIMIT ${pageDto.pageSize*(pageDto.currentPage-1)},#{pageDto.pageSize}")
    List<Map> getAllStudents(@Param("pageDto") PageDto pageDto);
}
