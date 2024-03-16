package com.woka.tictactoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.woka.tictactoe.service.TicTacToeService;


@Controller
public class TictacToeController {

    @Autowired
    private TicTacToeService tacToeService;
    
    private char[][] board;
    private char currentPlayer;
    private int boardSize;


    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @PostMapping("/generate-board")
    public String generateBoard(@RequestParam int size, Model model) {
        if (size <= 3){
            board = new char[3][3];
            boardSize=3;
        }else{
            board= new char[size][size];
            boardSize=size;
        }
        currentPlayer = 'X'; 
        model.addAttribute("board", board);
        return "index";   
        
    }

    @PostMapping("/move-play")
    public String movePlay(@RequestParam int col, @RequestParam int row) {
        //TODO: process POST request
        
        return "";
    }
    
    

 
}
