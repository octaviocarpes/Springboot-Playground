package SpringbootBlogAPI.SpringbootBlogAPI;

import SpringbootBlogAPI.SpringbootBlogAPI.db.BlogDatabase;
import SpringbootBlogAPI.SpringbootBlogAPI.pojo.Blog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBlogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogApiApplication.class, args);
	}
}
