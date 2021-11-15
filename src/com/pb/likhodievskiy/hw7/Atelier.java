package com.pb.likhodievskiy.hw7;

public class Atelier {

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(Size.XXS, 150.00, "green");
        Pants pants = new Pants(Size.XS, 120.00, "black");
        Skirt skirt = new Skirt(Size.M, 100.00, "blue");
        Tie tie = new Tie(Size.L, 110.00, "red");

        Clothes[] clothes = {tshirt, pants, skirt, tie};

        Atelier.dressMan(clothes);
        Atelier.dressWoman(clothes);
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Men clothes:");
        for (Clothes item: clothes) {
            if (item instanceof MenClothes) {
                ((MenClothes) item).dressMan();
            }
        }
    }

    public static void dressWoman(Clothes[] clothes) {
        System.out.println("Women clothes:");
        for (Clothes item: clothes) {
            if (item instanceof WomenClothes) {
                ((WomenClothes) item).dressWoman();
            }
        }
    }
}