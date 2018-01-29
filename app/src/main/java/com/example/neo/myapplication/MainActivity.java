package com.example.neo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int a=0, b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Team A
        Button p1a = (Button) findViewById(R.id.pt1A);
        p1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                displayA();
            }
        });

        Button p2a = (Button) findViewById(R.id.pt2A);
        p2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a+=2;
                displayA();
            }
        });

        Button p3a = (Button) findViewById(R.id.pt3A);
        p3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a+=3;
                displayA();
            }
        });

        Button p6a = (Button) findViewById(R.id.pt6A);
        p6a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a+=6;
                displayA();
            }
        });

        //Team B
        Button p1b = (Button) findViewById(R.id.pt1B);
        p1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                displayB();
            }
        });

        Button p2b = (Button) findViewById(R.id.pt2B);
        p2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b+=2;
                displayB();
            }
        });

        Button p3b = (Button)findViewById(R.id.pt3B);
        p3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b+=3;
                displayB();
            }
        });

        Button p6b =(Button) findViewById(R.id.pt6B);
        p6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b+=6;
                displayB();
            }
        });

        //Reset
        Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=0;
                b=0;
                displayB();
                displayA();
            }
        });
    }


    private void displayA() {
        TextView textView = (TextView) findViewById(R.id.scoreA);
        textView.setText(""+a);
    }

    private void displayB() {
        TextView textView = (TextView) findViewById(R.id.scoreB);
        textView.setText(""+b);
    }




}
