package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Employee;
import vn.codegym.service.division.DivisionService;
import vn.codegym.service.education.EducationService;
import vn.codegym.service.employee.EmployeeService;
import vn.codegym.service.position.PositionService;

@Controller

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    PositionService positionService;
    @Autowired
    EducationService educationService;
    @Autowired
    DivisionService divisionService;

    @GetMapping("/employee")
    public String homeEmployee(Model model,@PageableDefault(value = 5) Pageable pageable){
        model.addAttribute("list", employeeService.findAll(pageable));
        return "employee/homeEmployee";
    }
    @GetMapping("/createEmployee")
    public String homeCreate(Employee employee,Model model){
        model.addAttribute("employee", new Employee());
        model.addAttribute("listPosition", positionService.finall());
        model.addAttribute("listEducation", educationService.finall());
        model.addAttribute("listDivision", divisionService.finall());
        return "employee/createEmployee";
    }
    @PostMapping("/addEmployee")
    public String addEmployee(@Validated @ModelAttribute Employee employee, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("listPosition", positionService.finall());
            model.addAttribute("listEducation", educationService.finall());
            model.addAttribute("listDivision", divisionService.finall());
            return "employee/createEmployee";
        }
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Create Employee!");
        return "redirect:/employee";
    }

}
