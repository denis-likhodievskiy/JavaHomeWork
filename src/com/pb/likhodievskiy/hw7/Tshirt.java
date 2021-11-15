package com.pb.likhodievskiy.hw7;

public class Tshirt extends Clothes implements MenClothes, WomenClothes {

    public Tshirt(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Name: men's tshirt, size: " + size.getEuroSize() + " (" + size.getDescription() + "), price: " + price + ", color: " + color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Name: women's tshirt, size: " + size.getEuroSize() + " (" + size.getDescription() + "), price: " + price + ", color: " + color);
    }
}