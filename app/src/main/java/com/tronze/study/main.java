package com.tronze.study;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class main extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText t1=(EditText)findViewById(R.id.name);
        Button button = (Button)(findViewById(R.id.button));
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent newintent = new Intent(getApplicationContext(), MainActivity.class);
                newintent.putExtra("content", t1.getText().toString());
                startActivity(newintent);
            }
        });
    }
}
