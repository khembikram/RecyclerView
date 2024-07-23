package com.example.recicylerviewinjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    RecyclerItemDTO [] recyclerItem;

    public RecyclerViewAdapter(RecyclerItemDTO[] recyclerItem) {
        this.recyclerItem = recyclerItem;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflator = LayoutInflater.from(parent.getContext());
        View view = layoutInflator.inflate(R.layout.layout_recycleview_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.textView.setText(recyclerItem[position].getLanguagees());
        holder.imageView.setImageResource(recyclerItem[position].getItemImages());
    }

    @Override
    public int getItemCount() {
        return recyclerItem.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageItemRecycler);
            textView=itemView.findViewById(R.id.textItemRecycler);
        }
    }
}
