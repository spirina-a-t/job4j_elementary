package ru.job4j.condition;

public class Cinema {
    public static void permission(boolean allow, boolean hasMoney) {
        if (allow && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Cinema.permission(true, true);
        Cinema.permission(true, false);
        Cinema.permission(false, true);
        Cinema.permission(false, false);
    }
}
