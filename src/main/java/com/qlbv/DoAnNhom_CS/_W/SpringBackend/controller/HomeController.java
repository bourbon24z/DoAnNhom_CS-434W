package com.qlbv.DoAnNhom_CS._W.SpringBackend.controller;


import com.qlbv.DoAnNhom_CS._W.SpringBackend.entity.User;
import com.qlbv.DoAnNhom_CS._W.SpringBackend.service.RoleService;
import com.qlbv.DoAnNhom_CS._W.SpringBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class HomeController {
    private final UserService userService;
    private final RoleService roleService;
    @Autowired
    public HomeController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }
    @GetMapping("/signUP")
    public String signUP(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("roleList", roleService.getRoles());
        return "Register/register";
    }

    @PostMapping("/register-user")
    public String registerNewUser(@ModelAttribute("user") User user)
    {
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/")
    public String getHomePage(Model model, HttpSession session) {
        User loggedInUser = (User) session.getAttribute("loggedInUser");
        model.addAttribute("loggedInUser", loggedInUser);
        return "Home/index";
    }
}
