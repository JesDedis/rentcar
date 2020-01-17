package com.qf.service.impl;

import com.qf.entity.User;
import com.qf.mapper.UserMapper;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByNameAndPWD(User user) {
        return userMapper.getUserByNameAndPWD(user);
    }

    @Override
    public Integer register(User user) {
        return userMapper.register(user);
    }

    @Override
    public Integer updateTel(String tel, Integer id) {
        return userMapper.updateTel(tel,id);
    }

    /**
     * 修改邮箱，既可以用user对象(里面带有user对象所有的属性，但只有id和email是有值的)
     * 也可以用
     * @param user
     * @return
     */
    @Override
    public Integer updateEmail(User user) {
        return userMapper.updateEmail(user);
    }

    @Override
    public Integer updatePWD(String password, Integer id) {
        return userMapper.updatePWD(password, id);
    }

    @Override
    public User getUserByTel(String tel) {
        return userMapper.getUserByTel(tel);

    }
}
