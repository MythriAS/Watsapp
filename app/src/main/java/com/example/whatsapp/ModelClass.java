package com.example.whatsapp;

public class ModelClass {
    private int image;
    private String describtion1;
    private String describtion2;

    public ModelClass(int image, String describtion1, String describtion2) {
        this.image = image;
        this.describtion1 = describtion1;
        this.describtion2 = describtion2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescribtion1() {
        return describtion1;
    }

    public void setDescribtion1(String describtion1) {
        this.describtion1 = describtion1;
    }

    public String getDescribtion2() {
        return describtion2;
    }

    public void setDescribtion2(String describtion2) {
        this.describtion2 = describtion2;
    }
}
