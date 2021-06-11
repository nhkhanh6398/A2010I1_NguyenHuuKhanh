package vn.codegym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculation {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String homeMain(@RequestParam("one") int one, @RequestParam("cal") String cala, @RequestParam("two") int two, Model model) {
        int result = 0;
        switch (cala) {
            case "+":
                result = one + two;
                break;
            case "-":
                result = one - two;
                break;
            case "*":
                result = one * two;
                break;
            case "/":
                if (two != 0){
                    result = one / two;
                }
                
                break;
            default:
                break;
        }
        model.addAttribute("one", one);
        model.addAttribute("two", two);
        model.addAttribute("result", result);
        return "home";
    }
}
