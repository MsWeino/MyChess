package msweino.mychess;

/**
 * 兵
 */
public class Soldier extends Piece{
    @Override
    public boolean Rule(int inX,int inY,int endX,int endY,Piece[][] chessboard) //規則
    {

        boolean errCode = false;
        if(getFactions()) {
            if (inY>4)//己方陣地
            {
                if((endX==inX)&&(endY==inY-1))
                {errCode= true;}
            }
            else   //深入敵營
            {
                if((endX==inX)&&(endY==inY-1)||
                   (endX==inX-1)&&(endY==inY)||
                   (endX==inX+1)&&(endY==inY))
                {errCode= true;}
            }
        }
        else
        {
            if (inY<5)//己方陣地
            {
                if((endX==inX)&&(endY==inY+1))
                {errCode= true;}
            }
            else   //深入敵營
            {
                if((endX==inX)&&(endY==inY+1)||
                   (endX==inX-1)&&(endY==inY)||
                    (endX==inX+1)&&(endY==inY))
                {errCode= true;}
            }
        }
        return errCode;
    }
    @Override
    public String toString(){
        return "Soldier"+this;
    }
}
