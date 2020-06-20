package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.dto.PageDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@SpringBootTest
class BorrowMapperTest {

    @Resource
    private BorrowMapper borrowMapper;

    @Test
    void getAllBorrows() {
        PageDto pageDto = PageDto.builder()
                .currentPage(1)
                .pageSize(1)
                .build();
        List<Map> borrows=borrowMapper.getAllBorrows(pageDto);
        System.out.println(borrows);
    }
}