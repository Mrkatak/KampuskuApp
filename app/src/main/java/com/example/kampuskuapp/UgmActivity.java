package com.example.kampuskuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UgmActivity extends AppCompatActivity {

    ImageView ArrowBack;
    TextView tvWebUGM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ugm);

        ArrowBack = findViewById(R.id.icArrowback);
        tvWebUGM = findViewById(R.id.tvWebUGM);

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
    }
}