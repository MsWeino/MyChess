package msweino.mychess;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

Chessboard chessboard = new Chessboard();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageButton iBuXY=(ImageButton)findViewById(R.id.iButX0Y0);
//        TextView tVSystem=(TextView)findViewById(R.id.tVSystem);
        findViews();
//        tVSystem.setText("11111");
//                iBuXY.setOnClickListener(new View.OnClickListener() {
//
//                    @Override
//                    public void onClick(View view) {
//                        String text = ((ImageButton) view).toString();
//                        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT)
//                                .show();
//                        //chessboard.runGame(x,y);
//                        //tVSystem.setText("X =" + 0 + "\tY =" + 0);
//                    }
//                });
                     //   tVSystem.setText("1111");
    }

    void findViews(){
//    ImageButton iBuXY[][]={
//         {(ImageButton)findViewById(R.id.iButX0Y0),
//         (ImageButton)findViewById(R.id.iButX1Y0),
//         (ImageButton)findViewById(R.id.iButX2Y0),
//         (ImageButton)findViewById(R.id.iButX3Y0),
//         (ImageButton)findViewById(R.id.iButX4Y0),
//         (ImageButton)findViewById(R.id.iButX5Y0),
//         (ImageButton)findViewById(R.id.iButX6Y0),
//         (ImageButton)findViewById(R.id.iButX7Y0),
//         (ImageButton)findViewById(R.id.iButX8Y0)},
//         {(ImageButton)findViewById(R.id.iButX0Y1),
//                 (ImageButton)findViewById(R.id.iButX1Y1),
//                 (ImageButton)findViewById(R.id.iButX2Y1),
//                 (ImageButton)findViewById(R.id.iButX3Y1),
//                 (ImageButton)findViewById(R.id.iButX4Y1),
//                 (ImageButton)findViewById(R.id.iButX5Y1),
//                 (ImageButton)findViewById(R.id.iButX6Y1),
//                 (ImageButton)findViewById(R.id.iButX7Y1),
//                 (ImageButton)findViewById(R.id.iButX8Y1)},
//         {(ImageButton)findViewById(R.id.iButX0Y2),
//                 (ImageButton)findViewById(R.id.iButX1Y2),
//                 (ImageButton)findViewById(R.id.iButX2Y2),
//                 (ImageButton)findViewById(R.id.iButX3Y2),
//                 (ImageButton)findViewById(R.id.iButX4Y2),
//                 (ImageButton)findViewById(R.id.iButX5Y2),
//                 (ImageButton)findViewById(R.id.iButX6Y2),
//                 (ImageButton)findViewById(R.id.iButX7Y2),
//                 (ImageButton)findViewById(R.id.iButX8Y2)},
//         {(ImageButton)findViewById(R.id.iButX0Y3),
//                 (ImageButton)findViewById(R.id.iButX1Y3),
//                 (ImageButton)findViewById(R.id.iButX2Y3),
//                 (ImageButton)findViewById(R.id.iButX3Y3),
//                 (ImageButton)findViewById(R.id.iButX4Y3),
//                 (ImageButton)findViewById(R.id.iButX5Y3),
//                 (ImageButton)findViewById(R.id.iButX6Y3),
//                 (ImageButton)findViewById(R.id.iButX7Y3),
//                 (ImageButton)findViewById(R.id.iButX8Y3)},
//         {(ImageButton)findViewById(R.id.iButX0Y4),
//                 (ImageButton)findViewById(R.id.iButX1Y4),
//                 (ImageButton)findViewById(R.id.iButX2Y4),
//                 (ImageButton)findViewById(R.id.iButX3Y4),
//                 (ImageButton)findViewById(R.id.iButX4Y4),
//                 (ImageButton)findViewById(R.id.iButX5Y4),
//                 (ImageButton)findViewById(R.id.iButX6Y4),
//                 (ImageButton)findViewById(R.id.iButX7Y4),
//                 (ImageButton)findViewById(R.id.iButX8Y4)},
//         {(ImageButton)findViewById(R.id.iButX0Y5),
//                 (ImageButton)findViewById(R.id.iButX1Y5),
//                 (ImageButton)findViewById(R.id.iButX2Y5),
//                 (ImageButton)findViewById(R.id.iButX3Y5),
//                 (ImageButton)findViewById(R.id.iButX4Y5),
//                 (ImageButton)findViewById(R.id.iButX5Y5),
//                 (ImageButton)findViewById(R.id.iButX6Y5),
//                 (ImageButton)findViewById(R.id.iButX7Y5),
//                 (ImageButton)findViewById(R.id.iButX8Y5)},
//         {(ImageButton)findViewById(R.id.iButX0Y6),
//                 (ImageButton)findViewById(R.id.iButX1Y6),
//                 (ImageButton)findViewById(R.id.iButX2Y6),
//                 (ImageButton)findViewById(R.id.iButX3Y6),
//                 (ImageButton)findViewById(R.id.iButX4Y6),
//                 (ImageButton)findViewById(R.id.iButX5Y6),
//                 (ImageButton)findViewById(R.id.iButX6Y6),
//                 (ImageButton)findViewById(R.id.iButX7Y6),
//                 (ImageButton)findViewById(R.id.iButX8Y6)},
//         {(ImageButton)findViewById(R.id.iButX0Y7),
//                 (ImageButton)findViewById(R.id.iButX1Y7),
//                 (ImageButton)findViewById(R.id.iButX2Y7),
//                 (ImageButton)findViewById(R.id.iButX3Y7),
//                 (ImageButton)findViewById(R.id.iButX4Y7),
//                 (ImageButton)findViewById(R.id.iButX5Y7),
//                 (ImageButton)findViewById(R.id.iButX6Y7),
//                 (ImageButton)findViewById(R.id.iButX7Y7),
//                 (ImageButton)findViewById(R.id.iButX8Y7)},
//         {(ImageButton)findViewById(R.id.iButX0Y8),
//                 (ImageButton)findViewById(R.id.iButX1Y8),
//                 (ImageButton)findViewById(R.id.iButX2Y8),
//                 (ImageButton)findViewById(R.id.iButX3Y8),
//                 (ImageButton)findViewById(R.id.iButX4Y8),
//                 (ImageButton)findViewById(R.id.iButX5Y8),
//                 (ImageButton)findViewById(R.id.iButX6Y8),
//                 (ImageButton)findViewById(R.id.iButX7Y8),
//                 (ImageButton)findViewById(R.id.iButX8Y8)},
//         {(ImageButton)findViewById(R.id.iButX0Y9),
//                 (ImageButton)findViewById(R.id.iButX1Y9),
//                 (ImageButton)findViewById(R.id.iButX2Y9),
//                 (ImageButton)findViewById(R.id.iButX3Y9),
//                 (ImageButton)findViewById(R.id.iButX4Y9),
//                 (ImageButton)findViewById(R.id.iButX5Y9),
//                 (ImageButton)findViewById(R.id.iButX6Y9),
//                 (ImageButton)findViewById(R.id.iButX7Y9),
//                 (ImageButton)findViewById(R.id.iButX8Y9)}};


        ImageButton iBuXY[][]=new ImageButton[2][2];
        iBuXY[0][0]=(ImageButton)findViewById(R.id.iButX0Y0);
        iBuXY[1][0]=(ImageButton)findViewById(R.id.iButX1Y0);
        iBuXY[0][1]=(ImageButton)findViewById(R.id.iButX0Y1);
        iBuXY[1][1]=(ImageButton)findViewById(R.id.iButX1Y1);
        // String TXT="";
        for (int x=0;x<2;x++) {
            for(int y=0;y<2;y++){
//                iBuXY[x][y].setX(x);
//                iBuXY[x][y].setY(y);
                ImageButton iBB =iBuXY[x][y];
                iBB.setX(x);
                iBB.setX(y);
                iBB.setOnClickListener(new ImageButton.OnClickListener() {
                   // TextView tVSystem=(TextView)findViewById(R.id.tVSystem);
                    private int x=0,y=0;
                    @Override
                    public void onClick(View view) {
//                        chessboard.runGame(x,y);
//                        tVSystem.setText("X =" + x + "\tY =" + y);

                        String TXT = "X = "+x+"    Y ="+y;
                        Toast.makeText(MainActivity.this, TXT, Toast.LENGTH_SHORT)
                                .show();
                    }
                    public void setX(int x)
                    { this.x=x; }
                    public void setY(int y)
                    {this.y=y;}
                });
            }
        }
    }

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
