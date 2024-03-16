package com.example.shopping;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcv_category;
    private List<Category> categories;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_category = findViewById(R.id.rcv_category);
        categories = new ArrayList<>();

        categories.add(new Category("All shoes", true));
        categories.add(new Category("Tennis", false));
        categories.add(new Category("Adidas", false));
        categories.add(new Category("Nike", false));

        categoryAdapter = new CategoryAdapter(categories);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcv_category.setLayoutManager(linearLayoutManager);
        RecyclerView.ItemDecoration decoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcv_category.setAdapter(categoryAdapter);
    }
}