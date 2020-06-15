package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class NewsTypeServiceTest {

    @Resource
    private NewsTypeService newsTypeService;
    @Test
    void getAllNewsByType() {
        Result result = newsTypeService.getAllNewsByType();
        System.out.println(result);
    }

    @Test
    void getNews() {
        Result result = newsTypeService.getNews((long)1);
        System.out.println(result);
    }

    @Test
    void getNewsPage() {
        PageDto pageDto = PageDto.builder()
                .currentPage(1)
                .pageSize(10)
                .id((long)1)
                .build();
        Result result = newsTypeService.getNewsPage(pageDto);
        System.out.println(result);
    }
}