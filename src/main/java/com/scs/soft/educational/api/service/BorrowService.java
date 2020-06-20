package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;

/**
 * @author Tao
 */
public interface BorrowService {
    /**
     * 查询所有借阅信息
     * @param pageDto
     * @return
     */
    Result getAllBorrow(PageDto pageDto);
}
