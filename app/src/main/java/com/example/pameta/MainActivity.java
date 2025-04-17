package com.example.pameta;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    TextView tvWelcome;
    Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWelcome = findViewById(R.id.tvWelcome);
        logoutButton = findViewById(R.id.logoutButton);

        // Ambil username dari intent
        String nama = getIntent().getStringExtra("username");
        if (nama == null) nama = "Pengguna";

        tvWelcome.setText("Hai, " + nama + " selamat datang !");

        // Fungsi logout
        logoutButton.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        });

        // CardView Navigasi
        CardView soilCard = findViewById(R.id.soilCard);
        CardView scheduleCard = findViewById(R.id.scheduleCard);
        CardView notificationCard = findViewById(R.id.notificationCard);

        soilCard.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, StatusPenyiramanActivity.class)));

        scheduleCard.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, SetScheduleActivity.class)));

        notificationCard.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, NotificationsActivity.class)));

        // Bottom Navigation
        ImageView navSoil = findViewById(R.id.nav_soil);
        ImageView navCalendar = findViewById(R.id.nav_calendar);
        ImageView navBell = findViewById(R.id.nav_bell);
        ImageView navUser = findViewById(R.id.nav_user);

        navSoil.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, StatusPenyiramanActivity.class)));

        navCalendar.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, SetScheduleActivity.class)));

        navBell.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, NotificationsActivity.class)));

        navUser.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ProfileActivity.class)));
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Yakin ingin keluar?")
                .setPositiveButton("Ya", (dialog, which) -> finish())
                .setNegativeButton("Batal", null)
                .show();
    }
}
