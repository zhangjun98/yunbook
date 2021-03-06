package com.modo.booklistserver.Beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:modoyun
 * @TIME:17:46
 * @DATE:2020/6/17 -rf
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo {
    private int code;
    private String  msg;
    private Object data;
}
