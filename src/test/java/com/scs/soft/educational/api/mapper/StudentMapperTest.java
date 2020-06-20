package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    void getAllStudent() throws SQLException {
        List<Student> students = studentMapper.getAllStudent();
        System.out.println(students);
    }

    @Test
    void studentLogin() throws SQLException{
        Student student = studentMapper.studentLogin("17826012341","123456");
        System.out.println(student);
    }

    @Test
    void update() throws SQLException{
        Student student = Student.builder()
                .pkStudentId((long)1)
                .avatar("avatar.jpg")
                .gender("女")
                .nickname("梁弟")
                .build();
        studentMapper.update(student);
    }

    @Test
    void name() {
        Student student = studentMapper.getStudentByPkStudentId((long)1);
        System.out.println(student);
    }
}