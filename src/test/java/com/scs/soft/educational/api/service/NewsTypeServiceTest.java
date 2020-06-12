package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NewsTypeServiceTest {

    @Resource
    private NewsTypeService newsTypeService;
    @Test
    void getAllNewsByType() {
        Result result = newsTypeService.getAllNewsByType();
        System.out.println(result);
    }
}