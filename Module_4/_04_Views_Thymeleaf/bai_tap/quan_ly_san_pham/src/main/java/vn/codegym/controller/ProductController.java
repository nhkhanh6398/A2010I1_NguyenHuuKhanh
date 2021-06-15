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
}
