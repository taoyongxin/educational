package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BorrowServiceTest {
@Resource
private BorrowService borrowService;
    @Test
    void getAllBorrow() {
        PageDto pageDto= PageDto.builder().currentPage(1).pageSize(1).build();
        Result result=borrowService.getAllBorrow(pageDto);
        System.out.println(result);
    }
}