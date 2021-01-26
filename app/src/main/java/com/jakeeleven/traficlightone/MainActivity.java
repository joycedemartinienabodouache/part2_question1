package com.jakeeleven.traficlightone;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int red = Color.RED;
    private final int green = Color.GREEN;
    private final int yellow = Color.YELLOW;

    private final int stop = R.string.stop;
    private final int go = R.string.go;
    private final int wait = R.string.wait;

    private Button mButton;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.mButton);
        init();


    }

    private void init(){
        setters(stop, red);
        counter ++;

    }

    public void proceed(View view) {

        switch (counter){
            case 1:{
                setters(go, green);
                counter++;
                break;
            }
            case 2:{
                setters(wait, yellow);
                counter++;
                break;
            }

            default:
                counter = 0;
                init();
                break;
        }

    }


    void setters(int text, int color){
        mButton.setText(text);
        mButton.setBackgroundColor(color);

    }
}