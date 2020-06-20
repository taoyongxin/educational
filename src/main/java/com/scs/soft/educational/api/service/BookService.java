package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.PageDto;

public interface BookService {
    Result getAllBook(PageDto pageDto);
}
