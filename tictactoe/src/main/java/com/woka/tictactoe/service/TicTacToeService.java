package com.woka.tictactoe.service;

import org.springframework.stereotype.Service;

@Service
public class TicTacToeService {

    
    public boolean checkValidMove(int col, int row, char[][] boards){
        return boards[row][col]=='\00';

    }
    
}
