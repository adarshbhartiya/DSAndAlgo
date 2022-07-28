package com.problemsolving;
import java.util.*;

public class Sudoku {

    public boolean isValidSudoku(char[][] board) {

        boolean rowflag = rowCheckValidity(board);
        if(!rowflag)
            return false;
        boolean columnflag = columnCheckValidity(board);
        if(!columnflag)
            return false;
        boolean boxflag = boxCheckValidity(board);
        if(!boxflag)
            return false;
        return true;
    }

    public boolean rowCheckValidity(char[][] board)
    {
        for(int row=0;row<9;row++)
        {
            Set<Character> set = new HashSet<>();
            for(int column=0;column<9;column++)
            {
                char ch = board[row][column];
                if(ch!='.')
                {
                    if(!set.contains(ch))
                        set.add(ch);
                    else
                        return false;
                }
                else
                    continue;
            }
        }
        return true;
    }

    public boolean columnCheckValidity(char[][] board)
    {
        for(int column=0;column<9;column++)
        {
            Set<Character> set = new HashSet<>();
            for(int row=0;row<9;row++)
            {
                char ch = board[row][column];
                if(ch!='.')
                {
                    if(!set.contains(ch))
                        set.add(ch);
                    else
                        return false;
                }
                else
                    continue;
            }
        }
        return true;
    }

    public boolean boxCheckValidity(char[][] board)
    {
        int row = 0;
        int column =0;
        int i=0;
        int j=0;
        while(row<9 && column<9)
        {
            Set<Character> set = new HashSet<>();
            i = row;
            while(i<row+3)
            {
                j=column;
                while(j<column+3)
                {
                    if(board[i][j]!= '.')
                    {
                        if(!set.contains(board[i][j])) {
                            set.add(board[i][j]);
                            j++;
                        }
                        else
                            return false;
                    }
                    else
                        j++;
                }
                i++;
            }

             if(j == 9) {
                 column = 0;
                 row = row+3;
             }
             else
              column = j;


            }

        return true;
    }
}
class SudokuMain
{
    public static void main(String[] args)
    {
        Sudoku sudoku = new Sudoku();
        char[][] board = {{'.','.','.','.','5','.','.','1','.'},
                          {'.','4','.','3','.','.','.','.','.'},
                          {'.','.','.','.','.','3','.','.','1'},
                          {'8','.','.','.','.','.','.','2','.'},
                          {'.','.','2','.','7','.','.','.','.'},
                          {'.','1','5','.','.','.','.','.','.'},
                          {'.','.','.','.','.','2','.','.','.'},
                          {'.','2','.','9','.','.','.','.','.'},
                          {'.','.','4','.','.','.','.','.','.'}};
        System.out.println(sudoku.isValidSudoku(board));
    }
}
