package com.scs.soft.educational.api.controller;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.dto.SingleDto;
import com.scs.soft.educational.api.service.NewsTypeService;
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
 * @ClassName NewsTypeController
 * @Description TODO
 * @date 2020-06-12 18:49
 **/
@RestController
@Slf4j
@RequestMapping(value = "/news")
@Api(value = "NewsTypeController",tags = {"资讯接口"})
public class NewsTypeController {
    @Resource
    private NewsTypeService newsTypeService;

    @ApiOperation(value = "查询所有资讯分类及包含资讯详情数据",notes = "")
    @PostMapping(value = "/all")
    public Result getAllNewsByType(){
        return newsTypeService.getAllNewsByType();
    }

    @ApiOperation(value = "查询分类ID获取资讯详情数据",notes = "")
    @PostMapping(value = "/single")
    public Result getAllNews(@RequestBody SingleDto singleDto){
        return newsTypeService.getNews(Long.valueOf(singleDto.getId()));
    }

    @ApiOperation(value = "查询分类ID获取资讯分页查询",notes = "")
    @PostMapping(value = "/page")
    public Result getNewsPage(@RequestBody PageDto pageDto){
        return newsTypeService.getNewsPage(pageDto);
    }

    @ApiOperation(value = "分类查询所有资讯分类",notes = "")
    @PostMapping(value = "/news/page")
    public Result getAllNews(@RequestBody PageDto pageDto){
        return newsTypeService.getAllNews(pageDto);
    }
}
