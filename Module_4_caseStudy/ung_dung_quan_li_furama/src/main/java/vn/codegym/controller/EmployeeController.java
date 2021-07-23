package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.codegym.service.employee.EmployeeService;

@Controller

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public String homeEmployee(Model model,@PageableDefault(value = 5) Pageable pageable){
        model.addAttribute("list", employeeService.findAll(pageable));
        return "employee/homeEmployee";
    }
}
