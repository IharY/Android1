package com.example.lab_mobile_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.GestureDetector;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0D4028")));
        this.getSupportActionBar().setTitle("Лабораторная работа 1");
    }
}
