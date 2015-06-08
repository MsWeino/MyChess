package msweino.mychess;

/**
 * Created by USER on 2015/5/31.
 */
public class Piece implements IPiece{
    private int weights;  // 權重
    private boolean player; //陣營
    public boolean Rule(int inX,int Y,int endX,int endY,Piece[][] chessboard) //規則
    {   return true;}
    public void show()
    {}
    public void setPlayer(boolean player)
    {this.player=player;}
    public boolean getPlayer()
    {return player;}
    public void setWeights(int weights)
    {this.weights=weights;}
    public int getWeights()
    {return weights;}
}
