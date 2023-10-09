package com.l20290957.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class UserDashboardActivityJoss extends AppCompatActivity {

    ImageView btnBack;
    ImageView btnJoss;
    ImageView btnAngel;
    ImageView btnUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard_joss);
        initTextViews();
    }

    private void initTextViews()
    {
        btnBack = findViewById(R.id.btn_back);
        btnJoss = findViewById(R.id.btn_Joss);
        btnAngel = findViewById(R.id.btn_Angel);

    }

    public void btnJoss(View view) {
        btnJoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),
                        UserDashboardActivityJoss.class);
                startActivityForResult(intent, 0);

            }
        });
    }

    public void btnAngel(View view) {
        btnAngel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),
                        UserDashboardActivityAngel.class);
                startActivityForResult(intent, 0);

            }
        });
    }

    public void btnBack(View view) {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),
                        MainActivity.class);
                startActivityForResult(intent, 0);

            }
        });
    }


}