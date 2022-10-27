package com.example.a999;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity9 extends AppCompatActivity {
    ImageView imageView15, imageView12, imageView11;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        button3 = (Button) findViewById(R.id.button3);

        imageView15.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent bukaenam = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(bukaenam);
        }
        });
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
        button3.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
        Intent bukaduabelas = new Intent(getApplicationContext(), MainActivity8.class);
        startActivity(bukaduabelas);
        }
        });

    }
}