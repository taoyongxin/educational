package com.scs.soft.educational.api.controller;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.entity.Feedback;
import com.scs.soft.educational.api.service.FeedbackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Tao
 * @version 1.0
 * @ClassName FeedbackController
 * @Description TODO
 * @date 2020-06-12 23:51
 **/
@RestController
@Slf4j
@RequestMapping(value = "/feedback")
@Api(value = "FeedbackController",tags = {"反馈模块"})
public class FeedbackController {
    @Resource
    private FeedbackService feedbackService;

    @ApiOperation(value = "新增匿名反馈",notes = "")
    @PostMapping(value = "/increase")
    public Result getAllNewsByType(@RequestBody Feedback feedback){
        return feedbackService.insertFeedback(feedback);
    }
}
