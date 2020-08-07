package com.ljz.cy.controller;

import com.ljz.common.bo.PageObject;
import com.ljz.common.vo.JsonResult;
import com.ljz.cy.entity.Log;
import com.ljz.cy.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 此类为日志模块的控制层
 */
@RestController
@RequestMapping("/log/")
public class LogController {
        @Autowired
        private LogService logService;

        /**
         * 执行日志模块分页查询请求处理
         * @param username
         * @param pageCurrent
         * @return
         */
        @RequestMapping("doFindPageObjects")
        public JsonResult doFindPageobjects(String username,Integer pageCurrent){
            PageObject<Log> pageObjects = logService.findPageObjects(username, pageCurrent);
        return new JsonResult(pageObjects);
        }

        /**
         * 执行日志模块删除记录请求操作
         * @param ids
         * @return
         */
        @RequestMapping("doDeleteObjects")
        public JsonResult doDeleteObjects(Integer...ids){
                logService.deleteObjects(ids);
                return new JsonResult("delete OK~");
        }


}
