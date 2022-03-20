package com.ecommerce.Dto;

public class User {
    private int userId;
    private String userEmail;
    private String name;

    public User(int userId, String userEmail, String name) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
