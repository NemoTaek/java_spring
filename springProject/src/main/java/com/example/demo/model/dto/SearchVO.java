package com.example.demo.model.dto;

public class SearchVO {
    private int idx;
    private String username;
    private String email;
    private int age;

    public int getIdx() { return idx; }
    public void setIdx(int idx) {
        this.idx = idx;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
