package org.example.model;

public class Player {
    String name;
    PieceSymbol pieceSymbol;

    public Player(String name, PieceSymbol pieceSymbol) {
        this.name = name;
        this.pieceSymbol = pieceSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PieceSymbol getPieceSymbol() {
        return pieceSymbol;
    }

    public void setPieceSymbol(PieceSymbol pieceSymbol) {
        this.pieceSymbol = pieceSymbol;
    }
}
