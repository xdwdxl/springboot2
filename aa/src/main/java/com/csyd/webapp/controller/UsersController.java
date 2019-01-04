package com.csyd.webapp.controller;

import com.csyd.webapp.mapper.UserMapper;
import com.csyd.webapp.entity.UserEntity;
import com.csyd.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping()
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getAll")
    public List<UserEntity> findAll() {
        List<UserEntity> list = userService.getAll();
        return list;
    }

    @RequestMapping("/index")
    public String index() {
        return "123";
    }
}

