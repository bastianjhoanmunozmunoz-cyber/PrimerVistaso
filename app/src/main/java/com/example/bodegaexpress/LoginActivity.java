package com.example.bodegaexpress;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = findViewById(R.id.btnLogin);
        CheckBox cbRemember = findViewById(R.id.cbRemember);

        btnLogin.setOnClickListener(v -> {

            if (cbRemember.isChecked()) {
                Toast.makeText(
                        LoginActivity.this,
                        getString(R.string.toast_session_saved),
                        Toast.LENGTH_SHORT
                ).show();
            }

            Intent intent = new Intent(
                    LoginActivity.this,
                    DashboardActivity.class
            );

            startActivity(intent);
            finish();
        });
    }
}