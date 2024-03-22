package com.example.shopping.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.shopping.R;
import com.example.shopping.databinding.ActivityProductFavouriteBinding;
import com.example.shopping.domain.ProductDomain;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.Viewholder> {

    ArrayList<ProductDomain> items;
    Context context;
    ActivityProductFavouriteBinding binding;

    public ProductAdapter(ArrayList<ProductDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ProductAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ActivityProductFavouriteBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        context = parent.getContext();
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.Viewholder holder, int position) {

        binding.txtProductName.setText(items.get(position).getName());
        binding.txtProductPrice.setText("$" + items.get(position).getPrice());

        int drawableResourced = holder.itemView.getResources().getIdentifier(items.get(position).getImage(),
                "drawable", holder.itemView.getContext().getPackageName());

        Glide.with(context)
                .load(drawableResourced)
                .transform(new GranularRoundedCorners(30, 30, 0, 0))
                .into(binding.imgProductPic);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        public Viewholder(ActivityProductFavouriteBinding binding) {
            super(binding.getRoot());
        }
    }
}
