package com.haoran.service;

import com.github.pagehelper.PageInfo;
import com.haoran.model.User;
import com.haoran.model.UserRole;
import com.haoran.model.pojo.UserRolePojo;

import java.util.List;

public interface UserRoleService {
    PageInfo<UserRolePojo> selectAllByPage(int pageNum, int pageSize);

    int insert(UserRole record);

    int updateByPrimaryKey(UserRole record);

    int deleteByPrimaryKey(Integer id);
}
