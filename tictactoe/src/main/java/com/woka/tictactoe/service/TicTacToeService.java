package com.woka.tictactoe.service;

import org.springframework.stereotype.Service;

@Service
public class TicTacToeService {

    private char [][] boards;

    public char[][] generateBoard(int size){
        for(int i=0; i<size; i++){
            for(int j =0 ; j<size; j++){
                boards[i][j]='\00';
            }
        }
        return boards;

    }
    
}
