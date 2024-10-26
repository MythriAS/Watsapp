package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerSAdapter extends RecyclerView.Adapter<RecyclerSAdapter.ViewHolder>

{
    ModelClass[] modelClasses;

    public RecyclerSAdapter(ModelClass[] modelClasses) {
        this.modelClasses = modelClasses;
    }

    @NonNull
    @Override
    public RecyclerSAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.activity_recycler_view,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerSAdapter.ViewHolder holder, int position) {
        ModelClass modelClasses1=modelClasses[position];
        holder.img.setImageResource(modelClasses1.getImage());
        holder.txt1.setText(modelClasses1.getDescribtion1());
        holder.txt2.setText(modelClasses1.getDescribtion2());
    }

    @Override
    public int getItemCount() {
        return modelClasses.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt1,txt2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            txt1=itemView.findViewById(R.id.text1);
            txt2=itemView.findViewById(R.id.text2);

        }
    }
}
