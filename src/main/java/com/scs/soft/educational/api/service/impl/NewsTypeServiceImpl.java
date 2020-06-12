package com.scs.soft.educational.api.service.impl;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.common.ResultCode;
import com.scs.soft.educational.api.mapper.NewsTypeMapper;
import com.scs.soft.educational.api.mapper.TypeMapper;
import com.scs.soft.educational.api.service.NewsTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName NewsTypeServiceImpl
 * @Description TODO
 * @date 2020-06-12 18:38
 **/
@Service
@Slf4j
public class NewsTypeServiceImpl implements NewsTypeService {
    @Resource
    private NewsTypeMapper newsTypeMapper;
    @Resource
    protected TypeMapper typeMapper;

    @Override
    public Result getAllNewsByType() {
        List<Map> types;
        List<Map> map;
        try {
            types = typeMapper.getAllType();
            for (Map type:types){
                map = newsTypeMapper.getAllNewsByType(Long.parseLong(String.valueOf(type.get("pk_type_id"))));
                type.put("newsList",map);
            }
        } catch (SQLException e) {
            log.error(e.getMessage());
            return Result.failure(ResultCode.DATABASE_ERROR);
        }
        return Result.success(types);
    }
}
