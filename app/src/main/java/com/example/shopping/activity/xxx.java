package com.example.shopping.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.shopping.adapter.ProductAdapter;
import com.example.shopping.databinding.ActivityFavouriteBinding;
import com.example.shopping.domain.ProductDomain;

import java.util.ArrayList;

public class xxx extends AppCompatActivity {
    ActivityFavouriteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFavouriteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initRecyclerView();
    }


    private void initRecyclerView() {

        ArrayList<ProductDomain> items = new ArrayList<ProductDomain>();

        // int id, String name, String image, String description, double price
        items.add(new ProductDomain(1, "a", "shoes", "rte", 12));
        items.add(new ProductDomain(2, "a", "shoes", "ert", 12));
        items.add(new ProductDomain(3, "a", "shoes", "ert", 12));
        items.add(new ProductDomain(4, "a", "shoes", "ert", 12));
        items.add(new ProductDomain(5, "a", "shoes", "ert", 12));

//        binding.recyclerProductFavourite.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
//        binding.recyclerProductFavourite.setAdapter(new ProductAdapter(items));

    }
}
