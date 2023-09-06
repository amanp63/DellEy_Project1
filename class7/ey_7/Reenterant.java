package ey_7;

public class Reenterant {

    public synchronized void m() {
        n();
        System.out.println("I am in m synchronized method");
    }

    public synchronized void n() {
        System.out.println("I am in n synchronized method");
    }

    public static class ReentrantThreadExample {
        public static void main(String[] args) {
            final Reenterant r = new Reenterant();
            new Thread(() -> {
                r.m();
            }).start();
        }
    }
}