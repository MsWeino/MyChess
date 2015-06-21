package msweino.mychess;

/**
 仕
 */
public class Advisor extends Piece {



    @Override
    public boolean Rule(int inX,int inY,int endX,int endY,Piece[][] chessboard) //規則
    {
        boolean errCode=false;
        if(getFactions()) {
            if (!(endX < 3 | endX > 5 | endY < 7))//區域限制
            {
                if ((endX == inX + 1 | endX == inX - 1) & (endY == inY + 1 | endY == inY - 1))//行動模式
                {errCode = true;}
            }
        }
        else
        {
            if (!(endX<3 | endX>5 | endY >2))//區域限制
            {
                if((endX==inX+1|endX==inX-1)&(endY==inY+1|endY==inY-1))//行動模式
                {errCode= true;}
            }
        }
        return errCode;
    }
    @Override
    public String toString(){
        return "Advisor";
    }
}
