package SpringbootBlogAPI.SpringbootBlogAPI.controller;


import SpringbootBlogAPI.SpringbootBlogAPI.db.BlogDatabase;
import SpringbootBlogAPI.SpringbootBlogAPI.pojo.Blog;
import SpringbootBlogAPI.SpringbootBlogAPI.service.BlogService;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class BlogController {

    public BlogService blogService;

    @RequestMapping(
            value = "/blogs",
            method = RequestMethod.GET
    )
    public JSONArray getAllBlogs(){
        blogService = new BlogService();
        blogService.fillDatabase();
        JSONArray result = new JSONArray();
        for (Blog blog:BlogDatabase.getInstance().getBlogList()
             ) {
            result.put(blog);
        }
        return result;
    }

    @RequestMapping(
            value = "/blogs/ {name}",
            method = RequestMethod.GET
    )
    public String getBlog(@PathVariable Optional<String> name){
        return "Blog"+ name +"here!";
    }

}
