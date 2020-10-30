package TicTacToeGame;

import java.util.Scanner;

public class TTT {
    private final int NUM_ROWS = 3;
    private final int NUM_COLS = 3;


    private char[][] board;
    private char currentPlayerMark;
    public TTT() {
        board = new char[NUM_ROWS][NUM_COLS];
        currentPlayerMark = 'x';
        initializeBoard();

    }

    private char getCurrentPlayerMark()//Gives us access to currentPlayerMark x or o
    {
        return currentPlayerMark;
    }


    private void initializeBoard(){// Set/Reset the board back to all empty values
        for(int i = 0; i < NUM_ROWS; i++){//rows loop
            for(int j = 0; j < NUM_COLS; j++){//colomns loop
                board[i][j] = '-';
            }
        }
    }
    private void printBoard(){// Print the current board(I haven't studied GUI yet)
        System.out.println("-------------");
        for(int i = 0; i < NUM_ROWS; i++){
            System.out.print("| ");
            for (int j = 0; j < NUM_COLS; j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }

    }
    private boolean isBoardFull() {// Loop through all cells of the board and if one is found
        // to be empty (contains char '-') then return false.
        // Otherwise the board is full.
        boolean isFull = true;

        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLS; j++) {
                if (board[i][j] == '-') {
                    isFull = false;
                }
            }
        }

        return isFull;
    }
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }// Check to see if all three values are the same (and not empty) indicating a win.
    private boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }// Returns true if there is a win,
    // false otherwise.
    // This calls our other win check functions to check the entire board.
    private boolean checkRowsForWin() {
        for (int i = 0; i < NUM_ROWS; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
            }
        }
        return false;
    }// Loop through rows and see if any are winners.
    private boolean checkColumnsForWin() {
        for (int i = 0; i < NUM_COLS; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                return true;
            }
        }
        return false;
    }// Loop through columns and see if any are winners.
    private boolean checkDiagonalsForWin() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }// Check the two diagonals to see
    // if either is a win. Return true if either wins.
    private void changePlayer() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        }
        else {
            currentPlayerMark = 'x';
        }
    }// Change player marks back and forth.
    private boolean placeMark(int row, int col) {
        if ((row >= 0) && (row < NUM_ROWS)) {
            if ((col >= 0) && (col < NUM_COLS)) {
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }// Make sure that row and column are in bounds of the board.
        }

        return false;
    }
    public void startGame(){
        Scanner scan = new Scanner(System.in);
        initializeBoard();
        System.out.println("Tic-Tac-Toe!");
        do
        {
            System.out.println("Current board layout:");
            printBoard();
            int row;
            int col;
            do
            {
                System.out.println("Player " + getCurrentPlayerMark() + ", enter an empty row and column to place your mark!");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
            }
            while (!placeMark(row, col));
            changePlayer();
        }
        while(!checkForWin() && !isBoardFull());
        if (isBoardFull() && !checkForWin())
        {
            System.out.println("The game was a tie!");
        }
        else
        {
            System.out.println("Current board layout:");
            printBoard();
            changePlayer();
            System.out.println(Character.toUpperCase(getCurrentPlayerMark()) + " Wins!");
        }
    }


}
