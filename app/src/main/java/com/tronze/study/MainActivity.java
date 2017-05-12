package com.tronze.study;

import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = (Button)findViewById(R.id.button);
        final EditText t2 = (EditText) findViewById(R.id.text2);
        final ScrollView sc = (ScrollView)findViewById(R.id.sc);
        final TextView cont = (TextView)findViewById(R.id.text3);
        cont.setTextColor(Color.GREEN);

        b1.setOnClickListener(new View.OnClickListener() {

             @Override
            public void onClick(View v) {
                String content= t2.getText().toString();

                cont.append(content + "\n");

                 sc.post(new Runnable() {
                     public void run() {
                         // TODO Auto-generated method stub
                        sc.scrollTo(0, t2.getHeight());
                     }
                 });

            }

        });


    }
}
