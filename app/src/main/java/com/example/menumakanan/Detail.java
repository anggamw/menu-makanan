package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private TextView txtnama, txtharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtnama = findViewById(R.id.txtfood);
        txtharga = findViewById(R.id.txtharga);



    }
}