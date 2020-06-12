package com.scs.soft.educational.api.domain.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tao
 * @version 1.0
 * @ClassName LoginDto
 * @Description TODO
 * @date 2020-06-10 22:55
 **/
@Builder
@Data
public class LoginDto {
    private String mobile;
    private String password;
}
