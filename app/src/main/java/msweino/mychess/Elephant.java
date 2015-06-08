package msweino.mychess;
import msweino.mychess.Chessboard;
/**
 * 相
 */
public class Elephant extends Piece {
    @Override
    public boolean Rule(int inX,int inY,int endX,int endY,Piece[][] chessboard) //規則
    {

        boolean errCode=false;
        if(getPlayer()) {
            if (endY > 4)//區域限制
            {
                if ((((endX == inX + 2) & (endY == inY + 2)) & (chessboard[inX + 1][inY + 1] == null)) ||
                   (((endX == inX + 2) & (endY == inY - 2)) & (chessboard[inX + 1][inY - 1] == null)) ||
                   (((endX == inX - 2) & (endY == inY + 2)) & (chessboard[inX - 1][inY - 1] == null)) ||
                   (((endX == inX - 2) & (endY == inY - 2)) & (chessboard[inX - 1][inY - 1] == null)))
                {errCode = true;}
            }
        }else {
            if (endY < 5)//區域限制
            {
                //行動模式
                if ((((endX == inX + 2) & (endY == inY + 2)) & (chessboard[inX + 1][inY + 1] == null)) ||
                   (((endX == inX + 2) & (endY == inY - 2)) & (chessboard[inX + 1][inY - 1] == null)) ||
                   (((endX == inX - 2) & (endY == inY + 2)) & (chessboard[inX - 1][inY - 1] == null)) ||
                   (((endX == inX - 2) & (endY == inY - 2)) & (chessboard[inX - 1][inY - 1] == null)))
                {errCode = true;}
            }
        }
        return errCode;
    }
}
