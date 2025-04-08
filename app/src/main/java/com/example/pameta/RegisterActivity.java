package com.example.pameta;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_register);

        EditText etName   = findViewById(R.id.etName);
        EditText etEmail  = findViewById(R.id.etEmailReg);
        EditText etPass   = findViewById(R.id.etPassReg);
        EditText etPass2  = findViewById(R.id.etPassRepeat);
        Button btnReg     = findViewById(R.id.btnRegister);
        TextView toLogin  = findViewById(R.id.tvToLogin);

        btnReg.setOnClickListener(v -> {
            String n = etName.getText().toString().trim();
            String e = etEmail.getText().toString().trim();
            String p = etPass.getText().toString();
            String p2= etPass2.getText().toString();
            if (n.isEmpty() || e.isEmpty() || p.isEmpty()) {
                Toast.makeText(this, "Lengkapi semua field!", Toast.LENGTH_SHORT).show();
            } else if (!p.equals(p2)) {
                Toast.makeText(this, "Password tidak sama!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, LoginActivity.class));
                finish();
            }
        });

        toLogin.setOnClickListener(v ->
                startActivity(new Intent(this, LoginActivity.class))
        );
    }
}
