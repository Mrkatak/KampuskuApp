package com.example.kampuskuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class UnyActivity extends AppCompatActivity {

    TextView tvWebUNY;
    Button btnPAkutansi;
    ImageView icArrowBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uny);

        icArrowBack = findViewById(R.id.icArrowback);
        tvWebUNY = findViewById(R.id.tvWebUNY);
        btnPAkutansi = findViewById(R.id.btnPAkutansi);

        tvWebUNY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.uny.ac.id/id/fakultas"));
                startActivity(Intent.createChooser(intent, "title"));
            }
        });

        icArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), homeActivity.class);
                startActivity(intent);
            }
        });

        btnPAkutansi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new IlmuPanganFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contentUNY, fragment).commit();
            }
        });
    }
}