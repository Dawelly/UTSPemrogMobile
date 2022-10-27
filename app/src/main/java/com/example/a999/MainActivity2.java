package com.example.a999;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView9;
    ImageView imageView15, imageView11;
    Button  button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView9 = (TextView) findViewById(R.id.textView9);
        imageView15 = (ImageView) findViewById(R.id.imageView15);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        button2 = (Button) findViewById(R.id.button2);


        textView9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent buka = new Intent(getApplicationContext(), MainActivity3.class);
        startActivity(buka);
        }
        });

        imageView15.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                bukadua();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                bukaduabelas();
            }
        });

        }
        public void bukadua() {
        Intent bukadua = new Intent(getApplicationContext(), MainActivity4.class);
        startActivity(bukadua);

        imageView11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                bukaempat();
            }
        });
        }
        public void bukaempat() {
            Intent bukaempat = new Intent(getApplicationContext(), MainActivity5.class);
            startActivity(bukaempat);
        }
            public void bukaduabelas() {
                Intent bukaduabelas = new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(bukaduabelas);

        }
    }

