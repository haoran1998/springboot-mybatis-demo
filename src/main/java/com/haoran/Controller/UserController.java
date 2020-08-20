package com.haoran.Controller;

import com.github.pagehelper.PageInfo;
import com.haoran.model.User;
import com.haoran.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/selectAllByPage/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public PageInfo<User> selectAllByPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.selectAllByPage(pageNum,pageSize);
    }

    /**
     * 
     *
     * @param record: 
     * @return java.lang.Object: 
     * @author haoran.xiao
     * @date 2020/8/20 11:26
     */
    @ResponseBody
    @RequestMapping(value = "/insert", produces = {"application/json;charset=UTF-8"})
    public Object insert(@RequestBody User record){
        return userService.insert(record);
    }

    @ResponseBody
    @RequestMapping(value = "/updateByPrimaryKey", produces = {"application/json;charset=UTF-8"})
    public Object updateByPrimaryKey(@RequestBody User record){
        return userService.updateByPrimaryKey(record);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteByPrimaryKey/{id}", produces = {"application/json;charset=UTF-8"})
    public Object deleteByPrimaryKey(@PathVariable("id") int id){
        return userService.deleteByPrimaryKey(id);
    }
}
