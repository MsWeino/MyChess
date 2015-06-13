package msweino.mychess;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import msweino.mychess.Piece.Chessboard;

public class MainActivity extends Activity {
    Chessboard chessboard = new Chessboard();
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageButton iBuXY=(ImageButton)findViewById(R.id.iButX0Y0);
//
        findViews();


    }

    void findViews() {
        //  ImageButton imageButton=(ImageButton) e.getSource();
        ImageButton[] iBuXY = new ImageButton[90];
        for (index = 0; index < 90; index++) {
            iBuXY[index] = (ImageButton) findViewById(MyData.butXY_id[index]);
            iBuXY[index].setOnClickListener(IBuXY_OC);
        }

    }

    public View.OnClickListener IBuXY_OC =new View.OnClickListener(){

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        TextView tVSystem = (TextView) findViewById(R.id.tVSystem);
        for(int index=0;index<90;index++)
        {
            if(MyData.butXY_id[index]==v.getId())
            {
                String  TXT = "X = " +index%9+"Y = "+index/9;
                tVSystem.setText(TXT);
            }
        }

//        }

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
