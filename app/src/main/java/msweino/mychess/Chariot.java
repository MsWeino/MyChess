package msweino.mychess;

/**
 * 車
 */
public class Chariot extends Piece{
    @Override
    public boolean Rule(int inX,int inY,int endX,int endY,Piece[][] chessboard) //規則
    {
        int seed=1,check=0;
        boolean errCode=false;
            if(endX==inX)  //行動模式 確定路徑無障礙物check=0 ;有則1
            {
                while (endY>=inY+seed)
                {
                    if (chessboard[endX][inY+seed]!=null){check++;}
                    seed++;
                }
                seed=1;
                while (endY<=inY-seed)
                {
                    if (chessboard[endX][inY-seed]!=null){check++;}
                    seed++;
                }
            }
            else if(endY==inY)
            {
                while (endX>=inX+seed)
                {
                    if (chessboard[inX+seed][endY]!=null){check++;}
                    seed++;
                }
                seed=1;
                while (endX<=inX-seed)
                {
                    if (chessboard[inX-seed][endY]!=null){check++;}
                    seed++;
                }
            }else{check=99;}

        if (check==0) { errCode= true;}
        if ((check==1)&&(chessboard[endX][endY]!=null)){ errCode= true;}

        //不可自殺
        if(chessboard[endX][endY]!=null)
        {if(chessboard[endX][endY].getFactions()==chessboard[inX][inY].getFactions()){errCode=false;}}
        return errCode;
    }
    @Override
    public String toString(){
        return "Chariot";
    }
}
