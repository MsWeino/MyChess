package msweino.mychess;

/**
 * Created by USER on 2015/5/31.
 */
public class Piece implements IPiece{
    private int image;
    private int weights;  // 權重
    private boolean factions; //派系
    public boolean Rule(int inX,int Y,int endX,int endY,Piece[][] chessboard) //規則
    {   return true;}
    public void show()
    {}

    @Override
    public void setImg(int image) {
        this.image=image;
    }

    @Override
    public int getImg() {
        return image;
    }

    public void setFactions(boolean factions)
    {this.factions=factions;}
    public boolean getFactions()
    {return factions;}
    public void setWeights(int weights)
    {this.weights=weights;}
    public int getWeights()
    {return weights;}

}
