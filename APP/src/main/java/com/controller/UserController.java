package com.controller;

import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.IUserService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by py on 2017/3/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/find")
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);

        return "user";
    }
}

