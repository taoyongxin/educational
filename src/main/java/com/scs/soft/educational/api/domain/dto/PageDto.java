package com.scs.soft.educational.api.domain.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tao
 * @version 1.0
 * @ClassName PageDto
 * @Description TODO
 * @date 2020-06-15 21:25
 **/
@Builder
@Data
public class PageDto {
    private Integer currentPage;
    private Integer pageSize;
    private Long id;
}
