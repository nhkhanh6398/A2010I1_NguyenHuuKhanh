package vn.fpt.controller;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.fpt.service.BookService;
import vn.fpt.service.CatagoryService;

@Controller
public class ViewController {
    @Autowired
    BookService bookService;
    @Autowired
    CatagoryService catagoryService;

    @GetMapping("/")
    public String homeView(Model model, @PageableDefault (value = 6) Pageable pageable ) {
        model.addAttribute("book", bookService.findAll(pageable));
        model.addAttribute("catagory", catagoryService.findAllCatagory());
        return "/view/view";
    }

    @GetMapping("/catagorybook/{id}")
    public String findByNameCatagory(@PathVariable String id, Model model) {
        model.addAttribute("book", bookService.findBookByNameCatagory(id));
        model.addAttribute("catagory", catagoryService.findAllCatagory());
        return "/view/view";
    }

    @PostMapping("/findBookByName")
    public String findBook(@RequestParam("key") String key, Model model) {
        model.addAttribute("book", bookService.findAllByName(key));
        model.addAttribute("catagory", catagoryService.findAllCatagory());
        return "/view/view";
    }

    @PostMapping("/search")
    public String search(@RequestParam("key") String key, @RequestParam("change") String change, Model model) {
        if (change.equals("book")) {
            model.addAttribute("book", bookService.findAllByName(key));
            model.addAttribute("catagory", catagoryService.findAllCatagory());
            return "/view/view";
        } else if (change.equals("author")){
            model.addAttribute("book", bookService.findByAuthorContaining(key));
            model.addAttribute("catagory", catagoryService.findAllCatagory());
            return "/view/view";
        }
        return null;
    }
    @GetMapping("/bookview/{id}")
    public String bookView(@PathVariable int id, Model model){
        model.addAttribute("book", bookService.findBookById(id));
        model.addAttribute("catagory", catagoryService.findAllCatagory());
        return "/view/bookView";
    }
}
