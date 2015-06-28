package msweino.mychess;

/**
 * Created by USER on 2015/6/8.
 */
interface  IPiece {
    public boolean Rule(int inX, int Y, int endX, int endY, Piece[][] chessboard);
    public void show();
    public void setImg(int image);
    public int getImg();
    public boolean getCrown();
    public String toString();


}
