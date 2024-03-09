package com.example.leebsstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;

public class DaftarLaptopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_laptop);

        CardView cvLaptop1 = findViewById(R.id.cvLaptop1);
        CardView cvLaptop2 = findViewById(R.id.cvLaptop2);
        CardView cvLaptop3 = findViewById(R.id.cvLaptop3);
        CardView cvLaptop4 = findViewById(R.id.cvLaptop4);
        CardView cvLaptop5 = findViewById(R.id.cvLaptop5);

        cvLaptop1.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarLaptopActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Book Flex");
            intent.putExtra("deskripsi_barang", "Layar 11.6 inch dengan Resolusi 1366 x 768 px\n" +
                                  "Sistem Operasi Windows 10 Home dengan Prosesor Intel Core i5 3.7GHz\n"+
                                  "Graphic NVIDIA GeForce MX250 Touchscreen With Finferprint Reader\n" +
                                  "Backlit Keyboard dengan Material Bodi Aluminium Berat 1.2kg");
            intent.putExtra("harga_barang", "Rp. 7.499.000");
            intent.putExtra("gambar_barang", R.drawable.laptop1);
            startActivity(intent);
        });

        cvLaptop2.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarLaptopActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Book Pro");
            intent.putExtra("deskripsi_barang", "Layar 15.6 inch dengan Resolusi 1920 x 1080 px\n" +
                                  "Sistem Operasi Windows 10 Home dengan Prosesor Intel Core i7 2.8GHz\n"+
                                  "Storage 512GB SSD dengan RAM 16GB 24000MHz\n" +
                                  "Graphic Intel Iris Xe Touchscreen With Finferprint Reader\n" +
                                  "Backlit Keyboard dengan Material Bodi Plastic Berat 1.38kg");
            intent.putExtra("harga_barang", "Rp. 14.400.000");
            intent.putExtra("gambar_barang", R.drawable.laptop1);
            startActivity(intent);
        });

        cvLaptop3.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarLaptopActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Chromebook 2 360");
            intent.putExtra("deskripsi_barang", "Layar 12.4 inch LED 2-in-1 Touchscreen\n" +
                                  "Sistem Operasi Chrome OS NoteBook Type\n"+
                                  "Storage 128GB dengan 2 Slots RAM 4GB 1600 MHz DDR3\n" +
                                  "Prosesor Intel Celeron N4500 1.9 GHz dengan Berat 1.28 kg");
            intent.putExtra("harga_barang", "Rp. 8.299.000");
            intent.putExtra("gambar_barang", R.drawable.laptop1);
            startActivity(intent);
        });

        cvLaptop4.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarLaptopActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung ATIV UltraBook NP900X3C");
            intent.putExtra("deskripsi_barang", "Layar 13.3' FHD+ LED 2-in-1 Touchscreen\n" +
                                  "Sistem Operasi Windows 8.1 Pro 64 Bit\n"+
                                  "VGA Intel HD Graphics 4000 2 GB\n" +
                                  "Storage FULL SSD 256GB dengan 4GB DDR3 1600 MHz,\n" +
                                  "Prosesor Intel Core i7 3517U 1.9 GHz 1.9 GHz Turbo 2.9 GHz\n" +
                                  "Backlite Keyboard dengan Berat 1.4Kg");
            intent.putExtra("harga_barang", "Rp. 8.100.000");
            intent.putExtra("gambar_barang", R.drawable.laptop1);
            startActivity(intent);
        });

        cvLaptop5.setOnClickListener(view -> {
            Intent intent = new Intent(DaftarLaptopActivity.this, DeskripsiDetailActivity.class);
            intent.putExtra("nama_barang", "Samsung Galaxy Book4 Ultra");
            intent.putExtra("deskripsi_barang", "Super AMOLED 16 inch QHD+ 2880 x 1800px dan Refresh rate 120 Hz\n" +
                                  "Sistem Operasi Windows 11 Home dengan Prosesor Intel Core 9-185H Meteor Lake.\n" +
                                  "Graphic NVIDIA GeForce RTX 4070 With Finferprint Reader\n" +
                                  "Storage Up to 1TB dengan RAM LPDDR5X 32 GB\n" +
                                  "Camera 2MP, Speaker quad AKG Dolby Atmos & Digital Michrophone");
            intent.putExtra("harga_barang", "Rp. 37.299.000");
            intent.putExtra("gambar_barang", R.drawable.laptop1);
            startActivity(intent);
        });
    }
}