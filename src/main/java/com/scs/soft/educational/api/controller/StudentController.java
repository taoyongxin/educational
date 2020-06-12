package com.scs.soft.educational.api.controller;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.LoginDto;
import com.scs.soft.educational.api.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Tao
 * @version 1.0
 * @ClassName StudentController
 * @Description TODO
 * @date 2020-06-10 20:42
 **/
@RestController
@Slf4j
@RequestMapping(value = "/student")
@Api(value = "StudentController",tags = {"学生接口"})
public class StudentController {
    @Resource
    private StudentService studentService;

    @ApiOperation(value = "查询所有学生",notes = "")
    @GetMapping(value = "/all")
    public Result getAllStudent(){
        return studentService.getAllStudent();
    }


    @ApiOperation(value = "学生账户密码登录",notes = "")
    @PostMapping(value = "/login")
    public Result loginStudent(@RequestBody LoginDto loginDto){
        return studentService.studentLogin(loginDto);
    }
}
