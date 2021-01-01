package com.example.muse_android.objects;

public class CategoryArticle {

    private String id;
    private String title;
    private String image;
    private String description;
    private String categoryName;

    public CategoryArticle(String id, String title, String image, String description, String categoryName) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.categoryName = categoryName;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
