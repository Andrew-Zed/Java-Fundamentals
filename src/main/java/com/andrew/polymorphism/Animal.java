package com.andrew.polymorphism;

public class Animal {

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("munch munch");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
