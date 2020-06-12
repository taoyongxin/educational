package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;

/**
 * @author Tao
 */
public interface NewsTypeService {
    /**
     * 根据分类获取所有分类下的所有资讯数据
     * @return
     */
    Result getAllNewsByType();

    /**
     * 根据id获取咨询
     * @return
     */
    Result getNews(Long id);
}
