package com.example.calculatorrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Nilai1, Nilai2;

    Button btntambah, btnkurang, btnkali, btnbagi;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nilai1 = (EditText) findViewById(R.id.Nilai1);
        Nilai2 = (EditText) findViewById(R.id.Nilai2);
        hasil = (TextView) findViewById(R.id.hasil);
        btntambah = (Button) findViewById(R.id.btntambah);
        btnkurang = (Button) findViewById(R.id.btnkurang);
        btnkali = (Button) findViewById(R.id.btnkali);
        btnbagi = (Button) findViewById(R.id.btnbagi);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai1 = Integer.parseInt(Nilai1.getText().toString());
                int nilai2 = Integer.parseInt(Nilai2.getText().toString());

                int Hasil = nilai1 + nilai2;
                hasil.setText(String.valueOf(Hasil));
            }
        });

        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai1 = Integer.parseInt(Nilai1.getText().toString());
                int nilai2 = Integer.parseInt(Nilai2.getText().toString());

                int Hasil = nilai1 - nilai2;
                hasil.setText(String.valueOf(Hasil));
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai1 = Integer.parseInt(Nilai1.getText().toString());
                int nilai2 = Integer.parseInt(Nilai2.getText().toString());

                int Hasil = nilai1 / nilai2;
                hasil.setText(String.valueOf(Hasil));
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai1 = Integer.parseInt(Nilai1.getText().toString());
                int nilai2 = Integer.parseInt(Nilai2.getText().toString());

                int Hasil = nilai1 * nilai2;
                hasil.setText(String.valueOf(Hasil));
            }
        });
    }
}