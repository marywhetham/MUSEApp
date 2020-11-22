package com.example.muse_android.objects;

public class Article {

    private String id;
    private String title;
    private String content;
    private String slug;
    private String image;
    private String URL;

    public Article(String id, String title, String content, String slug, String image) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.slug = slug;
        this.image = image;
        String URL = "http://www.muse-magazine.com/" + slug;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getSlug() {
        return slug;
    }

    public String getImage() {
        return image;
    }

    public String getURL() {
        return URL;
    }
}
