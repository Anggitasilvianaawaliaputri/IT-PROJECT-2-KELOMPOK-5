package com.example.pameta;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DetailJadwalActivity extends AppCompatActivity {

    Button btnRefresh;
    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jadwal);

        btnRefresh = findViewById(R.id.btnRefresh);
        btnBack = findViewById(R.id.btnBack);

        btnRefresh.setOnClickListener(v ->
                Toast.makeText(this, "Jadwal diperbarui", Toast.LENGTH_SHORT).show());

        btnBack.setOnClickListener(v -> finish());
    }
}
