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
            intent.putExtra("gambar_barang", R.drawable.tablet2);
            startActivity(intent);
        });

        cvTablet3.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarTabletActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Tab A7");
            intent.putExtra("deskripsi_barang", "Layar 10.4 inch, TFT LCD, Resolusi Layar 2000 x 1200 pixels\n" +
                                  "Kamera Utama 8MP, f/2.0 dan Kamera Depan 5MP, f/2.2\n" +
                                  "Storage 32GB up to 512GB dengan RAM 4GB\n" +
                                  "Baterai 7,040mAh dengan Fastcharging 15W Dual SIM (Micro-SIM/Nano-SIM)\n" +
                                  "OS Android 10 dengan One UI 2.5\n" +
                                  "Prosesor Qualcomm Snapdragon 662\n" +
                                  "Fingerprint, Dolby Atmos stereo speakers, USB Type-C");
            intent.putExtra("harga_barang", "Rp. 3.899.000");
            intent.putExtra("gambar_barang", R.drawable.tablet3);
            startActivity(intent);
        });

        cvTablet4.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarTabletActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Tab A9+");
            intent.putExtra("deskripsi_barang", "Layar 11.0 inch, Resolusi Layar 1200 x 1920pixsels\n" +
                                  "Kamera Utama 8MP & Kamera Depan 5MP dengan Face Detection\n" +
                                  "Storage 64GB up to 512GB dengan RAM 4 up to 8GB\n" +
                                  "Baterai 7,040mAh type Li-Polymer - 5G\n" +
                                  "OS Android 10 dengan One UI 2.5\n" +
                                  "Qualcomm SM6375 Snapdragon 695 5G (6 nm) Octa Core 2.2 GHz, 1.8GHz\n" +
                                  "Fingerprint, Dolby Atmos stereo speakers, USB Type-C");
            intent.putExtra("harga_barang", "Rp. 4.099.000");
            intent.putExtra("gambar_barang", R.drawable.tablet4);
            startActivity(intent);
        });

        cvTablet5.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarTabletActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Tab S9 FE");
            intent.putExtra("deskripsi_barang", "Layar 10.9 inch Resolusi 1440 x 2304 pixels\n" +
                    "Kamera Utama 8 MP (wide) Video 4K@30fps, 1080p@30fps, Kamera Depan 12 MP (ultrawide)\n" +
                    "Internal 128GB 6GB RAM atau 256GB 8GB RAM\n" +
                    "Baterai Li-Polymer 8000 mAh, non-removable\n" +
                    "OS Android 13 up to 14, One UI 6\n" +
                    "Exynos 1380 (5 nm) Octa-core (4x2.4 GHz Cortex-A78 & 4x2.0 GHz Cortex-A55)\n" +
                    "Fingerprint, Dolby Atmos stereo speakers, USB Type-C");
            intent.putExtra("harga_barang", "Rp. 77.000.000");
            intent.putExtra("gambar_barang", R.drawable.tablet5);
            startActivity(intent);
        });
    }
}