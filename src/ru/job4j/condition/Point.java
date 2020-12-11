package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = x2 - x1;
        double two = y2 - y1;
        double onePow = Math.pow(one, 2);
        double twoPow = Math.pow(two, 2);
        double total = onePow + twoPow;
        total = Math.sqrt(total);
        return total;
    }

    public static void main(String[] args) {
        System.out.println("result (0, 0) to (2, 0) " + Point.distance(0, 0, 2, 0));
        System.out.println("result (5, 3) to (8, 10) " + Point.distance(5, 3, 8, 10));
    }
}
