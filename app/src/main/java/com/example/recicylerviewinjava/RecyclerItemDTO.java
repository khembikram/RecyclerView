package com.example.recicylerviewinjava;

public class RecyclerItemDTO {

    String languagees;
    int itemImages;

    public String getLanguagees() {
        return languagees;
    }

    public int getItemImages() {
        return itemImages;
    }

    public void setLanguagees(String languagees) {
        this.languagees = languagees;
    }

    public void setItemImages(int itemImages) {
        this.itemImages = itemImages;
    }

    public RecyclerItemDTO(String languagees, int itemImages) {
        this.languagees = languagees;
        this.itemImages = itemImages;
    }

}
