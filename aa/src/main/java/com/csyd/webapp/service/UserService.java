package com.csyd.webapp.service;

import com.csyd.webapp.entity.UserEntity;
import com.csyd.webapp.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public List<UserEntity> getAll() {
        return userMapper.getAll();
    }
}
