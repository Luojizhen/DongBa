package com.ljz.common.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 此类为日志模块业务层的pojo
 * @param <T>
 */
@Data
public class PageObject<T> implements Serializable {

    /**当前页的页码值*/
    private Integer pageCurrent=1;
    /**页面大小*/
    private Integer pageSize=3;
    /**总行数(通过查询获得)*/
    private Integer rowCount=0;
    /**总页数(通过计算获得)*/
    private Integer pageCount=0;
    /**当前页记录*/
    private List<T> records;

    //设置无参
    public PageObject(){}
    //设置有参
    public PageObject(Integer pageCurrent, Integer pageSize, Integer rowCount, List<T> records) {
        this.pageCurrent = pageCurrent;
        this.pageSize = pageSize;
        this.rowCount = rowCount;
        this.records = records;
        this.pageCount = (rowCount-1)/pageSize+1;
    }
}
