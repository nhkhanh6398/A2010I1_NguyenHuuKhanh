package vn.codegym.controller.customer;

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
import vn.codegym.model.Customer;
import vn.codegym.repository.customer.CustomerTypeRepository;
import vn.codegym.service.customer.CustomerService;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @GetMapping("/customer")
    public String getCustomer(Model model, @PageableDefault(5) Pageable pageable){
        model.addAttribute("customer",customerService.findAll(pageable));
        return "customer/homeCustomer";
    }
    @GetMapping("/createCustomer")
    public String getCreate(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("type",customerTypeRepository.findAll());
        return "customer/homeCreate";
    }
    @PostMapping("/addCustomer")
    public String addCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("type",customerTypeRepository.findAll());
            return "customer/homeCreate";
        }
        customerService.save(customer);
        return "redirect:/customer";
    }
}
