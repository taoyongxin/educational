package com.scs.soft.educational.api.service.impl;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.common.ResultCode;
import com.scs.soft.educational.api.domain.entity.Feedback;
import com.scs.soft.educational.api.mapper.CommonMapper;
import com.scs.soft.educational.api.mapper.FeedbackMapper;
import com.scs.soft.educational.api.service.FeedbackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author Tao
 * @version 1.0
 * @ClassName FeedbackServiceImpl
 * @Description TODO
 * @date 2020-06-12 23:46
 **/
@Service
@Slf4j
public class FeedbackServiceImpl implements FeedbackService {
    @Resource
    private FeedbackMapper feedbackMapper;
    @Resource
    private CommonMapper commonMapper;
    @Override
    public Result insertFeedback(Feedback feedback) {
        Feedback feedback1 = Feedback.builder()
                .title(feedback.getTitle())
                .content(feedback.getContent())
                .mobile(feedback.getMobile())
                .gmtCreate(Timestamp.valueOf(LocalDateTime.now()))
                .gmtModified(Timestamp.valueOf(LocalDateTime.now()))
                .isDeleted(false)
                .build();
        try {
            commonMapper.alert("feedback");
            feedbackMapper.insert(feedback1);
        } catch (SQLException e) {
            log.error(e.getMessage());
            return Result.failure(ResultCode.DATABASE_ERROR);
        }
        return Result.success(feedback1);
    }
}
