package com.zeljkopratezina.activitydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


/**
 * Created by ZELJKO on 6/28/2016.
 */
public class Display2 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display2);
    }

    public void onButtonClick(View v3){

        if(v3.getId() == R.id.Bdisplay3 ) {

            Intent i3 = new Intent(Display2.this, MainActivity.class);
            startActivity(i3);

        }
    }


}
