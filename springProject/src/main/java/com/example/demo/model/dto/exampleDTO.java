package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 데이터를 주고받을 때 사용하는 객체인 DTO 파일
public class exampleDTO {
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
