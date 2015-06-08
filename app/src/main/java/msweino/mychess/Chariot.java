package msweino.mychess;

/**
 * 車
 */
public class Chariot extends Piece{
    @Override
    public boolean Rule(int inX,int inY,int endX,int endY,Piece[][] chessboard) //規則
    {
        int seed=0,check=0;
        boolean errCode=false;
            if(endX==inX)  //行動模式 確定路徑無障礙物check=0 ;有則1
            {
                if(endY>inY)
                {
                    while(endY-1>inY+seed)
                    {
                        if(chessboard[inX][inY+seed]!=null)
                        {check=1;break;}
                        seed++;
                    }
                }else
                {
                    while(endY+1<inY-seed)
                    {
                        if(chessboard[inX][inY-seed]!=null)
                        {check=1;break;}
                        seed++;
                    }
                }
            }
            else if(endY==inY)
            {
                if(endX>inX)
                {
                    while(endX-1>inX+seed)
                    {
                        if(chessboard[inX+seed][inY]!=null)
                        {check=1;break;}
                        seed++;
                    }
                }else
                {
                    while(endX+1<inX-seed)
                    {
                        if(chessboard[inX-seed][inY]!=null)
                        {check=1;break;}
                        seed++;
                    }
                }
            }
        if (check==0) { errCode= true;}
        return errCode;
    }
}
