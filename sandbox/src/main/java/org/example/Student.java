package org.example;

public abstract class Student {
    public String name;

    public void printInfo() {
        System.out.println("학생 이름은 " + name + " 입니다.");
    }

    public abstract void printSchool();
}
