package com.pb.likhodievskiy.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Float> numBox1 = new NumBox<>(3);

        try {
            numBox1.add((float) 1.4);
            numBox1.add((float) 1.1);

            System.out.println("First numbers array: [" + numBox1.get(0) + ", "  + numBox1.get(1) + "]");
            System.out.println("First numbers array length: " + numBox1.length());
            System.out.println("First numbers array sum: " + numBox1.sum());
            System.out.println("First numbers array average: " + numBox1.average());
            System.out.println("First numbers array max element: " + numBox1.max());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        NumBox<Integer> numBox2 = new NumBox<>(2);

        try {
            numBox2.add(1);
            numBox2.add(2);

            System.out.println("Second numbers array: [" + numBox2.get(0) + ", "  + numBox2.get(1) + "]");
            System.out.println("Second numbers array length: " + numBox2.length());
            System.out.println("Second numbers array sum: " + numBox2.sum());
            System.out.println("Second numbers array average: " + numBox2.average());
            System.out.println("Second numbers array max element: " + numBox2.max());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}