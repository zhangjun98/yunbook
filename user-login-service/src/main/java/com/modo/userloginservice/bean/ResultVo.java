package com.modo.userloginservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:modoyun
 * @TIME:11:43
 * @DATE:2020/6/19 -rf
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo {
    private int code;
    private String  msg;
    private Object data;
}
