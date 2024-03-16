package com.woka.tictactoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TictacToeController {

    private char[][] board;
    private char currentPlayer;
    private int boardSize;


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("board", board);
        return "index";
    }

 
}
