package com.example.keranjangphoto;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCatalogPhoto;
    private CatalogPhotoListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CatalogPhotoHelper.init();

        rvCatalogPhoto = findViewById(R.id.rv_catalog_photo);
        adapter = new CatalogPhotoListAdapter(this);

        rvCatalogPhoto.setAdapter(adapter);
        rvCatalogPhoto.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initRecyclerView() {
    }

    private void initData() {
        
    }
}