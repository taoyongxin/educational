package com.scs.soft.educational.api.mapper;

import com.scs.soft.educational.api.domain.entity.Feedback;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import java.sql.SQLException;

/**
 * @author Tao
 * @version 1.0
 * @ClassName FeedbackMapper
 * @Description TODO
 * @date 2020-06-12 23:17
 **/
public interface FeedbackMapper {

    /**
     * 新增反馈
     *
     * @param feedback
     * @throws SQLException
     */
    @Insert("INSERT INTO feedback VALUES (null,#{title},#{content},#{mobile},#{gmt_create},#{gmt_modified},#{is_deleted})")
    @Options(useGeneratedKeys = true, keyProperty = "pk_feedback_id")
    void insert(Feedback feedback) throws SQLException;
}
