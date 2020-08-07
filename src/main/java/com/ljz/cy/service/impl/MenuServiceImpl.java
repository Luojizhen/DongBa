package com.ljz.cy.service.impl;

import com.ljz.common.exception.ServiceException;
import com.ljz.cy.dao.MenuDao;
import com.ljz.cy.entity.Menu;
import com.ljz.cy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 此类为菜单模块业务层实现类
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;
    /**
     *执行查询所有菜单记录操作
     * @return
     */
    @Override
    public List<Menu> findObjects() {
        //1. 执行查询操作
        List<Menu> list = menuDao.findObjects();
        //2.校验数据
        if (list==null||list.size()<0){
            throw new ServiceException("没有对应的菜单信息~");
        }
        //3.返回结果list集合
        return list;
    }
}
