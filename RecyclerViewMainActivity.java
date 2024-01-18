package com.marketplace.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<storagerecycler> strre;
    String first = "data";
    String second = "dataplus";
    int image1 = R.drawable.ic_launcher_background;
    int image2 = R.drawable.ic_launcher_foreground;
    int image3 = R.drawable.baseline_attach_email_24;
    int image5 = R.drawable.baseline_attach_money_24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.profile_recycler);

        datapack();

        adapterrecycler ar = new adapterrecycler(this, strre);
        recyclerView.setAdapter(ar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private  void  datapack(){
        strre = new ArrayList<>();

        strre.add(new storagerecycler(first, second, image1, image2));
        //strre.add(new storagerecycler(first, second, image3, image4));
        //strre.add(new storagerecycler(first, second, image5, image6));
    }
}