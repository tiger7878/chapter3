package com.smart.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * User: monkey
 * Date: 2018-06-12 17:06
 */
@Getter
@Setter
public class LoginLog implements Serializable {
    private int loginLogId;

    private int userId;

    private String ip;

    private Date loginDate;
}
