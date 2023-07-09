package com.example.kampuskuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UnyActivity extends AppCompatActivity {

    TextView tvWebUNY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uny);

        tvWebUNY = findViewById(R.id.tvWebUNY);

        tvWebUNY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.uny.ac.id/id/fakultas"));
                startActivity(Intent.createChooser(intent, "title"));
            }
        });
    }
}