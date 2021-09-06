package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int row = 0; row < board.length; row += 1) {
            if (board[row][row] == 1 && (checkHorizontal(row, board) || checkVertical(row, board))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkHorizontal(int row, int[][] board) {
        for (int cell = 0; cell < board[row].length; cell += 1) {
            if (board[row][cell] != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkVertical(int column, int[][] board) {
        for (int row = 0; row < board.length; row += 1) {
            if (board[row][column] != 1) {
                return false;
            }
        }
        return true;
    }
}
