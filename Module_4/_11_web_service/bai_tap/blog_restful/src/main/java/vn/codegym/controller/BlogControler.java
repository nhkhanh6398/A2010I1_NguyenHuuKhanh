package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Blog;
import vn.codegym.service.BlogService;

import java.util.List;

@RestController
public class BlogControler {
    @Autowired
    BlogService blogService;

    @GetMapping("/blog/")
    public ResponseEntity<List<Blog>> lissAll() {
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @PostMapping("/blog/post")
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog){
        blogService.save(blog);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/blog/put")
    public ResponseEntity<Blog> updateBlog(@PathVariable int id,@RequestBody Blog blog){
        Blog blog1 = blogService.findById(id);
        if (blog1==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog1.setUser(blog.getUser());
        blog1.setContent(blog.getContent());
        blogService.save(blog1);
        return new ResponseEntity<>(blog1,HttpStatus.OK);
    }
    @DeleteMapping("/blog/delete")
    public ResponseEntity<Blog> deleteBlog(@PathVariable int id){
        Blog blog = blogService.findById(id);
        if (blog == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(blog);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
