package com.example.bodegaexpress;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button btnComenzar = findViewById(R.id.btnComenzar);

        btnComenzar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity5.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}