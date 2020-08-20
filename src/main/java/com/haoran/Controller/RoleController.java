package com.haoran.Controller;

import com.github.pagehelper.PageInfo;
import com.haoran.model.Role;
import com.haoran.model.User;
import com.haoran.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    /**
     * 
     *
     * @param pageNum: 
	 * @param pageSize:
     * @return com.github.pagehelper.PageInfo<com.haoran.model.Role>: 
     * @author haoran.xiao
     * @date 2020/8/20 11:10
     */
    @ResponseBody
    @RequestMapping(value = "/selectAllByPage/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public PageInfo<Role> selectAllByPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return roleService.selectAllByPage(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/insert", produces = {"application/json;charset=UTF-8"})
    public Object insert(@RequestBody Role record){
        return roleService.insert(record);
    }

    @ResponseBody
    @RequestMapping(value = "/updateByPrimaryKey", produces = {"application/json;charset=UTF-8"})
    public Object updateByPrimaryKey(@RequestBody Role record){
        return roleService.updateByPrimaryKey(record);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", produces = {"application/json;charset=UTF-8"})
    public Object deleteByPrimaryKey(@PathVariable("id") int id){
        return roleService.deleteByPrimaryKey(id);
    }
}
