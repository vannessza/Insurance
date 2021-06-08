package com.example.apknewinsurance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Model.Plan100Model;

public class plan100TotalklaimAdapter extends RecyclerView.Adapter<plan100TotalklaimAdapter.TotalklaimViewHolder>{

    Context mContext;
    List<Plan100Model> mData;

    public plan100TotalklaimAdapter(Context mContext, List<Plan100Model> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public TotalklaimViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.plan100_card, parent, false);
        TotalklaimViewHolder vHolder = new TotalklaimViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull plan100TotalklaimAdapter.TotalklaimViewHolder holder, int position) {
        holder.card_no.setText(String.valueOf(mData.get(position).getNo()));
        holder.card_nominal.setText(String.valueOf(mData.get(position).getTotalKlaim()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class TotalklaimViewHolder extends RecyclerView.ViewHolder {
        private TextView card_no, card_nominal;
        public TotalklaimViewHolder(@NonNull View itemView) {
            super(itemView);
            card_no = (TextView) itemView.findViewById(R.id.card_no);
            card_nominal = (TextView) itemView.findViewById(R.id.card_nominal);
        }
    }
}
