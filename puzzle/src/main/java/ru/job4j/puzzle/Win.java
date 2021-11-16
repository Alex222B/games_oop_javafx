package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        int index;
        for (index = 0; index < board.length; index++) {
            if ((board[index][index] == 1)
                    && (Win.checkHorizontal(board, index) || Win.checkVertical(board, index))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int column = 0; column < board[row].length; column++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkVertical(int[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
