package SpringbootBlogAPI.SpringbootBlogAPI.service;

import SpringbootBlogAPI.SpringbootBlogAPI.db.BlogDatabase;
import SpringbootBlogAPI.SpringbootBlogAPI.pojo.Blog;

public class BlogService {

    public BlogService() {
    }

    public void fillDatabase(){
        Blog blog1 = new Blog("Dev.to","https://dev.to/","https://pbs.twimg.com/profile_images/963989679237246977/0ccebuVz_400x400.jpg");
        Blog blog2 = new Blog("Treehouse","http://blog.teamtreehouse.com/","https://pbs.twimg.com/profile_images/378800000120934863/af36998196339688895927c8adf0ed6d_400x400.png");
        Blog blog3 = new Blog("Scotch","https://scotch.io/","https://avatars1.githubusercontent.com/u/2521724?s=280&v=4");
        Blog blog4 = new Blog("Coding Horror","https://blog.codinghorror.com/","http://devstickers.com/assets/img/pro/imad.png");
        Blog blog5 = new Blog("Daily JS","https://medium.com/dailyjs","https://pbs.twimg.com/profile_images/877477206418653184/W63ZlNa1_400x400.jpg");
        Blog blog6 = new Blog("David Walsh","https://davidwalsh.name/","https://davidwalsh.name/wp-content/themes/punky/images/logo.png");
        Blog blog7 = new Blog("Programmable Web","https://www.programmableweb.com/","https://static1.squarespace.com/static/5123c236e4b02be7ede3128a/t/513a583ce4b06017d0d6cc23/1362778173260/ProgrammableWeb+logo.jpg?format=300w");
        Blog blog8 = new Blog("Martin Fowler","https://martinfowler.com/bliki/","https://martinfowler.com/mf-name-white.png");

        BlogDatabase.getInstance().addBlog(blog1);
        BlogDatabase.getInstance().addBlog(blog2);
        BlogDatabase.getInstance().addBlog(blog3);
        BlogDatabase.getInstance().addBlog(blog4);
        BlogDatabase.getInstance().addBlog(blog5);
        BlogDatabase.getInstance().addBlog(blog6);
        BlogDatabase.getInstance().addBlog(blog7);
        BlogDatabase.getInstance().addBlog(blog8);
    }
}
