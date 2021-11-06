package com.pb.likhodievskiy.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("meat", "Dnipro", "large");
        Cat cat = new Cat("fish", "Kyiv", "lazy");
        Horse horse = new Horse("grass", "Lviv", "black");

        Animal[] animals = {dog, cat, horse};

        Class vetClazz = Class.forName("com.pb.likhodievskiy.hw6.Veterinarian");
        Constructor constr = vetClazz.getConstructor();
        Object veterinarian = constr.newInstance();

        if (veterinarian instanceof Veterinarian) {
            for (Animal animal: animals) {
                ((Veterinarian) veterinarian).treatAnimal(animal);
            }
        }
    }
}