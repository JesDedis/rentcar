package com.qf.service;

import com.qf.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public User getUserByNameAndPWD(User user);

    public Integer register(User user);

    public Integer updateTel(String tel,Integer id);

    Integer updateEmail(User user);

    Integer updatePWD(String password,Integer id);

    public User getUserByTel(String tel);
}
