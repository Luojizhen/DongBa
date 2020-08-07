package com.ljz.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 此类为控制层的pojo : 封装响应结果
 */
@Data
public class JsonResult implements Serializable {

    /**状态码*/
    private int state;//1表示SUCCESS,0表示ERROR
    /**状态信息*/
    private String message="ok";
    /**正确数据*/
    private Object data;

    public JsonResult(){}
    public JsonResult(String message){
        this.state=1;
        this.message=message;
    }

    /* 一般查询时调用,封装查询结果 */
    public JsonResult(Object data){
        this.state=1;
        this.data=data;
    }

    /* 出现异常时调用 */
    public JsonResult(Throwable t){
        this.state=0;
        this.message=t.getMessage();
    }
}
