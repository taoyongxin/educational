package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.domain.entity.News;

public interface NewsService {
    Result getAllNews(PageDto pageDto);

    /**
     * 新增资讯
     * @param news
     * @return
     */
    Result insertNews(News news);

    /**
     * 修改资讯
     * @param news
     * @return
     */
    Result updateNews(News news);

    /**
     * 根据咨询ID逻辑删除资讯
     * @param pkNewsId
     * @return
     */
    Result deletedNews(long pkNewsId);

    /**
     * 批量删除资讯
     * @param ids
     * @return
     */
    Result batchDeletedNews(String ids);
}
