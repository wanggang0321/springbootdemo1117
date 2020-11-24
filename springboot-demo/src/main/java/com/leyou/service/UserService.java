package com.leyou.service;

import com.leyou.entity.User;
import com.leyou.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        Map<String, Object> sqlMap = new HashMap<>();
        sqlMap.put("id", id);
        User user = this.userMapper.selectByPrimaryKey(sqlMap);
        return user;
    }

    @Transactional
    public void deleteById(Long id) {
        this.userMapper.deleteByPrimaryKey(id);
    }

    public List<User> queryAll() {
        return userMapper.selectAll();
    }
}
