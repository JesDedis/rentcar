package com.qf.mapper;

import com.qf.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    User getUserByNameAndPWD(User user);

    Integer register(User user);

    Integer updateTel(String tel,Integer id);

    Integer updateEmail(User user);

    Integer updatePWD(String password,Integer id);

    User getUserByTel(String tel);

}
