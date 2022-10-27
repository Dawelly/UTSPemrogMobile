package com.example.a999;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {
    ImageView imageView12, imageView11, imageView15;
    Button  button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView15 = (ImageView) findViewById(R.id.imageView15);
        button2 =(Button) findViewById(R.id.button2);


        imageView12.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent bukasembilan = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(bukasembilan);
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent bukasepuluh = new Intent(getApplicationContext(), MainActivity5.class);
        startActivity(bukasepuluh);
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent bukaenam = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(bukaenam);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukasebelas = new Intent(getApplicationContext(), MainActivity7.class);
                startActivity(bukasebelas);
            }
        });


    }
}