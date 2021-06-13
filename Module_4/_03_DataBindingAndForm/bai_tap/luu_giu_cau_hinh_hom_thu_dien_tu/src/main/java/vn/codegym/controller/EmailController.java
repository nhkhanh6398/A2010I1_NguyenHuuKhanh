package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.codegym.model.Mail;
import vn.codegym.service.MailService;

@Controller
public class EmailController {
    @GetMapping(value = "/home")
    public String home(Model model){
        model.addAttribute("mail",mailService.find());
        return "home";
    }
    @Autowired
    MailService mailService;
    @RequestMapping(value = "/home" ,method = RequestMethod.POST)
    public String editMail(@ModelAttribute("mail") Mail mail, BindingResult bindingResult ){
        if (bindingResult.hasErrors()){
            return "home";
        }else {
            mailService.updateMail(mail);
            return "home";
        }
    }
}
