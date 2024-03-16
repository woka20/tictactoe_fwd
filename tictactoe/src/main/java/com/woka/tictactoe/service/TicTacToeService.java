package com.woka.tictactoe.service;

import org.springframework.stereotype.Service;

@Service
public class TicTacToeService {

    
    public boolean checkValidMove(int col, int row, char[][] boards){
        return boards[row][col]=='\00';

    }
    public boolean checkDraw(int size, char[][] boards) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (boards[i][j] == '\00') {
                    return false; // if still an empty cell, game continues
                }
            }
        }
        return true; // All field are filled, then it's draw
    }


    
}
