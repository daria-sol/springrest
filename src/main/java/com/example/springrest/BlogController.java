package com.example.springrest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {

   @Autowired
   BlogRepository blogRepository;

   @Autowired
   JdbcTemplate jdbcTemplate;

   @RequestMapping("/blogs")
   public List<Blog> greet() {
       return blogRepository.findAll();
   }

   @GetMapping("/blogs/{id}")
   public Blog greetBlog(@PathVariable int id) {
      return blogRepository.findById(id);
   }



}