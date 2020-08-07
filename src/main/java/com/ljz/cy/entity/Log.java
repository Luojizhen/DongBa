package com.ljz.cy.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 此类为日志模块的pojo对象
 */
@Data
public class Log  implements Serializable {
    //用户id
    private Integer id;
    //用户名
    private String username;
    //用户操作
    private String operation;
    //请求方法
    private String method;
    //请求参数
    private String params;
    //执行时长(毫秒)
    private Long time;
    //IP地址
    private String ip;
    //创建时间
    private Date createdTime;

}
