package vn.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;


@Controller
public class MainController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome(Model model) {
        return "home";
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String translate(@RequestParam String input, Model model){
       String vn = null;
       switch (input){
           case "hello":
               vn = "Xin chào";
               break;
           case "bye":
               vn = "tạm biệt";
               break;
           case "dog":
               vn = "con chó";
               break;
           case "cat":
               vn = "con mèo";
               break;
           default:
               vn = "not find";
               break;
       }
        model.addAttribute("vn", vn);
       model.addAttribute("en", input);
       return "home";
    }


}
