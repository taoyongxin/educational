package com.scs.soft.educational.api.controller;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.dto.SingleDto;
import com.scs.soft.educational.api.domain.entity.News;
import com.scs.soft.educational.api.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "新增资讯", notes = "")
    @PostMapping(value = "/insert")
    public Result insertNews(@RequestBody News news) {
        return newsService.insertNews(news);
    }

    @ApiOperation(value = "修改资讯", notes = "")
    @PutMapping(value = "/update")
    public Result updateNews(@RequestBody News news) {
        return newsService.updateNews(news);
    }

    @ApiOperation(value = "删除咨询", notes = "")
    @PostMapping(value = "/deleted")
    public Result deletedNews(@RequestBody SingleDto singleDto) {
        return newsService.deletedNews(Long.valueOf(singleDto.getId()));
    }

    @ApiOperation(value = "批量删除资讯", notes = "")
    @PostMapping(value = "/batchDeleted")
    public Result batchDeletedNews(@RequestBody SingleDto singleDto) {
        return newsService.batchDeletedNews(singleDto.getId());
    }
}
