package com.hz.sys.vo;

import com.hz.sys.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserVo extends User {

    private Integer page=1;
    private Integer limit=10;

    /**
     * 验证码
     */
    private String code;
}
