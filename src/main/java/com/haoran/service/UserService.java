package com.haoran.service;

import com.github.pagehelper.PageInfo;
import com.haoran.model.User;

import java.util.List;

public interface UserService {
    PageInfo<User> selectAllByPage(int pageNum, int pageSize);

    int insert(User record);

    int updateByPrimaryKey(User record);

    int deleteByPrimaryKey(Integer id);
}
