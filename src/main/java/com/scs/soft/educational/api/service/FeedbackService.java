package com.scs.soft.educational.api.service;

import com.scs.soft.educational.api.common.Result;
import com.scs.soft.educational.api.domain.entity.Feedback;

/**
 * @author Tao
 * @version 1.0
 * @ClassName FeedbackService
 * @Description TODO
 * @date 2020-06-12 23:46
 **/
public interface FeedbackService {
    /**
     * 新增反馈
     * @param feedback
     * @return
     */
    Result insertFeedback(Feedback feedback);
}
