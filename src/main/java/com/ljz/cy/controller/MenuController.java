package com.ljz.cy.controller;

import com.ljz.common.vo.JsonResult;
import com.ljz.cy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 此类为菜单模块的控制层
 */
@RestController
@RequestMapping("/menu/")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping("doFindObjects")
    public JsonResult doFindObjects(){
        return new JsonResult(menuService.findObjects());
    }

}
