package msweino.mychess;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

   // int index = 0;
//    TextView tVSystem = (TextView) findViewById(R.id.tVSystem);
   // Chessboard chessboard = new Chessboard();
    TextView tVSystem;
    Chessboard chessboard;
    Button butGame,butNewGame;
    ImageButton[] iBuXY = new ImageButton[90];
    boolean newChessboard=true,butGameKEY=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         chessboard = new Chessboard();
         findViews();
         set();

         systemButton();
        //遊戲進行時檢查座標
         readCoordinate();
    }
    void set()
    {

        butNewGame.setText("開啟新局");
        if(chessboard.fettle())
        {
            butGame.setText("STOP");
        }
        else
        {
            butGame.setText("START");
        }
       // chessboard.clear();
       show();
    }

    void show(){
        for (int index = 0; index < 90; index++) {
            int sy=index / 9,sx =index % 9;
            if (chessboard.getPiece(sx,sy)==null)
            {iBuXY[index].setImageResource(R.drawable.s00);}
            else
            {iBuXY[index].setImageResource(chessboard.getPiece(sx,sy).getImg());}
        }
    }

    void findViews(){
        tVSystem = (TextView) findViewById(R.id.tVSystem);
        butGame=(Button)findViewById(R.id.butGame);
        butNewGame=(Button)findViewById(R.id.butNewGame);
        for (int index = 0; index < 90; index++) {
            iBuXY[index] = (ImageButton) findViewById(MyData.butXY_id[index]);
        }
    }
    void systemButton(){
        butGame.setOnClickListener(Button_OCL);
        butNewGame.setOnClickListener(Button_OCL);
    }
    void readCoordinate() {
        //  ImageButton imageButton=(ImageButton) e.getSource();
        for (int index = 0; index < 90; index++) {
            iBuXY[index].setOnClickListener(Button_OCL);
        }

    }


    public View.OnClickListener Button_OCL =new View.OnClickListener(){
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        switch (v.getId()) {
            case R.id.butGame:
                if(butGameKEY) {
                    if (chessboard.fettle()) {
                        chessboard.stop();//暫停
                        tVSystem.setText("暫停");
                        butGame.setText("START");

                    } else {
                        chessboard.run();//啟動
                        tVSystem.setText("啟動");
                        butGame.setText("STOP");
                    }
                }
                break;

            case R.id.butNewGame:   //新遊戲 OR 認輸
                if(newChessboard) {
                    chessboard.start();
                    butGame.setText("START");
                    butNewGame.setText("棄子投降");
                    newChessboard=false;
                    chessboard.newGame();
                    butGameKEY=true;
                }
                else
                {
                    chessboard.stop();
                    butNewGame.setText("開啟新局");
                    newChessboard=true;
                    butGameKEY=false;
                }

                show();

            break;
           default:
               if(chessboard.fettle()) {//檢查遊戲狀態

                   for (int index = 0; index < 90; index++) {
                       if (MyData.butXY_id[index] == v.getId()) {
                           int BodyX=index % 9, BodyY=index / 9;
                           String TXT = "X = " + BodyX + "Y = " + BodyY;
                           tVSystem.setText(TXT);
                           Body(BodyX,BodyY);
                       }
                   }
               }
           break;

        }
    }
        void Body(int x,int y)
        {
//            chessboard.runGame(x,y);
        }
};
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
