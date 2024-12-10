package org.example.model;

public class Board {
    int size;
    PieceSymbol [][]pieceSymbol;

    public Board(int size) {
        this.size = size;
        this.pieceSymbol = new PieceSymbol[size][size];
    }

    private boolean add(int x, int y, PieceSymbol pieceSymbol) {
        if(this.pieceSymbol[x][y]!=null) {
            return false;
        }
        this.pieceSymbol[x][y] = pieceSymbol;
        return true;
    }
}
