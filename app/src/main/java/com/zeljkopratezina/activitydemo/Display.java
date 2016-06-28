package com.zeljkopratezina.activitydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ZELJKO on 6/28/2016.
 */
public class Display extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
    }

    public void onButtonClick(View v2){

        if(v2.getId() == R.id.Bdisplay2){

            Intent i2 = new Intent(Display.this, Display2.class);
            startActivity(i2);
        }

    }
}
