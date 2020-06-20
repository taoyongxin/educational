package com.scs.soft.educational.api.service.impl;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;
import com.scs.soft.educational.api.mapper.BorrowMapper;
import com.scs.soft.educational.api.service.BorrowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName BorrowServiceImpl
 * @Description TODO
 * @date 2020-06-18 23:51
 **/
@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    private BorrowMapper borrowMapper;
    @Override
    public Result getAllBorrow(PageDto pageDto) {
        List<Map> mapList=borrowMapper.getAllBorrows(pageDto);
        return Result.success(mapList);
    }
}
