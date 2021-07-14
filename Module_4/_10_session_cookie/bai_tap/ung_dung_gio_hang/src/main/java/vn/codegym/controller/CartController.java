package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;
import vn.codegym.model.Cart;
import vn.codegym.model.Product;
import vn.codegym.service.ProductService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CartController {
    @Autowired
    private ProductService productService;

    @GetMapping("/buy")
    public String ShowCart(@SessionAttribute("cart") HashMap<Integer, Cart> cartHashMap, Model model) {
        model.addAttribute("carts", cartHashMap);
        model.addAttribute("cartNum", cartHashMap.size());
        model.addAttribute("cartMoney", totalPrice(cartHashMap));
        return "cart";
    }

    @GetMapping("/buycart/{id}")
    public String addCart(@PathVariable int id, @SessionAttribute("cart") HashMap<Integer, Cart> cartHashMap, Model model) {
        if (cartHashMap == null) {
            cartHashMap = new HashMap<>();
        }
        Product product = productService.findById(id);
        if (product != null) {
            if (cartHashMap.containsKey(id)) {
                Cart item = cartHashMap.get(id);
                item.setProduct(product);
                item.setQuantity(item.getQuantity() + 1);
                cartHashMap.put(id, item);
            } else {
                Cart item = new Cart();
                item.setProduct(product);
                item.setQuantity(1);
                cartHashMap.put(id, item);
            }
        }
        model.addAttribute("cart", cartHashMap);
        model.addAttribute("cartNum", cartHashMap.size());
        model.addAttribute("cartMoney", totalPrice(cartHashMap));
        return "redirect:/buy";
    }

    @GetMapping("/delete/{id}")
    public String deleteCart(@PathVariable int id, @SessionAttribute("cart") HashMap<Integer,Cart> cartHashMap, Model model){
        if (cartHashMap == null){
            cartHashMap = new HashMap<>();

        }
        cartHashMap.remove(id);
        model.addAttribute("cart", cartHashMap);
        model.addAttribute("cartNum", cartHashMap.size());
        model.addAttribute("cartMoney", totalPrice(cartHashMap));
        return "redirect:/buy";
    }
    private Object totalPrice(HashMap<Integer, Cart> cartHashMap) {
        int count = 0;
        for (Map.Entry<Integer, Cart> list : cartHashMap.entrySet()) {
            count += list.getValue().getProduct().getPrice() * list.getValue().getQuantity();
        }
        return count;
    }
}
