package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.User;
import vn.codegym.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public String home(User user, Model model){
        model.addAttribute("user", new User());
        return "home";
    }
    @PostMapping("/create")
    public String create(@Validated @ModelAttribute User user, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            return "home";
        }else {
            userService.save(user);
            return "list";
        }


    }
}
