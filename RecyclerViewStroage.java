package com.marketplace.recycler_view;

public class storagerecycler {
    String first;
    String second;
    int image;
    int image2;

    public storagerecycler(String first, String second, int image, int image2) {
        this.first = first;
        this.second = second;
        this.image = image;
        this.image2 = image2;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public int getImage() {
        return image;
    }

    public int getImage2(){
        return  image2;
    }
}
