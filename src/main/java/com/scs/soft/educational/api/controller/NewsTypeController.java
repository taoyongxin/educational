package com.scs.soft.educational.api.controller;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.service.NewsTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping(value = "/all")
    public Result getAllNewsByType(){
        return newsTypeService.getAllNewsByType();
    }

}
