package com.modo.typeprovider.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:modoyun
 * @TIME:13:57
 * @DATE:2020/6/17 -rf
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo2 {
    private int code;
    private String msg;
    private Object data;
}
