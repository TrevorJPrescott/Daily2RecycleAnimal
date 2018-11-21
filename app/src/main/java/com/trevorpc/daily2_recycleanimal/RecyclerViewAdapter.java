package com.trevorpc.daily2_recycleanimal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>
{
    Context context;
    ArrayList<Animal> list;


    public RecyclerViewAdapter(Context context, ArrayList<Animal> passedList) {
        this.context = context;
        this.list = passedList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder viewHolder = new ViewHolder(inflater.inflate(R.layout.input,viewGroup,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvName.setText(list.get(i).name);
        viewHolder.tvDesc.setText(list.get(i).desc);
        int id = context.getResources().getIdentifier(list.get(i).picture, "drawable", context.getPackageName());
        viewHolder.ivPicture.setImageResource(id);


        ;



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView ivPicture;
        TextView tvDesc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPicture = itemView.findViewById(R.id.ivPicture);
            tvName = itemView.findViewById(R.id.tvName);
            tvDesc = itemView.findViewById((R.id.tvDesc));
        }
    }
}
