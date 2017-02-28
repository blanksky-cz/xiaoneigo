package com.seu.fff.service;

import com.seu.fff.pojo.User;

import java.util.List;

/**
 * Created by Fremon on 2017/2/27.
 */
public interface UserService {

    List<User> findAllUser();


    User findUserById(Integer id);


   int saveUser(User user);


   int updateUser(User user);


    int deleteUserById(Integer id);
}
