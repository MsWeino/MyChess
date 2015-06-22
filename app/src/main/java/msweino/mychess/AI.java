package msweino.mychess;

/**
 * Created by USER on 2015/6/22.
 */
public class AI
{
    private boolean factions=false; //AI所屬的陣營陣營


    public void reflect(Chessboard chessboard) //回傳最佳的起始座標&結束座標
    {
        int integral[][]={//棋盤
                //(0,0)(0,9)
                //(8,0)(8,9)
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0}};

    }

    public void setFactions(boolean factions)
    {this.factions=factions;}
}
