package com.oktafia.myrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridWifeAdapter extends RecyclerView.Adapter<GridWifeAdapter.GridViewHolder> {
    private ArrayList<Wife> listWifes;


    public GridWifeAdapter(ArrayList<Wife> list) {
        this.listWifes = list;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_wife, viewGroup, false);
        return new GridViewHolder(view);
    }

    private ListWifeAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(ListWifeAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listWifes.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

    }


    @Override
    public int getItemCount() {
        return listWifes.size();
    }

    static class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }

    }
}
