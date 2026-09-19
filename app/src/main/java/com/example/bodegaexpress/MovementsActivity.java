package com.example.bodegaexpress;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MovementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movements);

        Button btnEntry = findViewById(R.id.btnEntry);
        Button btnExit = findViewById(R.id.btnExit);

        btnEntry.setOnClickListener(v ->
                Toast.makeText(
                        this,
                        getString(R.string.toast_entry),
                        Toast.LENGTH_SHORT
                ).show()
        );

        btnExit.setOnClickListener(v ->
                Toast.makeText(
                        this,
                        getString(R.string.toast_exit),
                        Toast.LENGTH_SHORT
                ).show()
        );
    }
}