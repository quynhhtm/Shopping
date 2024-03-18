package com.example.shopping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.example.shopping.adapter.ProductAdapter;
import com.example.shopping.adapter.ProductAdapter2;
import com.example.shopping.databinding.ActivityFavouriteBinding;
import com.example.shopping.domain.ProductDomain;

import java.util.ArrayList;

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
        setContentView(R.layout.activity_favourite);
        LoadProductFavourite();


    }

    private void LoadProductFavourite(){

        // Toast.makeText(this, String.valueOf(R.drawable.ic_launcher_background), Toast.LENGTH_SHORT).show();

        ArrayList<ProductDomain> items = new ArrayList<ProductDomain>();

        // int id, String name, String image, String description, double price
        items.add(new ProductDomain(1, "a", String.valueOf(R.drawable.shoes7), "rte", 12));
        items.add(new ProductDomain(2, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(3, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(4, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));
        items.add(new ProductDomain(5, "a", String.valueOf(R.drawable.shoes7), "ert", 12));

        GridView gridView = findViewById(R.id.grv_favourite);
        ProductAdapter2 customAdapter = new ProductAdapter2(this, R.layout.activity_product_favourite, items);
        gridView.setAdapter(customAdapter);


    }


}