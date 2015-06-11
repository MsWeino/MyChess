package msweino.mychess.Piece;

/**
 * Created by USER on 2015/6/8.
 */
interface  IPiece {
    public boolean Rule(int inX,int Y,int endX,int endY,Piece[][] chessboard);
    public void show();


}
