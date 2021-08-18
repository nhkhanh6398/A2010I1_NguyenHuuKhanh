package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Promotion;
import vn.codegym.service.PromotionService;

@Controller
public class PromotionController {
    @Autowired
    private PromotionService promotionService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("list", promotionService.finAll());
        return "home";
    }

    @GetMapping("/create")
    public String homeCreate(Promotion promotion, Model model) {
        model.addAttribute("promotion", new Promotion());
        return "create";
    }

    @PostMapping("/addPromotion")
    public String create(@Validated @ModelAttribute Promotion promotion, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }
        promotionService.save(promotion);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String homeDelete(@PathVariable Integer id, Model model) {
        Promotion promotion = promotionService.findById(id);
        model.addAttribute("promotion", promotion);
        return "delete";
    }

    @PostMapping("/actionDeleteEmployee/{id}")
    public String deleteEmployee(@ModelAttribute Promotion promotion, Model model) {
        promotionService.delete(promotion.getId());
        model.addAttribute("list", promotionService.finAll());
        return "deleted";
    }
    @GetMapping("/getSearch")
    public String homeSearch(){
        return "homeSearch";
    }
    @PostMapping("/search")
    public String search(@RequestParam ("key") String key, @RequestParam("change") String change, Model model){
        if (change.equals("title")){
            model.addAttribute("list",promotionService.findAllByName(key));
            return "home";
        }
        if (change.equals("dateStart")){
            model.addAttribute("list",promotionService.findAllByDayStart(key));
            return "home";
        }
        if (change.equals("dateEnd")){
            model.addAttribute("list",promotionService.findAllByDayEnd(key));
            return "home";
        }
        return null;
    }

}
