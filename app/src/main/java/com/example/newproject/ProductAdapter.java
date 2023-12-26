package com.example.newproject;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {

    private ArrayList<Product> listProduct;

    public ProductAdapter(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    @Override
    public int getCount() {
        return listProduct.size();
    }

    @Override
    public Object getItem(int i) {
        //i la vtri cua Item trong danh sach
        return listProduct.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listProduct.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewItem; //View cua 1 san pham
        if(view == null)viewItem = View.inflate(viewGroup.getContext(), R.layout.product_view, null);
        else viewItem = view;
        Product product = listProduct.get(i);

        //ten spham

        ImageView img_place = viewItem.findViewById(R.id.product_image);
        img_place.setImageResource(product.getImage());

        ((TextView) viewItem.findViewById(R.id.product_id)).setText(String.valueOf(product.getId()));

        ((TextView) viewItem.findViewById(R.id.product_name)).setText(product.getName());

        ((TextView) viewItem.findViewById(R.id.product_price)).setText(product.getGioiThieu());
        return viewItem;
    }
}
