package com.pb.likhodievskiy.hw6;

import java.util.Objects;

public class Horse extends Animal {

    private String color;

    public Horse(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse make noise");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat");
    }

    @Override
    public String toString() {
        return "Horse";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Horse horse = (Horse) obj;

        return Objects.equals(getFood(), horse.getFood())
                && Objects.equals(getLocation(), horse.getLocation())
                && Objects.equals(color, horse.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFood(), getLocation(), color);
    }
}