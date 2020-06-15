package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.entity.NewsType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class NewsTypeMapperTest {

    @Resource
    private NewsTypeMapper newsTypeMapper;

    @Test
    void getAllNewsType() throws SQLException {
        List<NewsType> newsTypes = newsTypeMapper.getAllNewsType();
        System.out.println(newsTypes);
    }

    @Test
    void getAllNewsByType() throws SQLException{
        List<Map> mapList = newsTypeMapper.getAllNewsByType((long)1);
        System.out.println(mapList);
    }


    @Test
    void getAllNewsPageByType() throws SQLException{
        PageDto pageDto = PageDto.builder()
                .currentPage(1)
                .pageSize(5)
                .id((long)1)
                .build();
        List<Map> mapList = newsTypeMapper.getAllNewsPageByType(pageDto);
        System.out.println(mapList);
    }
}