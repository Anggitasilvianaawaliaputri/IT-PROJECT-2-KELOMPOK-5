package com.example.pameta;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StatusPenyiramanActivity extends AppCompatActivity {

    Switch switchPompa;
    Button btnManual, btnOtomatis;
    TextView tvKelembaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_penyiraman);

        switchPompa = findViewById(R.id.switchPompa);
        btnManual = findViewById(R.id.btnManual);
        btnOtomatis = findViewById(R.id.btnOtomatis);
        tvKelembaban = findViewById(R.id.tvKelembaban);

        switchPompa.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Pompa Air: ON", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Pompa Air: OFF", Toast.LENGTH_SHORT).show();
            }
        });

        btnManual.setOnClickListener(v -> {
            Toast.makeText(this, "Mode disetel ke Manual", Toast.LENGTH_SHORT).show();
        });

        btnOtomatis.setOnClickListener(v -> {
            Toast.makeText(this, "Mode disetel ke Otomatis", Toast.LENGTH_SHORT).show();
        });

        // Simulasi nilai kelembaban
        tvKelembaban.setText("90%");
    }
}
