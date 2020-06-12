package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class StudentServiceTest {
    @Resource
    private StudentService studentService;

    @Test
    void getAllStudent() {
        Result result = studentService.getAllStudent();
        System.out.println(result);
    }
}