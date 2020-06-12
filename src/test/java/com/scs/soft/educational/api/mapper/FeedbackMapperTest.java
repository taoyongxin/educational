package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.EducationalApiApplication;
import com.scs.soft.educational.api.domain.entity.Feedback;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = EducationalApiApplication.class)
class FeedbackMapperTest {

    @Resource
    private FeedbackMapper feedbackMapper;

    @Resource
    private CommonMapper commonMapper;

    @Test
    void insert() throws SQLException {
//        commonMapper.alert("feedback");
        Feedback feedback = Feedback.builder()
//                .pkFeedbackId((long)2)
                .title("11111")
                .content("1111")
                .mobile("11111")
                .gmtCreate(Timestamp.valueOf(LocalDateTime.now()))
                .gmtModified(Timestamp.valueOf(LocalDateTime.now()))
                .isDeleted(false)
                .build();
        feedbackMapper.insert(feedback);
    }


}