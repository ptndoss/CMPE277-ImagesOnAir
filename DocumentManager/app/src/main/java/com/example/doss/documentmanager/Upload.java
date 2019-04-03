package com.example.doss.documentmanager;

public class Upload {
    private String name;
    private String imageURL;


    public Upload(){

    }
    public Upload(String name, String URL){
        if(name.trim().equalsIgnoreCase("")){
            name = "Image";
        }

        this.name = name;
        this.imageURL = URL;
    }

    public void setName(String name){
        this.name = name;

    }
    public void setImageURL(String URL){
        this.imageURL = URL;
    }

    public String getName(){
        return name;
    }
    public String getImageURL(){
        return imageURL;
    }
}
