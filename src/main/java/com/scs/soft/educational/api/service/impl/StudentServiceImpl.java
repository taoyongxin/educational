package com.scs.soft.educational.api.service.impl;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.common.ResultCode;
import com.scs.soft.educational.api.domain.dto.LoginDto;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.entity.Student;
import com.scs.soft.educational.api.mapper.StudentMapper;
import com.scs.soft.educational.api.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @date 2020-06-10 20:39
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Result getAllStudent() {
        List<Student> students = null;
        try {
            students = studentMapper.getAllStudent();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Result.success(students);
    }

    @Override
    public Result studentLogin(LoginDto loginDto) {
        Student student = null;
        try {
            student = studentMapper.studentLogin(loginDto.getMobile(),loginDto.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (student!=null){
            return Result.success(student);
        }else {
            return Result.failure(ResultCode.USER_ACCOUNT_PASSWORD_ERROR);
        }
    }

    @Override
    public Result updateStudent(Student student) {
        try {
            studentMapper.update(student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Result.success("数据修改成功");
    }

    @Override
    public Result getAllStudentByPage(PageDto pageDto) {
        List<Map> mapList=studentMapper.getAllStudents(pageDto);
        return Result.success(mapList);
    }



    }

