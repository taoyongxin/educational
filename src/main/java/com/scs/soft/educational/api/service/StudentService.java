package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.dto.LoginDto;

/**
 * @author Tao
 */
public interface StudentService {
    /**
     * 获取所有学生
     * @return
     */
    Result getAllStudent();

    /**
     * 学生登录
     * @param loginDto
     * @return
     */
    Result studentLogin(LoginDto loginDto);
}
