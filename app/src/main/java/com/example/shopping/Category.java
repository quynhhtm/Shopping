package com.example.shopping;

public class Category {
    private String category_name;
    private boolean checked;

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Category() {
    }

    public Category(String category_name, boolean checked) {
        this.category_name = category_name;
        this.checked = checked;
    }
}
