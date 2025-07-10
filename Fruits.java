package com.app.fruits;

public class Fruits {

    private String name;
    private String color;
    private double weight;
    private boolean isfresh = true;

    public Fruits(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isFresh() {
        return isfresh;
    }

    public void setFresh(boolean isfresh) {
        this.isfresh = isfresh;
    }

    public String taste() {
        return "no specific taste";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight + ", Fresh: " + isfresh;
    }
}
