package com.pb.likhodievskiy.hw7;

public class Tie extends Clothes implements MenClothes {

    public Tie(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressMan() {
        System.out.println("Name: tie, size: " + size.getEuroSize() + " (" + size.getDescription() + "), price: " + price + ", color: " + color);
    }
}