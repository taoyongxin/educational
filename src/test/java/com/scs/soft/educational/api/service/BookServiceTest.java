package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceTest {

    @Resource
    private BookService bookService;

    @Test
    void deletedBook() {
        Result result = bookService.deletedBook((long)1);
        System.out.println(result);
    }

    @Test
    void batchDeletedBooks() {
        String ids = "1,2";
        Result result = bookService.batchDeletedBooks(ids);
        System.out.println(result);
    }
}