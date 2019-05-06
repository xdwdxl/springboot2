package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public List<UserEntity> getAll() {

        return userMapper.selectList(new QueryWrapper<>());
    }
    public int delete(int id){
        return userMapper.deleteById(id);
    }
    public int Update(UserEntity userentity){
        return userMapper.updateById(userentity);
    }
    public UserEntity insertUser(UserEntity userentity) {
        userMapper.insert(userentity);
        return userentity;
    }
    public List<UserEntity> findByUserName(String username) {
        return userMapper.selectList(new QueryWrapper<UserEntity>().eq("username", username));
    }
}
