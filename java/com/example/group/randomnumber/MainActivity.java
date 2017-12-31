package com.example.group.randomnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView tv;
    Button btn;
Random r;
    int min,max,output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r=new Random();
        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);
        btn= (Button) findViewById(R.id.button);
        tv= (TextView) findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempMin,tempMax;
                tempMin=e1.getText().toString();
                tempMax=e2.getText().toString();
                if( tempMin.length() != 0 && tempMax.length() != 0 ) {
                    min = Integer.parseInt(tempMin);
                    max = Integer.parseInt(tempMax);
                    if (max > min) {
                        output = r.nextInt((max - min) + 1) + min;
                        tv.setText("" + output);
                    }
                }
            }
        });
    }
}
