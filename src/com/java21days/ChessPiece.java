package com.java21days;

class ChessPiece {
    String color;
    int [] [] startingPosition;
}
class King extends ChessPiece {
    int forwardMovement = 1;
    int sideMovement = 1;
}
class Queen extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}
class Rook extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}
class Bishop extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}
class Knight extends ChessPiece {
    int forwardMovement;
    int sideMovement;
}
class Pawn extends ChessPiece {
    int forwardMovement = 1;
    int sideMovement = 0;
}