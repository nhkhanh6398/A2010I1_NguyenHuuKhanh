package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Blog;
import vn.codegym.service.BlogService;
import vn.codegym.service.CategoryService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/")
    public String home(Model model, @PageableDefault(size = 3) Pageable pageable){
        model.addAttribute("list",blogService.fillAllBlog(pageable));
        return "/blog/home";
    }
    @GetMapping("/create")
    public String createHome(Model model){
        model.addAttribute("blog", new Blog());
        model.addAttribute("listCategory", categoryService.findAll());
        return "/blog/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, @RequestParam("date1") String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
            date1 = simpleDateFormat.parse(date);
            blog.setDate(date1);
        }catch (ParseException e){
            return "/blog/create";
        }
        blogService.save(blog);
        return "redirect:/";
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id){
        blogService.remove(id);
        return "redirect:/";
    }
    @GetMapping("edit/{id}")
    public String editHome(@PathVariable int id, Model model){
    Blog blog = blogService.findById(id);
    if (blog!=null){
        model.addAttribute("blog", blog);
        return "/blog/edit";
    }else {
        model.addAttribute("message", "Not found ");
        return "/blog/home";
    }
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Blog blog,Model model){
        blogService.save(blog);
        model.addAttribute("message", "Blog" +blog.getName()+ "updated");
        return "redirect:/";
    }
}
