package com.seu.fff.controller;

import com.seu.fff.pojo.User;
import com.seu.fff.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Fremon on 2017/2/27.
 */
@Controller
public class Thymeleaftest {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/user/{id}")
    public String findOneUser(@PathVariable("id") Integer id,Model model) {


         User user= userService.findUserById(id);
        model.addAttribute("user",user);
        return "/html/login";
    }

}
