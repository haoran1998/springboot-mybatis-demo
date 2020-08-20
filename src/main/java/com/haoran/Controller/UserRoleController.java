package com.haoran.Controller;

import com.github.pagehelper.PageInfo;
import com.haoran.model.User;
import com.haoran.model.UserRole;
import com.haoran.model.pojo.UserRolePojo;
import com.haoran.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/userRole")
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;

    @ResponseBody
    @RequestMapping(value = "/selectAllByPage/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public PageInfo<UserRolePojo> selectAllByPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userRoleService.selectAllByPage(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/insert", produces = {"application/json;charset=UTF-8"})
    public Object insert(@RequestBody UserRole record){
        return userRoleService.insert(record);
    }

    @ResponseBody
    @RequestMapping(value = "/updateByPrimaryKey", produces = {"application/json;charset=UTF-8"})
    public Object updateByPrimaryKey(@RequestBody UserRole record){
        return userRoleService.updateByPrimaryKey(record);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", produces = {"application/json;charset=UTF-8"})
    public Object deleteByPrimaryKey(@PathVariable("id") int id){
        return userRoleService.deleteByPrimaryKey(id);
    }
}
