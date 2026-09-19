package com.example.bodegaexpress;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        CardView cardInventory = findViewById(R.id.cardInventory);
        CardView cardMovements = findViewById(R.id.cardMovements);

        cardInventory.setOnClickListener(v -> {
            Intent intent = new Intent(
                    DashboardActivity.this,
                    InventoryActivity.class
            );

            startActivity(intent);
        });

        cardMovements.setOnClickListener(v -> {
            Intent intent = new Intent(
                    DashboardActivity.this,
                    MovementsActivity.class
            );

            startActivity(intent);
        });
    }
}