package com.example.leebsstore;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DaftarHpActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_hp);

        CardView cvHp1 = findViewById(R.id.cvHp1);
        CardView cvHp2 = findViewById(R.id.cvHp2);
        CardView cvHp3 = findViewById(R.id.cvHp3);
        CardView cvHp4 = findViewById(R.id.cvHp4);
        CardView cvHp5 = findViewById(R.id.cvHp5);

        cvHp1.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarHpActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy A15");
            intent.putExtra("deskripsi_barang", "Ukuran layar: 6.5 inci, 1080 x 2340 pixels, Super AMOLED, 90Hz\n" +
                                  "Memori: RAM 8 GB, ROM 128 GB\n" +
                                  "Sistem operasi: Android\n" +
                                  "CPU: Mediatek Helio G99 (6nm), Octa-core up to 2.2Ghz\n" +
                                  "Kamera: Triple 50 MP f/1.8 (wide) AF, 5 MP f/2.2 (ultrawide), 2 MP f/2.4 (macro); depan 13 MP f/2.0 (wide)\n" +
                                  "SIM: Dual SIM (Nano-SIM, dual stand-by) Baterai 5000 mAh, non-removable\n");
            intent.putExtra("harga_barang", "Rp 2.899.000");
            intent.putExtra("gambar_barang", R.drawable.handphone1);
            startActivity(intent);
        });

        cvHp2.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarHpActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy A15 5G");
            intent.putExtra("deskripsi_barang", "Ukuran layar: 6.5 inci, 1080 x 2340 pixels, Super AMOLED, 120Hz, 1000 nits\n" +
                                  "Memori: RAM 8 GB, ROM 256 GB\n" +
                                  "Sistem operasi: Android\n" +
                                  "CPU: Exynos 1280 (5 nm), Octa-core (2x2.4 GHz Cortex-A78 & 6x2.0 GHz Cortex-A55)\n" +
                                  "Kamera: Triple 50 MP, f/1.8, (wide), PDAF, OIS, 8 MP, f/2.2, 120˚ (ultrawide), 2 MP, f/2.4, (macro); Depan 13 MP, f/2.2, (wide)\n" +
                                  "SIM: Dual SIM (Nano-SIM) dan Baterai 5000 mAh, non-removable\n");
            intent.putExtra("harga_barang", "Rp 4.399.000");
            intent.putExtra("gambar_barang", R.drawable.handphone2);
            startActivity(intent);
        });

        cvHp3.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarHpActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy A15 5G");
            intent.putExtra("deskripsi_barang", "Ukuran layar: 6.5 inci, 1080 x 2340 pixels, Super AMOLED, 120Hz, 1000 nits\n" +
                                  "Memori: RAM 8 GB, ROM 256 GB\n" +
                                  "Sistem operasi: Android\n" +
                                  "CPU: Exynos 1280 (5 nm), Octa-core (2x2.4 GHz Cortex-A78 & 6x2.0 GHz Cortex-A55)\n" +
                                  "Kamera: Triple 50 MP, f/1.8, (wide), PDAF, OIS, 8 MP, f/2.2, 120˚ (ultrawide), 2 MP, f/2.4, (macro); Depan 13 MP, f/2.2, (wide)\n" +
                                  "SIM: Dual SIM (Nano-SIM) dan Baterai 5000 mAh, non-removable");
            intent.putExtra("harga_barang", "Rp. 28.000.000");
            intent.putExtra("gambar_barang", R.drawable.handphone3);
            startActivity(intent);
        });

        cvHp4.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarHpActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy S24 Ultra");
            intent.putExtra("deskripsi_barang", "Ukuran layar: 6.8 inci, 3120 x 1440 pixels, Dynamic AMOLED 2X, 120 Hz\n" +
                                  "Memori: RAM 12GB, ROM 512 GB / 1TB\n" +
                                  "CPU: Snapdragon 8 Gen 3 for Galaxy\n" +
                                  "Kamera: Quad 200 MP + 12 MP + 10 MP + 50 MP, depan 12 MP\n" +
                                  "SIM: Dual SIM dan Baterai 5000mAh");
            intent.putExtra("harga_barang", "Rp 21.999.000");
            intent.putExtra("gambar_barang", R.drawable.handphone4);
            startActivity(intent);
        });

        cvHp5.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarHpActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy S24");
            intent.putExtra("deskripsi_barang", "Ukuran layar: 6.2 inch, 1080 x 2380 pixels, Dynamic AMOLED 2X, 120Hz\n" +
                                  "Memori: RAM 8 GB, ROM 512 GB\n" +
                                  "CPU: Exynos2400 for Galaxy\n" +
                                  "Kamera: Triple 50 MP + 12 MP + 10 MP; depan 12 MP\n" +
                                  "SIM: Dual SIM dan Baterai 4000 mAh");
            intent.putExtra("harga_barang", "Rp 13.999.000");
            intent.putExtra("gambar_barang", R.drawable.handphone5);
            startActivity(intent);
        });
    }
}
