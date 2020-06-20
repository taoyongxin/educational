package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.dto.PageDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Tao
 */
public interface NewsMapper {
    /**
     * 分页查询资讯
     * @param pageDto
     * @return
     */
    @Select("SELECT * FROM news WHERE is_deleted=false " +
            "LIMIT ${pageDto.pageSize*(pageDto.currentPage-1)},#{pageDto.pageSize}")
    List<Map> getAllNews(@Param("pageDto") PageDto pageDto);
}
