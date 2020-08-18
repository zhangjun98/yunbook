package com.modo.userloginservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:modoyun
 * @TIME:17:35
 * @DATE:2020/6/19 -rf
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int uid;
    private String  username;
    private String  password;
    private String  nickname;
}
