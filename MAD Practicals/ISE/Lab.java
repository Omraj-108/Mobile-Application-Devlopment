package com.yash.a110t5;

import java.io.Serializable;

public class Lab implements Serializable {
    private String name;
    private int imageResId;
    private String description;

    public Lab(String name, int imageResId, String description) {
        this.name = name;
        this.imageResId = imageResId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }
}