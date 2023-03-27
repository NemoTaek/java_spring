package org.example;

public class SeoulStudent extends Student {
    String school;
    public SeoulStudent(String name) {
        this.name = name;
        school = "서울대학교";
    }
    @Override
    public void printSchool() {
        System.out.println(this.name + " 학생은 " + school + "에 재학중입니다.");
    }
}
