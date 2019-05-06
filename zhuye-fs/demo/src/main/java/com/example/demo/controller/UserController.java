package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public String detail(){
        return "user/userList";
    }

    @RequestMapping(value = "/getDetail",method = RequestMethod.GET)
    @ResponseBody
    public  Map<String,Object>  getDetail(){
        Map<String,Object> result = new HashMap<>();
        List<UserEntity> list=userService.getAll();
        result.put("success",true);
        result.put("users",list);
        return result;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public String delete(int id) {
        int result = userService.delete(id);
        System.out.println();
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    @ResponseBody
    public String update(UserEntity userentity) {
        int result = userService.Update(userentity);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    @ResponseBody
    public UserEntity insert(UserEntity userentity) {
        return userService.insertUser(userentity);
    }

    @RequestMapping("/ListUserByusername")
    @ResponseBody
    public List<UserEntity> ListUserByUsername(String username){
        return userService.findByUserName(username);
    }
}
