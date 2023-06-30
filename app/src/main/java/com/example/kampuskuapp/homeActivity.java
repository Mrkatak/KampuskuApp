package com.example.kampuskuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class homeActivity extends AppCompatActivity {

    List<univModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        addData();
    }

    private void addData() {
        elements = new ArrayList<>();
        elements.add(new univModel("Universitas Gajah Mada", "18","93","Farmasi"));
        elements.add(new univModel("Universitas Gajah Mada", "18","93","Farmasi"));
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