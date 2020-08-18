package com.modo.shoppinglistserver.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:modoyun
 * @TIME:6:43
 * @DATE:2020/6/19 -rf
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCar {
    /*sid int(11)
bid int(11)
uid int(11)
repo_name varchar(40)
num*/
    private Integer sid;
    private Integer bid;
    private Integer uid;
    private String repoName;
    private Integer num;
    private Book book;
}
