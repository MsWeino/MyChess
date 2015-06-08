package msweino.mychess;

/**
 * Created by USER on 2015/6/8.
 */
public class Cannon extends Piece {

    @Override
    public boolean Rule(int inX,int inY,int endX,int endY,Piece[][] chessboard) //規則
    {
        boolean errCode = false;
        int seed=0,check=0;
        if(endX==inX)  //行動模式 確定路徑無障礙物check=0 ;有則1
        {
            if(endY>inY)
            {
                while(endY-1>inY+seed)
                {
                    if(chessboard[inX][inY+seed]!=null)
                    {check++;}
                    seed++;
                }
            }
            else
            {
                while(endY+1<inY-seed)
                {
                    if(chessboard[inX][inY-seed]!=null)
                    {check++;}
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
                    {check++;}
                    seed++;
                }
            }
            else
            {
                while(endX+1<inX-seed)
                {
                    if(chessboard[inX-seed][inY]!=null)
                    {check++;}
                    seed++;
                }
            }
        }
        if (check==1){ errCode= true;}
        return errCode;
    }
}
