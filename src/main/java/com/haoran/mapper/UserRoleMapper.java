package com.haoran.mapper;

import com.haoran.model.User;
import com.haoran.model.UserRole;
import com.haoran.model.pojo.UserRolePojo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    UserRole selectByUserAndRole(@Param("userid") Integer userid,@Param("roleid") Integer roleid);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

    List<UserRolePojo> selectAllByPage();
}