package com.example.leebsstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;

import androidx.appcompat.app.AppCompatActivity;


// MainActivity.java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cvHpAwal = findViewById(R.id.cvHpAwal);
        CardView cvLaptopAwal = findViewById(R.id.cvLaptopAwal);
        CardView cvTabletAwal = findViewById(R.id.cvTabletAwal);

        cvHpAwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent pindah ke daftar Hp
                Intent intent = new Intent(MainActivity.this, DaftarHpActivity.class);
                startActivity(intent);
            }
        });

        cvLaptopAwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent pindah ke daftar Laptop
                Intent intent = new Intent(MainActivity.this, DaftarLaptopActivity.class);
                startActivity(intent);
            }
        });

        cvTabletAwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent pindah ke daftar Tablet
                Intent intent = new Intent(MainActivity.this, DaftarTabletActivity.class);
                intent.putExtra("kategori", "Tablet");
                startActivity(intent);
            }
        });
    }
}
