package vn.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SandWichController {
    @RequestMapping(value = "/sandwich",method = RequestMethod.GET)
    public String mainHome(){
        return "sandwich";
    }
    @RequestMapping(value = "/sandwich",method = RequestMethod.POST)
    public String mainPost(@RequestParam("c") String[] c, Model model){
        model.addAttribute("c",c);
        return "sandwich";
    }
}