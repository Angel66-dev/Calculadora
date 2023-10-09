package com.l20290957.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class UserDashboardActivityAngel extends AppCompatActivity {


    ImageView btnBack;
    ImageView btnJoss;
    ImageView btnAngel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard_angel);
        initTextViews();
    }

    private void initTextViews()
    {
        btnBack = findViewById(R.id.btn_back);
        btnJoss = findViewById(R.id.btn_Joss);
        btnAngel = findViewById(R.id.btn_Angel);

    }

    public void btnJoss(View view) {
        Intent intent = new Intent(this, UserDashboardActivityJoss.class);
        startActivity(intent);
        finish();
    }

    public void btnAngel(View view) {
        Intent intent = new Intent(this, UserDashboardActivityAngel.class);
        startActivity(intent);
    }

    public void btnBack(View view) {
        finish();
    }


}