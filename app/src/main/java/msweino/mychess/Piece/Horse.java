package msweino.mychess.Piece;

/**
 * 馬
 */
public class Horse extends Piece{
    @Override
    public boolean Rule(int inX,int inY,int endX,int endY,Piece[][] chessboard) //規則
    {
        boolean errCode = false;
        if (((endX==inX+2)&(endY==inY+1|endY==inY-1)&(chessboard[inX+1][inY]==null))||
           ((endX==inX-2)&(endY==inY+1|endY==inY-1)&(chessboard[inX-1][inY]==null))||
           ((endY==inY+2)&(endX==inX+1|endX==inX-1)&(chessboard[inX][inY+1]==null))||
           ((endY==inY-2)&(endX==inX+1|endX==inX-1)&(chessboard[inX][inY-1]==null)))
        {errCode= true;}
        return errCode;
    }
}
