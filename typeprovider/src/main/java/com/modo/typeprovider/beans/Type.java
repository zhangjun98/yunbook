package com.modo.typeprovider.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author:modoyun
 * @TIME:20:33
 * @DATE:2020/6/16 -rf
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type {
    private Integer tid;// 类型id
    private String tname; //
    private Integer level;// level级目录
    private Integer pid;//  父目录id
    private List<Type> list; // 子目录
}
