package com.scs.soft.educational.api.service.impl;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.mapper.BookMapper;
import com.scs.soft.educational.api.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName BookServiceImpl
 * @Description TODO
 * @date 2020-06-20 17:51
 **/
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
@Override
    public Result getAllBook(PageDto pageDto) {
        List<Map> mapList=bookMapper.getAllBooks(pageDto);
        return Result.success(mapList);
    }
}
