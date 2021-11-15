package com.pb.likhodievskiy.hw7;

public class Pants extends Clothes implements MenClothes, WomenClothes {

    public Pants(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Name: men's pants, size: " + size.getEuroSize() + " (" + size.getDescription() + "), price: " + price + ", color: " + color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Name: women's pants, size: " + size.getEuroSize() + " (" + size.getDescription() + "), price: " + price + ", color: " + color);
    }
}