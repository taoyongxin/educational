package com.scs.soft.educational.api.service.impl;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.common.ResultCode;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.entity.News;
import com.scs.soft.educational.api.mapper.NewsMapper;
import com.scs.soft.educational.api.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
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

    /**
     * 新增资讯
     * @param news
     * @return
     */
    @Override
    public Result insertNews(News news) {
        News news1 = News.builder()
                .title(news.getTitle())
                .content(news.getContent())
                .gmtCreate(Timestamp.valueOf(LocalDateTime.now()))
                .gmtModified(Timestamp.valueOf(LocalDateTime.now()))
                .isDeleted(false)
                .build();
        try {
            newsMapper.insert(news1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Result.success("新增成功");
    }

    @Override
    public Result updateNews(News news) {
        News news1 = News.builder()
                .pkNewsId(news.getPkNewsId())
                .title(news.getTitle())
                .content(news.getContent())
                .build();
        try {
            newsMapper.updateNews(news1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Result.success("修改成功");
    }

    /**
     * 逻辑删除资讯
     * @param pkNewsId
     * @return
     */
    @Override
    public Result deletedNews(long pkNewsId) {
            News news = newsMapper.getNewsByPkNewsId(pkNewsId);
            if (news != null) {
                try {
                    newsMapper.deleteNews(pkNewsId);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return Result.success("删除资讯成功");
            } else {
                return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
            }
        }

    @Override
    public Result batchDeletedNews(String ids) {
        //判断是否有数据
        if (ids.length() != 0) {
            //将接收到的ids字符串，使用逗号分割
            String[] idArr = ids.split(",");
            for (String s : idArr) {
                //查询该图书是否存在
                News news = newsMapper.getNewsByPkNewsId(Long.valueOf(s));
                if (news != null) {
                    try {
                        newsMapper.deleteNews(Long.valueOf(s));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
            return Result.success("批量删除资讯成功");
        } else {
            return Result.failure(ResultCode.PARAM_IS_BLANK);
        }

    }

}



