package com.example.shopping;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryHolder>{
    private List<Category> myCategoryList;

    public CategoryAdapter(List<Category> myCategoryList) {
        this.myCategoryList = myCategoryList;
    }

    @NonNull
    @Override
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_category, parent, false);
        return new CategoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryHolder holder, int position) {
        Category c = myCategoryList.get(position);
        if(c == null){
            return;
        }else{
            holder.txt_categoryName.setText(c.getCategory_name());
            if (c.isChecked() == true){
                holder.lnl_catetgory.setBackgroundResource(R.drawable.category_select_background);
            }else{
                holder.lnl_catetgory.setBackgroundResource(R.drawable.category_unselect_background);
            }
        }
    }

    @Override
    public int getItemCount() {
        if(myCategoryList != null){
            return myCategoryList.size();
        }else{
            return 0;
        }
    }

    class CategoryHolder extends RecyclerView.ViewHolder{
        TextView txt_categoryName;
        LinearLayout lnl_catetgory;
        public CategoryHolder(@NonNull View itemView) {
            super(itemView);
            txt_categoryName = itemView.findViewById(R.id.txt_categoryName);
            lnl_catetgory = itemView.findViewById(R.id.lnl_category);

        }
    }
}
