package com.ljz.common.web;

import com.ljz.common.vo.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 此类为全局异常定义类,对控制层可能出现的异常,进行统一处理
 *
 */
@ControllerAdvice //全局异常处理类
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public JsonResult doHandleRuntimeException(RuntimeException e){
            e.printStackTrace(); //也可以写日志异常信息
            return new JsonResult(e); //封装
    }


}
