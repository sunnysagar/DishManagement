package com.sunny.Dishes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dish {

    @Id
    private int dishId;

    private String dishName;
    private String imageUrl;

    @JsonProperty("isPublished")   // for exact name
    private Boolean isPublished;

    public Dish() {
    }

    public Dish(int dishId, String dishName, String imageUrl, Boolean isPublished) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.imageUrl = imageUrl;
        this.isPublished = isPublished;
    }

    public long getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("isPublished")
    public Boolean isPublished() {
        return isPublished;
    }

    @JsonProperty("isPublished")
    public void setPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }
}
