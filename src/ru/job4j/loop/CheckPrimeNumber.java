package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int num;
        boolean result = number > 2;
        for (int i = 2; i < number; i++) {
            num = i;
            if (number % num == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
