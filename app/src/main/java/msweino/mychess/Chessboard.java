package msweino.mychess;


import msweino.mychess.Piece;
/**my
 * Created by USER on 2015/5/31.
 */
public class Chessboard {
//    private static final int
    private static Piece chessboard[][]={//棋盤
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null}};
    int inCoordinateX=999,inCoordinateY=999;
    private  boolean runGame=false; //停止遊戲
    private boolean player=true;

    public void setPiece(int X,int Y,Piece piece)
    {
        this.chessboard[X][Y]=piece;
    }
    public Piece getPiece(int X,int Y)
    {
        return this.chessboard[X][Y];
    }
    public void start(){
        runGame=true;
    }
    public void stop(){
        runGame=false;
    }

    public void runGame(int CoordinateX,int CoordinateY)
    {
            if(player==chessboard[CoordinateX][CoordinateY].getPlayer()) //選擇相同陣營時
            {
                inCoordinateX=CoordinateX;
                inCoordinateY=CoordinateY;
            }
            else
            {
                if (inCoordinateX!=999) //起始座標已設定,且結束座標不為友方
                {
                    //移動旗子 成功後換手下棋
                    Piece piece=chessboard[CoordinateX][CoordinateY];
                    if(piece.Rule(inCoordinateX,inCoordinateY,CoordinateX,CoordinateY,chessboard))
                    {
                        movePiece(inCoordinateX,inCoordinateY,CoordinateX,CoordinateY);
                    }
                    System.gc();
                }

            }
    }

    public void movePiece(int inX,int inY,int endX,int endY)
    {
        chessboard[endX][endY]=chessboard[inX][inY];
        chessboard[inX][inY]=null;
        inCoordinateX=999;
        inCoordinateY=999;

    }

    public void show()
    {

    }
}
