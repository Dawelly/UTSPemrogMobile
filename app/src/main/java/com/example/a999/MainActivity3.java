package com.example.a999;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    ImageView imageView15, imageView14, imageView12, imageView11;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView14 = (ImageView) findViewById(R.id.imageView14);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        button2 = (Button) findViewById(R.id.button2);


        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukadua = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(bukadua);
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukatiga();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukalima();
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukatujuh();
            }
            });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukadelapan();
            }
        });
    }
        public void bukatiga() {
        Intent bukatiga = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(bukatiga);
    }
        public void bukalima () {
            Intent bukalima = new Intent(getApplicationContext(), MainActivity6.class);
            startActivity(bukalima);
        }
            public void bukatujuh() {
                Intent bukatujuh = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(bukatujuh);
            }
    public void bukadelapan () {
        Intent bukadelapan = new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(bukadelapan);

        }
    }

