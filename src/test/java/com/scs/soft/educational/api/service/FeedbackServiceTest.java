package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.entity.Feedback;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FeedbackServiceTest {

    @Resource
    private FeedbackService feedbackService;

    @Test
    void insertFeedback() {
        Feedback feedback = Feedback.builder()
                .title("111")
                .content("!123")
                .mobile("17826012341")
                .build();
        Result result = feedbackService.insertFeedback(feedback);
        System.out.println(result);
    }
}