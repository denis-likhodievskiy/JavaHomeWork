package com.pb.likhodievskiy.hw7;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressWoman() {
        System.out.println("Name: skirt, size: " + size.getEuroSize() + " (" + size.getDescription() + "), price: " + price + ", color: " + color);
    }
}