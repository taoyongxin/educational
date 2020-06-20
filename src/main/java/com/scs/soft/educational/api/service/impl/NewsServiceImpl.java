package com.scs.soft.educational.api.service.impl;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.mapper.NewsMapper;
import com.scs.soft.educational.api.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName NewsServiceImpl
 * @Description TODO
 * @date 2020-06-20 19:00
 **/
@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;
    @Override
    public Result getAllNews(PageDto pageDto) {
        List<Map> mapList=newsMapper.getAllNews(pageDto);
        return Result.success(mapList);
    }
}
