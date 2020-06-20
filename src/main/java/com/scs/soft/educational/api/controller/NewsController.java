package com.scs.soft.educational.api.controller;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.service.NewsService;
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
 * @ClassName NewsController
 * @Description TODO
 * @date 2020-06-20 19:04
 **/
@RestController
@Slf4j
@RequestMapping(value = "/new")
@Api(value = "NewsController", tags = {"资讯模块"})
public class NewsController {
    @Resource
    private NewsService newsService;

    @ApiOperation(value = "分页查询所有资讯", notes = "")
    @PostMapping(value = "/all")
    public Result getAllNewsByType(@RequestBody PageDto pageDto) {
        return newsService.getAllNews(pageDto);
    }

}
