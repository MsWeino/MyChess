package msweino.mychess;


/**my
 * Created by USER on 2015/5/31.
 */
public class Chessboard {
//    private static final int
    private static Piece chessboard[][]={//棋盤
            //(0,0)(0,9)
            //(8,0)(8,9)
            {null,null,null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null,null,null},
            {null,null,null,null,null,null,null,null,null,null,null}};
    int inCoordinateX=999,inCoordinateY=999;
  //  private  boolean runGame=false; //停止遊戲
    private boolean player=true; //玩家
    private boolean fettle=false;//狀態

    public void setPiece(int X,int Y,Piece piece)
    {
        this.chessboard[X][Y]=piece;
    }
    public Piece getPiece(int X,int Y)
    {
        return this.chessboard[X][Y];
    }
    public void start(){
        fettle=true;
    } //啟動
    public void run(){
        fettle=true;
    } //啟動
    public void stop(){
        fettle=false;
    }   //暫停
    public boolean fettle(){
     return fettle;
    }
    public void clear(){
        int x=0,y=0;
        while(x<10){
            while(y<9){
                this.chessboard[x][y]=null;
            }
        }
    }

    public void isClear(int x,int y)
    {
        this.chessboard[x][y]=null;
    }
    public void runGame(int CoordinateX,int CoordinateY)
    {
            if(player==chessboard[CoordinateX][CoordinateY].getFactions()) //選擇相同陣營時
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

    public void newGame()
    {
        //紅方
        chessboard[4][0]=new General();//
        chessboard[4][0].setImg(R.drawable.a1);
        chessboard[4][0].setFactions(true);
        chessboard[3][0]=new Advisor();
        chessboard[3][0].setImg(R.drawable.a2);
        chessboard[3][0].setFactions(true);
        chessboard[5][0]=chessboard[3][0]; //參照實體

        chessboard[2][0]=new Elephant();
        chessboard[2][0].setImg(R.drawable.a3);
        chessboard[2][0].setFactions(true);
        chessboard[6][0]=chessboard[2][0];//參照實體

        chessboard[1][0]=new Horse();
        chessboard[1][0].setImg(R.drawable.a5);
        chessboard[1][0].setFactions(true);
        chessboard[7][0]=chessboard[1][0];

        chessboard[0][0]=new Chariot();
        chessboard[0][0].setImg(R.drawable.a4);
        chessboard[0][0].setFactions(true);
        chessboard[8][0]=chessboard[0][0];

        chessboard[1][2]=new Cannon();
        chessboard[1][2].setImg(R.drawable.a6);
        chessboard[1][2].setFactions(true);
        chessboard[7][2]=chessboard[1][2];

        chessboard[0][3]=new Soldier();
        chessboard[0][3].setImg(R.drawable.a7);
        chessboard[0][3].setFactions(true);
        chessboard[2][3]=chessboard[0][3];
        chessboard[4][3]=chessboard[0][3];
        chessboard[6][3]=chessboard[0][3];
        chessboard[8][3]=chessboard[0][3];

        //黑方
        chessboard[4][9]=new General();
        chessboard[4][9].setImg(R.drawable.b1);
        chessboard[4][9].setFactions(false);
        chessboard[3][9]=new Advisor();
        chessboard[3][9].setImg(R.drawable.b2);
        chessboard[3][9].setFactions(false);
        chessboard[5][9]=chessboard[3][9];

        chessboard[2][9]=new Elephant();
        chessboard[2][9].setImg(R.drawable.b3);
        chessboard[2][9].setFactions(false);
        chessboard[6][9]= chessboard[2][9];

        chessboard[1][9]=new Horse();
        chessboard[1][9].setImg(R.drawable.b5);
        chessboard[1][9].setFactions(false);
        chessboard[7][9]=chessboard[1][9];

        chessboard[0][9]=new Chariot();
        chessboard[0][9].setImg(R.drawable.b4);
        chessboard[0][9].setFactions(false);
        chessboard[8][9]=chessboard[0][9];

        chessboard[1][7]=new Cannon();
        chessboard[1][7].setImg(R.drawable.b6);
        chessboard[1][7].setFactions(false);
        chessboard[7][7]=chessboard[1][7];

        chessboard[0][6]=new Soldier();
        chessboard[0][6].setImg(R.drawable.b7);
        chessboard[0][6].setFactions(false);
        chessboard[2][6]=chessboard[0][6];
        chessboard[4][6]=chessboard[0][6];
        chessboard[6][6]=chessboard[0][6];
        chessboard[8][6]=chessboard[0][6];
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

    public String toString(int x,int y)
    {
        return chessboard[x][y].toString();
    }
}
