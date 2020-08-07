package com.ljz.cy.service.impl;

import com.ljz.common.bo.PageObject;
import com.ljz.common.exception.ServiceException;
import com.ljz.cy.dao.LogDao;
import com.ljz.cy.entity.Log;
import com.ljz.cy.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 此类为日志模块的业务层实现类
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    /**
     * 用于执行日志业务的分页查询操作
     * @param username
     * @param pageCurrent : 当前页码值
     * @return
     */
    @Override
    public PageObject<Log> findPageObjects(String username,Integer pageCurrent){
        //1. 检验数据
        if (pageCurrent==null||pageCurrent<1){
            throw new IllegalArgumentException("页码值不正确!");
        }
        //2. 执行总记录数查询
        int rowCount = logDao.getRowCount(username);
        //2.1 对参数校验
        if (rowCount==0){
            throw new ServiceException("系统没有对应记录!");
        }
        //3.基于条件查询分页信息
        //3.1 定义每页要显示的记录数
        int pageSize = 30;
        //3.2 计算当前页查询的起始位置
        int startIndex = (pageCurrent-1)*pageSize;
        //3.3 执行查询
        List<Log> records = logDao.findPageObjects(username, startIndex, pageSize);
        //4. 对结果进行封装和处理
        //注意:PageObject构造方法传参的顺序由构造方法定义时参数的顺序决定
        return new PageObject<>(pageCurrent, pageSize,rowCount, records);
    }

    /**
     * 基于id执行删除日志信息操作
     * @param ids
     * @return
     */
    @Override
    public int deleteObjects(Integer...ids) {
        //1. 参数校验
        if (ids==null||ids.length==0){
            throw new IllegalArgumentException("请选择一个id~");
        }
        //2. 执行删除操作
        int rows;
        try {
            rows = logDao.deleteObjects(ids);
        } catch (Throwable e) {
            e.printStackTrace();
            throw new ServiceException("系统正在维护中,正在恢复~~~");
        }
        //2.1 判断数据
        if (rows==0){
            throw new ServiceException("记录可能已经不存在!");
        }
        //3. 返回结果
        return rows;
    }
}
