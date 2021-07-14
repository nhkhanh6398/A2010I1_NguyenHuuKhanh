package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Cart;
import vn.codegym.model.Product;
import vn.codegym.service.ProductService;

import java.util.HashMap;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    ProductService productService;

    @ModelAttribute("cart")
    public HashMap<Integer, Cart> getShow(){
        return new HashMap<Integer, Cart>();
    }
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("list", productService.findALl());
        return "home";
    }
    @GetMapping("/create")
    public String create(Product product,Model model){
        model.addAttribute("product", new Product());
        return "create";

    }
    @PostMapping("/createProduct")
    public String createProduct(@ModelAttribute Product product, Model model){
        productService.save(product);
        return "redirect:/";
    }
    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable int id,Model model,@ModelAttribute("cart") HashMap<Integer,Cart> cartHashMap){
        Product product = productService.findById(id);
        model.addAttribute("carts", cartHashMap);
        model.addAttribute("product", product);
        return "view";
    }
}
