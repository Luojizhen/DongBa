package com.ljz.cy.service;

import com.ljz.cy.entity.Menu;

import java.util.List;
import java.util.Map;

/**
 * 此类为菜单模块的业务层
 */
public interface MenuService {

    /**
     * 查询所有菜单记录
     * @return
     */
    List<Menu> findObjects();

}
