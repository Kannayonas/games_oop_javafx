package ru.job4j.puzzle;

public class Win {
    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board[row].length; index++) {
            if (board[row][index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int cell) {
        boolean result = true;
        for (int ix = 0; ix < board[cell].length; ix++) {
            if (board[ix][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}

