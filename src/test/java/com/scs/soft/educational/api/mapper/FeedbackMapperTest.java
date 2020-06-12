package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.entity.Feedback;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FeedbackMapperTest {

    @Resource
    private FeedbackMapper feedbackMapper;

    @Test
    void insert() throws SQLException {
        Feedback feedback = Feedback.builder()
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