package com.example.mycoworkers.app.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.mycoworkers.R;
import com.example.mycoworkers.data.CoWorker;

import java.util.ArrayList;

public class ListCoWorkerAdapter extends RecyclerView.Adapter<ListCoWorkerAdapter.ViewHolder> {
    private ArrayList<CoWorker> coWorkerList;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListCoWorkerAdapter(ArrayList<CoWorker> coWorkerList) {
        this.coWorkerList = coWorkerList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_co_worker, parent, false);
        return new ListCoWorkerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Glide.with(holder.itemView.getContext())
                .load(coWorkerList.get(position).getWorkerPhoto())
                .apply(new RequestOptions().placeholder(R.drawable.ic_baseline_person))
                .into(holder.ivPhoto);
        holder.tvName.setText(coWorkerList.get(position).getName());
        holder.tvTitle.setText(coWorkerList.get(position).getTitlePosition());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClick(coWorkerList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return coWorkerList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPhoto;
        TextView tvName, tvTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPhoto = itemView.findViewById(R.id.iv_worker_photo);
            tvName = itemView.findViewById(R.id.tv_worker_name);
            tvTitle = itemView.findViewById(R.id.tv_worker_title_position);
        }
    }

    public interface OnItemClickCallback{
        void onItemClick(CoWorker coWorker);
    }
}
