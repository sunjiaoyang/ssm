package com.zyh.controller;

import com.zyh.entity.User;
import com.zyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public String findUser(Model model){
        int id = 1;
        User user = userService.findUserByid(id);
        System.out.println("zyhzyhzyhzyhzyh");
        model.addAttribute("user",user);
        return "/index";
    }
}
