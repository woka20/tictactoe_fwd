package com.woka.tictactoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.woka.tictactoe.service.TicTacToeService;

import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class TictacToeController {

    @Autowired
    private TicTacToeService tacToeService;
    
    private char[][] board;
    private char currentPlayer;
    private int boardSize;


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("board", board);
        return "index";
    }

    @PostMapping("/generate-board")
    public String generateBoard(@RequestParam int size, Model model) {
        board=tacToeService.generateBoard(size); 
        model.addAttribute("board", board);
        return "index";   
        
    }
    

 
}
