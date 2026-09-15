package com.example.bodegaexpress;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CardView cardInventario = findViewById(R.id.cardInventario);
        CardView cardMovimientos = findViewById(R.id.cardMovimientos);

        // Va al Main 3 (Inventario)
        cardInventario.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
        });

        // Va al Main 4 (Movimientos)
        cardMovimientos.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
            startActivity(intent);
        });
    }
}