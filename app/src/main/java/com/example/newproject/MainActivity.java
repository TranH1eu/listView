package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        list.add(new Product(R.drawable.danang, "Đà Nẵng", 1, "Ba Na Hills, Cau Rong, ...."));
        list.add(new Product(R.drawable.dalat, "Đà Lạt", 2, "Lâm Viên, Hồ Xuân Hương, ...."));
        list.add(new Product(R.drawable.sapa, "Sapa", 3, "Cầu cổng trời, Đèo ô quy hồ, Fansipan"));
        list.add(new Product(R.drawable.maldives, "Maldives", 4, "Male Capital, Utheemu, IThaa.."));
        list.add(new Product(R.drawable.nhatrang, "Nha Trang", 5, "Cầu tình yêu, Đảo Yến, Đảo Hòn Mun"));

        ProductAdapter adapter = new ProductAdapter(list);
        ListView listView = findViewById(R.id.listProduct);
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Product product = (Product) adapter.getItem(position);
//                //Làm gì đó khi chọn sản phẩm (ví dụ tạo một Activity hiện thị chi tiết, biên tập ..)
////                Toast.makeText(MainActivity.this, product.getName(), Toast.LENGTH_LONG).show();
//
//                int a = product.getId();
//                if(a == 1) {
//                    Intent intent = new Intent(MainActivity.this,ActivityB.class );
//                    startActivity(intent);
//                }
//                if(a == 2) {
//                    Intent intent = new Intent(MainActivity.this,ActivityC.class );
//                    startActivity(intent);
//                }
//                if(a == 3) {
//                    Intent intent = new Intent(MainActivity.this,ActivityD.class );
//                    startActivity(intent);
//                }
//                if(a == 4) {
//                    Intent intent = new Intent(MainActivity.this,ActivityE.class );
//                    startActivity(intent);
//                }
//                if(a == 5) {
//                    Intent intent = new Intent(MainActivity.this,ActivityF.class );
//                    startActivity(intent);
//                }
//            }
//        });



    }
}