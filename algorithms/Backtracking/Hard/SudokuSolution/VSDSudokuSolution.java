// Copyrights to venkys.io
// For more programs visit venkys.io 
// Java program for Sudoku

import java.util.*;

public class Main {
    // return whether element is correctly placed or not
    public static  boolean isSafe(char[][] board, int row, int col, int num) {
        for (int i = 1; i < board.length; i++) {
            if (board[i][col] == (char) (num + '0')) {
                return false;
            }
        }
        for (int j = 1; j < board.length; j++) {
            if (board[row][j] == (char) (num + '0')) {
                return false;
            }
        }
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (num + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    // row and column update
    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int nrow = 0;
        int ncol = 0;
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }
        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            // checking the value in the empty places
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    // printing the sudoko
    public static void sudokoSol(char[][] board) {
        helper(board, 0, 0);
        System.out.println("Sudoko");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        char[][] board = new char[][] {
                { '.', '.', '2', '.', '1', '.', '6', '8', '7' },
                { '1', '.', '.', '.', '8', '.', '2', '5', '4' },
                { '.', '6', '.', '.', '2', '.', '9', '1', '3' },
                { '6', '8', '5', '.', '3', '.', '4', '7', '9' },
                { '.', '.', '.', '.', '.', '8', '1', '.', '2' },
                { '2', '.', '.', '7', '.', '.', '5', '.', '8' },
                { '9', '.', '6', '8', '7', '.', '3', '4', '5' },
                { '.', '.', '.', '.', '4', '.', '7', '.', '6' },
                { '4', '7', '3', '.', '.', '6', '8', '.', '1' }
        };

        System.out.println("Sudoko after solving");
        sudokoSol(board);

    }
}