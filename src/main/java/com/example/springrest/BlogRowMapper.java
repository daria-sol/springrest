package com.example.springrest;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BlogRowMapper implements RowMapper<Blog> {

      @Override
      public Blog mapRow(ResultSet rs, int rowNum) throws SQLException {

         Blog blog = new Blog();
         blog.setId(rs.getInt("id"));
         blog.setTitle(rs.getString("title"));
         blog.setContent(rs.getString("content"));


         return blog;

   }
}
