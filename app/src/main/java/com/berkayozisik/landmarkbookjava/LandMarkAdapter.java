package com.berkayozisik.landmarkbookjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.berkayozisik.landmarkbookjava.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandMarkAdapter extends RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder> {

    ArrayList<LandMark> list;

    public LandMarkAdapter(ArrayList<LandMark> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public LandMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding =
                RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LandMarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandMarkHolder holder, int position) {
        holder.binding.rvTextView.setText(list.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
                intent.putExtra("landmark", list.get(holder.getAdapterPosition()));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LandMarkHolder extends RecyclerView.ViewHolder {

        private RecyclerRowBinding binding;

        public LandMarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());

            this.binding = binding;
        }
    }

}
