package com.pb.likhodievskiy.hw13;

import java.util.ArrayDeque;

public class ReadWriteLock {

    public static class App {

        ArrayDeque<Integer> storage = new ArrayDeque<>();

        public void produce() throws InterruptedException {
            int value = 0;

            while (true) {
                synchronized (this) {
                    while (storage.size() == 5) {
                        wait();
                    }

                    System.out.println("Producer set " + value);
                    storage.add(value++);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (storage.size() == 0) {
                        wait();
                    }

                    System.out.println("Consumer get " + storage.removeFirst());

                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }

    public static void main(String[] args) {
        final App app = new App();

        Thread t1 = new Thread(() -> {
            try {
                app.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                app.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}