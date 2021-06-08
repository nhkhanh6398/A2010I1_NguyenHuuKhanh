package vn.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class ControllerMain {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getMain(Model model){
        return "home";
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView  main (HttpServletRequest request, HttpServletResponse response){
       int vnd= Integer.parseInt(request.getParameter("vnd"));
       int result = vnd * 22000;
       return new ModelAndView("home","result" ,result);
    }
}
