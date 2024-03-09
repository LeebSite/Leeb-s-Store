package com.example.leebsstore;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.content.ContentResolver;


import androidx.appcompat.app.AppCompatActivity;

public class DeskripsiDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_detail);

        TextView tvNamaBarang = findViewById(R.id.tvNamaBarang);
        TextView tvDeskripsiBarang = findViewById(R.id.tvDeskripsiBarang);
        TextView tvHargaBarang = findViewById(R.id.tvHargaBarang);
        ImageView ivGambarBarang = findViewById(R.id.ivGambarBarang);
        Button btnBeli = findViewById(R.id.btnBeli);
        Button btnShare = findViewById(R.id.btnShare);


        Intent intent = getIntent();
        if (intent != null) {
            String namaBarang = intent.getStringExtra("nama_barang");
            String deskripsiBarang = intent.getStringExtra("deskripsi_barang");
            String hargaBarang = intent.getStringExtra("harga_barang");
            int gambarBarang = intent.getIntExtra("gambar_barang", 0);

            tvNamaBarang.setText(namaBarang);
            tvDeskripsiBarang.setText(deskripsiBarang);
            tvHargaBarang.setText(hargaBarang);
            ivGambarBarang.setImageResource(gambarBarang);
        }
        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // untuk memanggil harga barang
                String hargaBarang = getIntent().getStringExtra("harga_barang");

                AlertDialog.Builder builder = new AlertDialog.Builder(DeskripsiDetailActivity.this);
                builder.setTitle("Konfirmasi Pembelian")
                        .setMessage("Anda akan membeli barang ini dengan harga " + hargaBarang + ". Lanjutkan pembelian?")
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // pemberitahuan barang sudah dibeli
                                Toast.makeText(DeskripsiDetailActivity.this, "Pembelian anda berhasil!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .show();
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int gambarBarang = intent.getIntExtra("gambar_barang", 0);
                Uri imageUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                        "://" + getResources().getResourcePackageName(gambarBarang) +
                        "/" + getResources().getResourceTypeName(gambarBarang) +
                        "/" + getResources().getResourceEntryName(gambarBarang));

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("image/*");
                shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Ayo beli barang ini: "
                        + tvNamaBarang.getText().toString()
                        + "\nHanya dengan Harga: " + tvHargaBarang.getText().toString());

                // Start chooser
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });

    }
}
