package com.seu.fff.controller;

import com.seu.fff.dao.UserMapper;
import com.seu.fff.pojo.User;
import com.seu.fff.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 *
 *
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public User findOneUser(@PathVariable("id") Integer id) {
        return userService.findUserById(id);
    }

//    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
//    public List<User> findAllUser() { return userService.findAllUser();}

//    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
//    public void createUser(@RequestBody User user) {
//        userService.saveUser(user);
//    }
//
//    @RequestMapping(value = "/api/user", method = RequestMethod.PUT)
//    public void modifyUser(@RequestBody User user) {
//        userService.updateUser(user);
//    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@RequestBody User user)
    {
        System.out.println(user.getUsername()+"1111111111111");
        return  user;
    }
    @RequestMapping(value = "/username",method = RequestMethod.POST)
    public User findUserByName(String username){
        return userMapper.findUserByName(username);
    }
    @RequestMapping(value = "/sex",method = RequestMethod.POST)
    public List<User> findUserBySex1(String sex){
        return userMapper.findUserBySex(sex);
    }

}
