package com.ljz.cy.service;

import com.ljz.common.bo.PageObject;
import com.ljz.cy.entity.Log;

/**
 * 此类为日志模块的业务层
 */
public interface LogService {

    /**
     * 基于id删除日志信息
     * @param ids
     * @return
     */
    int deleteObjects(Integer...ids);

    /**
     * 基于条件查询当前页记录和分页信息
     * @param username
     * @param pageCurrent : 当前页码值
     * @return
     */
    PageObject<Log> findPageObjects(String username,Integer pageCurrent);

}
