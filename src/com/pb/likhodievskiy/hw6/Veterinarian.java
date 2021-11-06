package com.pb.likhodievskiy.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Animal: " + animal + ", food: " + animal.getFood() + ", location: " + animal.getLocation());
    }
}