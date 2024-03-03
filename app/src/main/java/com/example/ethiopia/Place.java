package com.example.ethiopia;

// Place.java
public class Place {
    private String name;
    private String description;
    private String wikipediaLink;
    private int imageResourceId;

    private int desImageOne;
    private int desImageTwo;
    private int desImageThree;

    public Place(String name, String description, String wikipediaLink, int imageResourceId,int d1, int d2, int d3) {
        this.name = name;
        this.description = description;
        this.wikipediaLink = wikipediaLink;
        this.imageResourceId = imageResourceId;
        this.desImageOne = d1;
        this.desImageTwo = d2;
        this.desImageThree = d3;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getWikipediaLink() {
        return wikipediaLink;
    }

    public int getImageResourceId() {return imageResourceId;}

    public int getDesImageOne() {
        return desImageOne;
    }

    public int getDesImageTwo() {
        return desImageTwo;
    }

    public int getDesImageThree() {
        return desImageThree;
    }


}
