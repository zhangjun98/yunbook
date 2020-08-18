package com.modo.bookdetalserver.Beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:modoyun
 * @TIME:19:39
 * @DATE:2020/6/18 -rf
 * 仓库
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Repo {
    private int repoId;
    private String repoName;
}
