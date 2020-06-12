package com.scs.soft.educational.api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Feedback
 * @Description TODO
 * @date 2020-06-12 23:15
 **/
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {
    private Long pkFeedbackId;
    private String title;
    private String content;
    private String mobile;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;
    private Boolean isDeleted;
}
