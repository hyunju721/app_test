package com.example.screen_change;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et_name = findViewById(R.id.et_name);
        EditText et_age = findViewById(R.id.et_age);
        EditText et_score = findViewById(R.id.et_score);
        Button btn_push = findViewById(R.id.btn_push);

        btn_push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et_name.getText().toString();
                int age = Integer.parseInt(et_age.getText().toString());
                double score = Double.parseDouble(et_score.getText().toString());
                Intent intent = new Intent(MainActivity.this, nextActivity.class);
                intent.putExtra("et_name",name);
                intent.putExtra("et_age", age);
                intent.putExtra("et_score", score);
                startActivity(intent);
            }
        });
    }
}