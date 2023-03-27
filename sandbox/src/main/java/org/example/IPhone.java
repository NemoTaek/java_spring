package org.example;

public class IPhone implements Phone{
    @Override
    public String getManufacturer() {
        return "Apple";
    }
    @Override
    public String getOS() {
        return "MacOS";
    }
    @Override
    public void printRing() {
        System.out.println("아이폰이 울린다. 우우우우우우웅");
    }
}
