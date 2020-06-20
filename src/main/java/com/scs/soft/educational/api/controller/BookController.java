package com.scs.soft.educational.api.controller;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Tao
 * @version 1.0
 * @ClassName BookController
 * @Description TODO
 * @date 2020-06-20 17:54
 **/
@RestController
@Slf4j
@RequestMapping(value = "/book")
@Api(value = "BookController", tags = {"图书模块"})
public class BookController {
    @Resource
    private BookService bookService;

    @ApiOperation(value = "分页查询所有图书", notes = "")
    @PostMapping(value = "/all")
    public Result getAllNewsByType(@RequestBody PageDto pageDto) {
        return bookService.getAllBook(pageDto);
    }

}
