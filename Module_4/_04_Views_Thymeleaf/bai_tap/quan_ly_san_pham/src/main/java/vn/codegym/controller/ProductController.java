package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.bean.Product;
import vn.codegym.model.service.ProductService;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String home(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("list", products);
        return "home";
    }
    @GetMapping("/create")
    public String homeCreate(Model model){
        model.addAttribute("product", new Product());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Product product){
        productService.save(product);
        return "redirect:/";
    }
    @GetMapping("/product/{id}/edit")
    public String homeEdit(@PathVariable int id, Model model){
        model.addAttribute("product", productService.finById(id));
        return "edit";
    }
    @PostMapping("/update")
    public String create(@ModelAttribute Product product, @RequestParam ("id") int id){
        productService.update(id,product);
        return "redirect:/";
    }
    @GetMapping("/product/{id}/delete")
    public String homeDelete(@PathVariable int id, Model model){
        model.addAttribute("product", productService.finById(id));
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(@ModelAttribute Product product, @RequestParam int id){
        productService.remove(id);
        return "redirect:/";
    }
    @GetMapping("/product/{id}/view")
    public String homeView(@PathVariable int id, Model model){
        model.addAttribute("product", productService.finById(id));
        return "view";
    }
    @PostMapping("/view")
    public String view(@ModelAttribute Product product, @RequestParam int id){
        productService.finById(id);
        return "redirect:/";
    }
}
