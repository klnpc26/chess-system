package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class ChessPiece extends Piece{
    
    private Piece piece;
    private Color color;
 
    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
