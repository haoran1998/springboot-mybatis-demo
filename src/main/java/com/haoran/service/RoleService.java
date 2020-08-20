package com.haoran.service;

import com.github.pagehelper.PageInfo;
import com.haoran.model.Role;

import java.util.List;

public interface RoleService {
    PageInfo<Role> selectAllByPage(int pageNum, int pageSize);

    int insert(Role record);

    int updateByPrimaryKey(Role record);

    int deleteByPrimaryKey(Integer id);
}
