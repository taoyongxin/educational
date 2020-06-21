package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.entity.News;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@SpringBootTest
class NewsMapperTest {

    @Resource
    private NewsMapper newsMapper;

    @Test
    void insert() throws SQLException {
        News news = News.builder()
                .title("我是一颗小小的石头")
                .content("这是我在一天晚上突然来的")
                .gmtCreate(Timestamp.valueOf(LocalDateTime.now()))
                .gmtModified(Timestamp.valueOf(LocalDateTime.now()))
                .isDeleted(false)
                .build();
        newsMapper.insert(news);


    }

    @Test
    void updateNews() throws SQLException{
        News news = News.builder()
                .pkNewsId((long)3)
                .title("wu儿子")
                .content("南工院第一帅")
                .build();
        newsMapper.updateNews(news);
    }

}