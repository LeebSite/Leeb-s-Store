package com.example.leebsstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;

public class DaftarTabletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_tablet);

        CardView cvTablet1 = findViewById(R.id.cvTablet1);
        CardView cvTablet2 = findViewById(R.id.cvTablet2);
        CardView cvTablet3 = findViewById(R.id.cvTablet3);
        CardView cvTablet4 = findViewById(R.id.cvTablet4);
        CardView cvTablet5 = findViewById(R.id.cvTablet5);

        cvTablet1.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarTabletActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Tab S9 Ultra");
            intent.putExtra("deskripsi_barang", "Layar Dynamic AMOLED 14.6 inch dengan Resolusi 1848 x 2960 pixels\n" +
                                  "Kamera Utama 13 + 8MP & Resolusi Video 4K, Full HD, Dual camera 12 + 12MP dilengkapi Face Detection\n" +
                                  "OS Android 13, One UI 5.1\n" +
                                  "Kapasitas Baterai 11200mAh Fast Charging RAM 12GB-5G\n" +
                                  "Qualcomm SM8550-AB Snapdragon 8 Gen 2 (4 nm) Octa Core\n" +
                                  "Pen Support, Keyboard Support dan Fingerprint");
            intent.putExtra("harga_barang", "Rp. 21.999.000");
            intent.putExtra("gambar_barang", R.drawable.tablet1);
            startActivity(intent);
        });

        cvTablet2.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarTabletActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Tab S9 FE+");
            intent.putExtra("deskripsi_barang", "Layar  IPS LCD 90Hz, 12.4 inch dengan Resolusi 1600 x 2560 pixelsx\n" +
                                  "Kamera Utama 13 + 8MP & Resolusi Video 4K, Full HD, Single 12 MP (ultrawide) dilengkapi Face Detection\n" +
                                  "WLAN Wi-Fi 802.11, dual-band, Wi-Fi Direct Bluetooth 5.3, A2DP, LE" +
                                  "Tipe Baterai Li-Po 10090 mAh, non-removable, 8/128GB - 5G\n" +
                                  "OS Android 13, One UI 5.1\n" +
                                  "Exynos 1380 (5 nm) Octa Core" +
                                  "Pen Support, Keyboard Support dan Fingerprint");
            intent.putExtra("harga_barang", "Rp. 3.899.000");
            intent.putExtra("gambar_barang", R.drawable.tablet1);
            startActivity(intent);
        });

        cvTablet3.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarTabletActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Tab A7");
            intent.putExtra("deskripsi_barang", "Layar  IPS LCD 90Hz, 12.4 inch dengan Resolusi 1600 x 2560 pixelsx\n" +
                                  "Kamera Utama 13 + 8MP & Resolusi Video 4K, Full HD, Single 12 MP (ultrawide) dilengkapi Face Detection\n" +
                    "WLAN Wi-Fi 802.11, dual-band, Wi-Fi Direct Bluetooth 5.3, A2DP, LE" +
                    "Tipe Baterai Li-Po 10090 mAh, non-removable, 8/128GB - 5G\n" +
                    "OS Android 13, One UI 5.1\n" +
                    "Exynos 1380 (5 nm) Octa Core" +
                    "Pen Support, Keyboard Support dan Fingerprint");
            intent.putExtra("harga_barang", "Rp. 77.000.000");
            intent.putExtra("gambar_barang", R.drawable.tablet1);
            startActivity(intent);
        });

        cvTablet4.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarTabletActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Lenovo");
            intent.putExtra("deskripsi_barang", "Ini laptop lo");
            intent.putExtra("harga_barang", "Rp. 77.000.000");
            intent.putExtra("gambar_barang", R.drawable.tablet1);
            startActivity(intent);
        });

        cvTablet5.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarTabletActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Lenovo");
            intent.putExtra("deskripsi_barang", "Ini laptop lo");
            intent.putExtra("harga_barang", "Rp. 77.000.000");
            intent.putExtra("gambar_barang", R.drawable.tablet1);
            startActivity(intent);
        });
    }
}