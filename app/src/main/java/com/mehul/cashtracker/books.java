package com.mehul.cashtracker;

import android.widget.ImageView;

/**
 * Created by Mehul on 5/14/2017.
 */
public class books {

    private String title, author_name, description;
    int rating;
    String imageView;

    public books() {
    }

    public books(String title, String author_name, String description, int rating, String imageView) {
        this.title = title;
        this.author_name = author_name;
        this.description = description;
        this.rating = rating;
        this.imageView = imageView;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImageView() {
        return imageView;
    }

    public void setImageView(String imageView) {
        this.imageView = imageView;
    }
}