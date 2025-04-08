package com.example.pameta;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_login);

        EditText etEmail = findViewById(R.id.etEmail);
        EditText etPass  = findViewById(R.id.etPassword);
        Button btnLogin  = findViewById(R.id.btnLogin);
        TextView toReg   = findViewById(R.id.tvToRegister);

        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String pass  = etPass.getText().toString().trim();
            if (email.equals("admin") && pass.equals("1234")) {
                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                // lanjut ke activity lain
            } else {
                Toast.makeText(this, "Email/Password salah", Toast.LENGTH_SHORT).show();
            }
        });

        toReg.setOnClickListener(v ->
                startActivity(new Intent(this, RegisterActivity.class))
        );
    }
}
