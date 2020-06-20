package com.scs.soft.educational.api.controller;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.service.BorrowService;
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
 * @ClassName BorrowController
 * @Description TODO
 * @date 2020-06-18 23:58
 **/
@RestController
@Slf4j
@RequestMapping(value = "/borrow")
@Api(value = "BorrowController", tags = {"借阅模块"})
public class BorrowController {
    @Resource
    private BorrowService borrowService;

    @ApiOperation(value = "分页查询所有借阅信息", notes = "")
    @PostMapping(value = "/all")
    public Result getAllNewsByType(@RequestBody PageDto pageDto) {
        return borrowService.getAllBorrow(pageDto);
    }

}
