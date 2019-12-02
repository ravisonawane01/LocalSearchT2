package com.example.ravi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.ravi.R;
import com.example.ravi.app.GlideApp;
import com.example.ravi.network.model.Resultarray;

import java.util.ArrayList;
import java.util.List;

public class HealthTipsAdapterFilterable extends RecyclerView.Adapter<HealthTipsAdapterFilterable.MyViewHolder>
        implements Filterable {

    private Context context;
    private List<Resultarray> tipsList;
    private List<Resultarray> tipsListFiltered;

    public HealthTipsAdapterFilterable(Context context, List<Resultarray> tipsList) {
        this.context = context;
        this.tipsList = tipsList;
        this.tipsListFiltered = tipsList;
    }

    @NonNull
    @Override
    public HealthTipsAdapterFilterable.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list_health_tips, parent, false);

        return new HealthTipsAdapterFilterable.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HealthTipsAdapterFilterable.MyViewHolder holder, final int position) {
        final Resultarray resultarray = tipsListFiltered.get(position);
        holder.title.setText(resultarray.getTitle());
        holder.like.setImageResource(resultarray.getStatus() == 0 ? R.drawable.ic_like : R.drawable.ic_dislike);
        holder.totalLikes.setText(String.valueOf(resultarray.getTotalLikes()));
        holder.totalViews.setText(String.valueOf(resultarray.getTotalViews()));

        GlideApp.with(context)
                .load(resultarray.getImage())
                .override(300, 300)
                .fitCenter()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return tipsListFiltered.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString.isEmpty()) {
                    tipsListFiltered = tipsList;
                } else {
                    List<Resultarray> filteredList = new ArrayList<>();
                    for (Resultarray row : tipsList) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name or phone number match
                        if (row.getTitle().toLowerCase().contains(charString.toLowerCase()) || row.getSummary().contains(charSequence)) {
                            filteredList.add(row);
                        }
                    }

                    tipsListFiltered = filteredList;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = tipsListFiltered;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                tipsListFiltered = (ArrayList<Resultarray>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, totalLikes, totalViews;
        public ImageView image, like;

        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.main_title);
            image = view.findViewById(R.id.iv_tip_image);
            like = view.findViewById(R.id.action_like);
            totalLikes = view.findViewById(R.id.total_likes);
            totalViews = view.findViewById(R.id.total_view);
        }
    }
}