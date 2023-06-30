package com.example.kampuskuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {

    TextView tv_namaUnivDetail, jml_FakultasDetail,jml_ProdiDetail,nama_favoritDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tv_namaUnivDetail = findViewById(R.id.tv_namaUnivDetail);
        jml_FakultasDetail = findViewById(R.id.jml_FakultasDetail);
        jml_ProdiDetail = findViewById(R.id.jml_ProdiDetail);
        nama_favoritDetail = findViewById(R.id.nama_favoritDetail);

        univModel element = (univModel) getIntent().getSerializableExtra("univModel");
        tv_namaUnivDetail.setText(element.getNamaUniv());
        jml_FakultasDetail.setText(element.getJmlFakultas());
        jml_ProdiDetail.setText(element.getJmlProdi());
        nama_favoritDetail.setText(element.getFavoritProdi());


    }
}