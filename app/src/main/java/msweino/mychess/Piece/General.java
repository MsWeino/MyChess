package msweino.mychess.Piece;

/**
 * 帥
 */
public class General extends Piece{

    @Override
    public boolean Rule(int inX,int inY,int endX,int endY,Piece[][] chessboard) //規則
    {
        boolean errCode=false;
        if(getPlayer()) {
            if (!(endX<3 | endX>5 | endY < 7))//區域限制
            {
                if((endX==inX)|(endY==inY)) {
                    if ((endY == inY + 1 | endY == inY - 1) | (endX == inX + 1 | endX == inX - 1))
                    {errCode = true;}
                }
            }
        }
        else {
            if (!(endX < 3 | endX > 5 | endY > 2))//區域限制
            {
                if ((endX == inX) | (endY == inY)) {
                    if ((endY == inY + 1 | endY == inY - 1) | (endX == inX + 1 | endX == inX - 1))
                    {errCode = true;}
                }
            }
        }
        return errCode;
    }
}
