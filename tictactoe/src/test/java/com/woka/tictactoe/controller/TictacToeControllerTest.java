package com.woka.tictactoe.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyChar;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import com.woka.tictactoe.service.TicTacToeService;

@ExtendWith(MockitoExtension.class)
public class TictacToeControllerTest {
    @Mock
    TicTacToeService ticTacToeService;

    @InjectMocks
    TictacToeController controller;

    @BeforeEach
    public void setUp() {
        Model model = mock(Model.class);
         controller.generateBoard(3, model);
    }

    @Test
    public void testMoveSuccess() {
       
        when(ticTacToeService.checkValidMove(anyInt(), anyInt(), any())).thenReturn(true);
        when(ticTacToeService.checkWin(anyChar(), anyInt(), any())).thenReturn(true);

        Model model = mock(Model.class);

        String result = controller.movePlay(0, 0, model);

    
        assertEquals("index", result);
        // verify(model, never()).addAttribute(anyString(), any());
    }
    
}
