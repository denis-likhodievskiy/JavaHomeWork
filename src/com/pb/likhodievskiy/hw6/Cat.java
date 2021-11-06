package com.pb.likhodievskiy.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private String mood;

    public Cat(String food, String location, String mood) {
        super(food, location);
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat make noise");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public String toString() {
        return "Cat";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;

        return Objects.equals(getFood(), cat.getFood())
                && Objects.equals(getLocation(), cat.getLocation())
                && Objects.equals(mood, cat.getMood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFood(), getLocation(), mood);
    }
}