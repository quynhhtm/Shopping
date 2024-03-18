package com.example.shopping.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.shopping.R;
import com.example.shopping.domain.ProductDomain;

import java.util.ArrayList;

public class ProductAdapter2 extends ArrayAdapter<ProductDomain> {

    ArrayList<ProductDomain> arrayList;
    int resource;

    public ProductAdapter2(@NonNull Context context, int resource, ArrayList<ProductDomain> arrayList) {
        super(context, resource, arrayList);

        this.arrayList = arrayList;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            LayoutInflater inflater =  (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resource, null);
        }

        TextView name = convertView.findViewById(R.id.txt_product_name);
        TextView price = convertView.findViewById(R.id.txt_product_price);
        ImageView image = convertView.findViewById(R.id.img_product_pic);


        ProductDomain productDomain = arrayList.get(position);

        name.setText(productDomain.getName());
        price.setText(String.valueOf(productDomain.getPrice()));
        image.setImageResource(Integer.parseInt(productDomain.getImage()));

        return convertView;
    }
}
