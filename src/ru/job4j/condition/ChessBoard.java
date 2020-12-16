package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        return Math.abs(x1 - y1) == Math.abs(x2 - y2) ? Math.abs(x2 - x1) : result;
    }

    public static void main(String[] args) {
        int result = ChessBoard.way(6, 7, 1, 2);
        System.out.println("Слон совершил " + result + " ходов.");
    }

}
