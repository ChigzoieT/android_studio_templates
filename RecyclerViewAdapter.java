package com.marketplace.recycler_view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class adapterrecycler extends RecyclerView.Adapter<adapterrecycler.MyViewHolder> {

    Context context;
    ArrayList<storagerecycler> strre;

    public adapterrecycler(Context context, ArrayList<storagerecycler> strre) {
        this.context = context;
        this.strre = strre;}

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder (@NonNull ViewGroup parent,int viewType){
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.adapter, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder (@NonNull MyViewHolder holder,int position){
            int data1 = strre.get(position).getImage();
            int data2 = strre.get(position).getImage2();


            holder.image.setImageResource(strre.get(position).getImage2());
            holder.first.setText(strre.get(position).getFirst());
            holder.second.setText(strre.get(position).getSecond());
           
        }

        @Override
        public int getItemCount () {
            return strre.size();
        }

        public static class MyViewHolder extends RecyclerView.ViewHolder {
            ImageView image;
            TextView first, second;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                image = itemView.findViewById(R.id.image);
                first = itemView.findViewById(R.id.texx);
                second = itemView.findViewById(R.id.texxx);

            }
        }
    }
