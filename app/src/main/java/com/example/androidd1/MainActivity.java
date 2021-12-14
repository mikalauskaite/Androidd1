package com.example.androidd1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain = findViewById(R.id.tvMain);
    }

    public void onBtnClick(View view) {
        tvMain.setText("Juk pažadėjau!");
    }

    public void onBtn2Click(View view) {
        tvMain.setTextColor(getResources().getColor(R.color.purple_200));
    }

    //some code here
}