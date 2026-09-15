package com.example.bodegaexpress;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button btnEntrada = findViewById(R.id.btnEntrada);
        Button btnSalida = findViewById(R.id.btnSalida);

        btnEntrada.setOnClickListener(v -> Toast.makeText(this, getString(R.string.toast_entry), Toast.LENGTH_SHORT).show());
        btnSalida.setOnClickListener(v -> Toast.makeText(this, getString(R.string.toast_exit), Toast.LENGTH_SHORT).show());
    }
}