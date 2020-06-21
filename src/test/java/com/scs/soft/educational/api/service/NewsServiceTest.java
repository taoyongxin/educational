package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.entity.News;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@SpringBootTest
class NewsServiceTest {

    @Resource
    private NewsService newsService;
    @Test
    void insertNews() {

            News news = News.builder()
                    .title("我是一颗小小的石头")
                    .content("这是我在一天晚上突然来的")
                    .gmtCreate(Timestamp.valueOf(LocalDateTime.now()))
                    .gmtModified(Timestamp.valueOf(LocalDateTime.now()))
                    .isDeleted(false)
                    .build();
        Result result = newsService.insertNews(news);
        System.out.println(result);


        }

    @Test
    void updateNews() {
        News news = News.builder()
                .pkNewsId((long)2)
                .title("gfgfdgdfg")
                .content("这是我在一天晚上突然来的")
                .build();
        Result result = newsService.updateNews(news);
        System.out.println(result);

    }
}
