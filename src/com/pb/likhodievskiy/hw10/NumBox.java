package com.pb.likhodievskiy.hw10;

public class NumBox<T extends Number> {

    private final T[] numbers;
    private int length;

    public NumBox(int maxLength) {
        numbers = (T[]) new Number[maxLength];
        length = 0;
    }

    public void add(T num) throws Exception {
        if (length >= numbers.length) {
            throw new Exception("Index " + length + " out of bounds for length " + numbers.length);
        }

        numbers[length++] = num;
    }

    public T get(int index) {
        return numbers[index];
    }

    public int length() {
        return length;
    }

    public double average() {
        return length() > 0 ? sum() / length() : 0.00;
    }

    public double sum() {
        double sum = 0.00;

        for (T number: numbers) {
            if (number != null) {
                sum += number.doubleValue();
            }
        }

        return sum;
    }

    public T max() {
        T max = null;

        for (T number: numbers) {
            if (number != null && (max == null || number.doubleValue() > max.doubleValue())) {
                max = number;
            }
        }

        return max;
    }
}