package vn.codegym.controller.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/getSearchEmployee")
    public String getSearch(){
        return "employee/searchEmployee";
    }
    @PostMapping("/searchEmployee")
    public String searchEmployee(@RequestParam("searchEmployee") String searchEmployee,Model model, @PageableDefault(value = 5) Pageable pageable){
        model.addAttribute("list", employeeService.findAllByNameConaining(searchEmployee,pageable));
        return "employee/getSearchEmployee";
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
    @GetMapping("/viewEmployee/{id}")
    public String getView(@PathVariable int id, Model model){
        model.addAttribute("employee",employeeService.findById(id));
        return "employee/viewEmployee";
    }
    @GetMapping("/delete/{id}")
    public String getDelete(@PathVariable int id,Model model){
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "employee/deleteEmployee";
    }
    @PostMapping("/actionDeleteEmployee/{id}")
    public String deleteEmployee(@ModelAttribute Employee employee, Pageable pageable, Model model){
        employeeService.delete(employee.getId());
        model.addAttribute("list", employeeService.findAll(pageable));
        return "employee/deleted";
    }
    @GetMapping("/update/{id}")
    public String getUpdate(@PathVariable int id, Model model){
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee",employee);
        model.addAttribute("listPosition", positionService.finall());
        model.addAttribute("listEducation", educationService.finall());
        model.addAttribute("listDivision", divisionService.finall());
        return "employee/editEmployee";
    }
    @PostMapping("/editEmployee")
    public String update(@Validated @ModelAttribute Employee employee, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("listPosition", positionService.finall());
            model.addAttribute("listEducation", educationService.finall());
            model.addAttribute("listDivision", divisionService.finall());
            return "employee/editEmployee";
        }
        employeeService.save(employee);
        return "redirect:/employee";
    }
}
