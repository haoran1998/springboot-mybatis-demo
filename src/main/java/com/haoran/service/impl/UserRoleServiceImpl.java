package com.haoran.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haoran.mapper.RoleMapper;
import com.haoran.mapper.UserMapper;
import com.haoran.mapper.UserRoleMapper;
import com.haoran.model.UserRole;
import com.haoran.model.pojo.UserRolePojo;
import com.haoran.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Resource
    UserMapper userMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    UserRoleMapper userRoleMapper;

    @Override
    public PageInfo<UserRolePojo> selectAllByPage(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserRolePojo> userRolePojos = userRoleMapper.selectAllByPage();
        return new PageInfo<>(userRolePojos);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int insert(UserRole record) {
        if (record == null) {
            return 0;
        }
        if (record.getUserid() == null || record.getRoleid() == null) {
            return 0;
        }
        if (userMapper.selectByPrimaryKey(record.getUserid()) == null) {
            return 0;
        }
        if (roleMapper.selectByPrimaryKey(record.getRoleid()) == null) {
            return 0;
        }
        if (userRoleMapper.selectByUserAndRole(record.getUserid(), record.getRoleid()) != null) {
            return 0;
        }
        return userRoleMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        return userRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userRoleMapper.deleteByPrimaryKey(id);
    }
}
