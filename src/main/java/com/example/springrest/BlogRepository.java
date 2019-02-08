package com.example.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BlogRepository {

   @Autowired
   JdbcTemplate jdbcTemplate;


   public Blog findById(int id) {
      return jdbcTemplate.queryForObject("select * from blog where id=?", new Object[]{
                      id
              },
              new BeanPropertyRowMapper<Blog>(Blog.class));
   }

   public List<Blog> findAll() {
      return jdbcTemplate.query("select * from blog", new BlogRowMapper());
   }


}
