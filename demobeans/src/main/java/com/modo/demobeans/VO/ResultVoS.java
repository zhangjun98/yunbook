package com.modo.demobeans.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:modoyun
 * @TIME:19:24
 * @DATE:2020/6/16 -rf
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVoS {
    private int code;
    private String msg;
    private Object data;
}
