package msweino.mychess;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import msweino.mychess.Piece.Chessboard;

public class MainActivity extends Activity {
    final int[][] butXY_id={
            {R.id.iButX0Y0,R.id.iButX1Y0,R.id.iButX2Y0,R.id.iButX3Y0,R.id.iButX4Y0,R.id.iButX5Y0,R.id.iButX6Y0,R.id.iButX7Y0,R.id.iButX8Y0},
            {R.id.iButX0Y1,R.id.iButX1Y1,R.id.iButX2Y1,R.id.iButX3Y1,R.id.iButX4Y1,R.id.iButX5Y1,R.id.iButX6Y1,R.id.iButX7Y1,R.id.iButX8Y1},
            {R.id.iButX0Y2,R.id.iButX1Y2,R.id.iButX2Y2,R.id.iButX3Y2,R.id.iButX4Y2,R.id.iButX5Y2,R.id.iButX6Y2,R.id.iButX7Y2,R.id.iButX8Y2},
            {R.id.iButX0Y3,R.id.iButX1Y3,R.id.iButX2Y3,R.id.iButX3Y3,R.id.iButX4Y3,R.id.iButX5Y3,R.id.iButX6Y3,R.id.iButX7Y3,R.id.iButX8Y3},
            {R.id.iButX0Y4,R.id.iButX1Y4,R.id.iButX2Y4,R.id.iButX3Y4,R.id.iButX4Y4,R.id.iButX5Y4,R.id.iButX6Y4,R.id.iButX7Y4,R.id.iButX8Y4},
            {R.id.iButX0Y5,R.id.iButX1Y5,R.id.iButX2Y5,R.id.iButX3Y5,R.id.iButX4Y5,R.id.iButX5Y5,R.id.iButX6Y5,R.id.iButX7Y5,R.id.iButX8Y5},
            {R.id.iButX0Y6,R.id.iButX1Y6,R.id.iButX2Y6,R.id.iButX3Y6,R.id.iButX4Y6,R.id.iButX5Y6,R.id.iButX6Y6,R.id.iButX7Y6,R.id.iButX8Y6},
            {R.id.iButX0Y7,R.id.iButX1Y7,R.id.iButX2Y7,R.id.iButX3Y7,R.id.iButX4Y7,R.id.iButX5Y7,R.id.iButX6Y7,R.id.iButX7Y7,R.id.iButX8Y7},
            {R.id.iButX0Y8,R.id.iButX1Y8,R.id.iButX2Y8,R.id.iButX3Y8,R.id.iButX4Y8,R.id.iButX5Y8,R.id.iButX6Y8,R.id.iButX7Y8,R.id.iButX8Y8},
            {R.id.iButX0Y9,R.id.iButX1Y9,R.id.iButX2Y9,R.id.iButX3Y9,R.id.iButX4Y9,R.id.iButX5Y9,R.id.iButX6Y9,R.id.iButX7Y9,R.id.iButX8Y9}};
    int tX=999,tY=999;
    Chessboard chessboard = new Chessboard();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageButton iBuXY=(ImageButton)findViewById(R.id.iButX0Y0);
//        TextView tVSystem=(TextView)findViewById(R.id.tVSystem);
        findViews();


    }

    void findViews(){

        ImageButton[][] iBuXY=new ImageButton[9][10];
        for (tX = 0 ;tX<5;tX++)
            for (tY = 0; tY < 5; tY++) {

                iBuXY[tX][tY] = (ImageButton) findViewById(butXY_id[tX][tY]);
                iBuXY[tX][tY].setOnClickListener(new ImageButton.OnClickListener() {
                    TextView tVSystem = (TextView) findViewById(R.id.tVSystem);

                    // private int x=0,y=0;
                    @Override
                    public void onClick(View view) {
                        tVSystem.setText("X =" +tX+"   Y="+tY);
                        //Toast.makeText(MainActivity.this, TXT, Toast.LENGTH_SHORT)
                          //      .show();
                    }
                });
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
