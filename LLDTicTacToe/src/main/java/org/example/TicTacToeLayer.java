package org.example;

import org.example.model.Board;
import org.example.model.CircleSymbol;
import org.example.model.CrossSymbol;
import org.example.model.Player;

import java.util.LinkedList;
import java.util.Queue;

public class TicTacToeLayer {
    Queue<Player> players;
    Board boardGame;

    public TicTacToeLayer() {
        initiateGame();
    }

    private void initiateGame() {
        players = new LinkedList<>();
        Player player1= new Player("Mangu", new CircleSymbol());
        Player player2= new Player("Pangu", new CrossSymbol());
        boardGame = new Board(3);
    }

    private void startGame() {
        
    }
}
