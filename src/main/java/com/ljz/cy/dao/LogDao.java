package com.ljz.cy.dao;


import com.ljz.cy.entity.Log;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * 此类为日志模块的持久层
 */
@Mapper
public interface LogDao {

    /**
     * 基于条件查询日志记录总数
     * @param username
     * @return
     */
    int getRowCount(String username);

    /**
     * 基于查询条件进行分页查询
     * @param username 名称
     * @param startIndex 起始位置
     * @param pageSize 页面大小
     * @return
     */
    List<Log> findPageObjects(String username, Integer startIndex, Integer pageSize);

    /**
     * 基于id删除日志信息
     * @param ids
     * @return
     */
    int deleteObjects(Integer...ids);

}
