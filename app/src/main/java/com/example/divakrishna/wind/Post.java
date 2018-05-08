package com.example.divakrishna.wind;

public class Post {
    private String desc;

    private String username;

    private String userimage;

    public Post(){

    }

    public Post(String desc, String username, String userimage) {

        this.desc = desc;
        this.username = username;
        this.userimage = userimage;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }
}
