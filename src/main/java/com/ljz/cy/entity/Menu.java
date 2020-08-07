package com.ljz.cy.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 此类为菜单模块持久层的pojo
 */
@Data
public class Menu implements Serializable {
    /* 菜单id */
    private Integer id;
    /* 资源名称 */
    private String name;
    /* 资源URL */
    private String url;
    /* 类型 : 1:菜单,2:按钮 */
    private Integer type;
    /* 排序 */
    private Integer sort;
    /* 备注 */
    private String note;
    /* 授权 : (sys:user:update) */
    private String permission;
    /* 父菜单ID, 一级菜单为0 */
    private Integer parentId;
    /*父菜单名称*/
    private String parentName;
    /* 创建用户 */
    private String createdUser;
    /* 修改用户 */
    private String modifiedUser;
    /* 创建时间 */
    private Date createdTime;
    /* 修改时间 */
    private Date modifiedTime;

}
