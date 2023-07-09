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

public class UgmActivity extends AppCompatActivity {

    ImageView ArrowBack;
    TextView tvWebUGM;

    Button btnPsikologi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ugm);

        ArrowBack = findViewById(R.id.icArrowback);
        tvWebUGM = findViewById(R.id.tvWebUGM);
        btnPsikologi= findViewById(R.id.btnPsikologi);

        ArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), homeActivity.class);
                startActivity(intent);
            }
        });

        tvWebUGM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://ugm.ac.id/id/3539-program-studi/"));
                startActivity(Intent.createChooser(intent, "title"));
            }
        });

        btnPsikologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new PsikologiFragment();

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contentUGM, fragment).commit();
            }
        });
    }
}