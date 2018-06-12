package com.smart.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * User: monkey
 * Date: 2018-06-12 16:43
 */
@Getter
@Setter
public class User implements Serializable {
    private int userId;

    private String userName;

    private String password;

    private int credits;

    private String lastIp;

    private Date lastVisit;
}
