package com.example.bodegaexpress;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);
        CheckBox cbRemember = findViewById(R.id.cbRemember);

        btnLogin.setOnClickListener(v -> {
            if(cbRemember.isChecked()){
                Toast.makeText(MainActivity.this, getString(R.string.toast_session_saved), Toast.LENGTH_SHORT).show();
            }

            // Va al Main 2 (Dashboard)
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            finish();
        });
    }
}