package com.modo.shoppinglistserver.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:modoyun
 * @TIME:19:26
 * @DATE:2020/6/20 -rf
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo {
    private int code;
    private String msg;
    private Object data;
}
