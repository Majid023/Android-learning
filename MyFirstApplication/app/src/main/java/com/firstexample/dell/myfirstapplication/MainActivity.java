package com.firstexample.dell.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import  android.content.res.Resources;
import  android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        RelativeLayout rLayout = new RelativeLayout(this);
        Button btn = new Button(this);
        EditText editText = new EditText(this);

        btn.setId(1001);
        editText.setId(1002);
        rLayout.setBackgroundColor(Color.RED);

        RelativeLayout.LayoutParams btnParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams userParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        btnParams.addRule(RelativeLayout.CENTER_VERTICAL);
        btnParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userParams.addRule(RelativeLayout.ABOVE,btn.getId());
        userParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userParams.setMargins(0,0,0,12);


        Resources resources = getResources();

        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,300,resources.getDisplayMetrics());
        editText.setWidth(px);
        btn.setText("Click me!");
        btn.setBackgroundColor(Color.GREEN);



        rLayout.addView(btn,btnParams);
        rLayout.addView(editText,userParams);
        setContentView(rLayout);
    }
}
