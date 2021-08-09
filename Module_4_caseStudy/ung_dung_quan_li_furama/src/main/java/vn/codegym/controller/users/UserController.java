package vn.codegym.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Employee;
import vn.codegym.model.User;
import vn.codegym.service.users.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/createAccount")
    public String home(Model model){
        model.addAttribute("member",new User());
        return "user/createUser";
    }
    @PostMapping("/addMember")
    public String add(@ModelAttribute User user){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.save(user);
        return "redirect:/login";
    }
}
