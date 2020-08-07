package com.ljz.cy.dao;

import com.ljz.cy.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 此类为菜单模块的持久层
 */
@Mapper
public interface MenuDao {

    /**
     * 查询菜单表中所有菜单记录
     * @return
     */
    List<Menu> findObjects();

}
