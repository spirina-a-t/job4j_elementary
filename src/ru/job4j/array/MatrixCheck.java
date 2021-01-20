package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            char temp = board[row][cell];
            char x = 'X';
            if (temp != x) {
                result = false;
                break;
            }
        }
        return result;
    }
}
