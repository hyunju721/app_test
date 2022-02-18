package com.example.screen_change;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class nextActivity extends AppCompatActivity {
    private Button btn_return;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        btn_return = findViewById(R.id.btn_return);
        Intent intent = getIntent();
        String name = intent.getStringExtra("et_name");
        int age = intent.getIntExtra("et_age",0);
        double score = intent.getDoubleExtra("et_score",0.0);
        TextView tv_name = findViewById(R.id.tv_name);
        TextView tv_age = findViewById(R.id.tv_age);
        TextView tv_score = findViewById(R.id.tv_score);
        tv_name.setText(name);
        tv_age.setText(age+"");
        tv_score.setText(score+"");

        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(nextActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
