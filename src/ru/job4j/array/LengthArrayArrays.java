package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{1}, {1, 2}, {1, 2, 2}, {1, 2, 4, 6}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива равен: " + array[i].length);
        }
    }
}
