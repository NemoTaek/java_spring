package org.example;

public class Galaxy implements Phone{
    @Override
    public String getManufacturer() {
        return "Samsung";
    }
    @Override
    public String getOS() {
        return "Android";
    }
}
