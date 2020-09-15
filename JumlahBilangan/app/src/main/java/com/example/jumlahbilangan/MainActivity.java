package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bil1;
    EditText bil2;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI(){
        bil1 = (EditText) findViewById(R.id.bil1);
        bil2 = (EditText) findViewById(R.id.bil2);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung = (Button) findViewById(R.id.hitung);
    }

    private void initEvent(){
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int angka1 = 0;
        int angka2 = 0;
        int total = 0;
        try {
            angka1 = Integer.parseInt(bil1.getText().toString());
            angka2 = Integer.parseInt(bil2.getText().toString());
        } catch (Exception e) {
            bil1.setError("Isi dengan benar");
            bil2.setError("Isi dengan benar");
        }
        total = angka1 + angka2;
        hasil.setText("" + total);
    }
}