package vn.codegym.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Service;
import vn.codegym.service.service.ServiceService;

@Controller
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @GetMapping("/service")
    public String homeService(Model model, @PageableDefault (5)Pageable pageable){
        model.addAttribute("service", serviceService.findAll(pageable));
        model.addAttribute("selectName" ,"customer");
        return "service/homeService";
    }
    @GetMapping("/viewService/{id}")
    public String getView(@PathVariable String id, Model model){
        model.addAttribute("service", serviceService.findById(id));
        model.addAttribute("selectName" ,"customer");
        return "service/getView";
    }
    @GetMapping("/createService")
    public String getCreate(Model model){
        model.addAttribute("service", new Service());
        model.addAttribute("selectName" ,"customer");
        return "service/getCreate";
    }
    @PostMapping("/addService")
    public String create(@Validated @ModelAttribute Service service, BindingResult bindingResult,Model model){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("selectName" ,"customer");
            return "service/getCreate";
        }
        model.addAttribute("selectName" ,"customer");
        serviceService.save(service);
        return "redirect:/service";
    }
    @GetMapping("/getDeleteService/{id}")
    public String getDelete(@PathVariable String id, Model model){
        model.addAttribute("service",serviceService.findById(id));
        model.addAttribute("selectName" ,"customer");
        return "service/getDelete";
    }
    @PostMapping("/deleteService/{id}")
    public String delete(@PathVariable String id,Pageable pageable, Model model){
        serviceService.delete(id);
        model.addAttribute("service", serviceService.findAll(pageable));
        model.addAttribute("selectName" ,"customer");
        return "service/delete";
    }
    @GetMapping("/updateService/{id}")
    public String getUpdate(@PathVariable String id, Model model){
        model.addAttribute("service", serviceService.findById(id));
        model.addAttribute("selectName" ,"customer");
        return "service/getUpdate";
    }
    @PostMapping("/editSerivce")
    public String edit(@ModelAttribute Service service,Model model){
        model.addAttribute("selectName" ,"customer");
        serviceService.save(service);
        return "redirect:/service";
    }
}
