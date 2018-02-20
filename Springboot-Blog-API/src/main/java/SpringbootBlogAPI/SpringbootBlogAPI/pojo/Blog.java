package SpringbootBlogAPI.SpringbootBlogAPI.pojo;

public class Blog {

    private String blogName;
    private String blogUrl;
    private String blogImgUrl;

    public Blog(String blogName, String blogUrl, String blogImgUrl) {
        this.blogName = blogName;
        this.blogUrl = blogUrl;
        this.blogImgUrl = blogImgUrl;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public String getBlogImgUrl() {
        return blogImgUrl;
    }

    public void setBlogImgUrl(String blogImgUrl) {
        this.blogImgUrl = blogImgUrl;
    }
}
