package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.dto.PageDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author Tao
 */
public interface BorrowMapper {
    /**
     * 分页查询所有借阅信息
     * @param pageDto
     * @returns
     */
    @Select("SELECT * FROM borrow WHERE is_deleted=false " +
            "LIMIT ${pageDto.pageSize*(pageDto.currentPage-1)},#{pageDto.pageSize}")
    List<Map> getAllBorrows(@Param("pageDto")PageDto pageDto);

}
