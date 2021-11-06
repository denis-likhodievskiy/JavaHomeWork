package com.pb.likhodievskiy.hw6;

import java.util.Objects;

public class Dog extends Animal {

    private String size;

    public Dog(String food, String location, String size) {
        super(food, location);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog make noise");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public String toString() {
        return "Dog";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog dog = (Dog) obj;

        return Objects.equals(getFood(), dog.getFood())
                && Objects.equals(getLocation(), dog.getLocation())
                && Objects.equals(size, dog.getSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFood(), getLocation(), size);
    }
}