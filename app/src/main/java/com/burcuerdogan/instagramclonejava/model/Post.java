package com.burcuerdogan.instagramclonejava.model;

public class Post {

    public String username;
    public String email;
    public String comment;
    public String downloadUrl;

    public Post(String username, String email, String comment, String downloadUrl) {
        this.username = username;
        this.email = email;
        this.comment = comment;
        this.downloadUrl = downloadUrl;
    }
}
