package com.example.kampuskuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class homeActivity extends AppCompatActivity {

    List<univModel> elements;
    LinearLayout layoutUGM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        layoutUGM = findViewById(R.id.layoutUGM);

        layoutUGM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UgmActivity.class);
                startActivity(intent);
            }
        });

        addData();
    }

    private void addData() {
        elements = new ArrayList<>();
        elements.add(new univModel("Universitas Gajah Mada", "18","93","Farmasi"));
        elements.add(new univModel("Universitas Negeri Yogyakarta", "20","90","PGSD"));
        elements.add(new univModel("Universitas Gajah Mada", "18","93","Farmasi"));

        UnivAdapter adapter = new UnivAdapter(elements,this, new UnivAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(univModel item) {
                detail(item);

            }
        });
        RecyclerView recyclerView = findViewById(R.id.rvUniv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public void detail(univModel item){
        Intent intent = new Intent(homeActivity.this, detailActivity.class);
        intent.putExtra("univModel", item);
        startActivity(intent);
    }




}