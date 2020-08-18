package com.modo.typeprovider.beans;

/**
 * @Author:modoyun
 * @TIME:19:24
 * @DATE:2020/6/16 -rf
 *
 *
 * 使用有问题，不知道为啥
 */
public class ResultVo {
    private int code;
    private String msg;
    private Object data;
    // 私有构造方法
    private ResultVo(){

    }
    // 提供创造方法
    private static ResultVo CreateVo(int code, String msg, Object data){
        ResultVo vo = new ResultVo();
        vo.code = code;
        vo.data = data;
        vo.msg = msg;
        return vo;
    }
    // 当成功的时候
    public static ResultVo success(String msg, Object data){
        ResultVo vo = CreateVo(0, msg, data);
        return vo;
    }

    // 当失败的时候
    public static ResultVo fail(String msg){
        return CreateVo(1,msg,null);
    }
}
