package SpringbootBlogAPI.SpringbootBlogAPI.db;

import SpringbootBlogAPI.SpringbootBlogAPI.pojo.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogDatabase {

    private List<Blog> blogList;
    private static BlogDatabase instance;

    public static BlogDatabase getInstance(){
        if (instance == null)instance = new BlogDatabase();
        return instance;
    }

    private BlogDatabase() {
        blogList = new ArrayList<>();
    }

    public void addBlog(Blog blogToBeAdded){
        blogList.add(blogToBeAdded);
    }

    public Blog getBlog(String blogUrl){

        for (Blog blog:blogList) {
            if (blog.getBlogUrl().equals(blogUrl)){
                return blog;
            }
        }
        return null;
    }

    public List<Blog> getBlogList() {
        return blogList;
    }
}
