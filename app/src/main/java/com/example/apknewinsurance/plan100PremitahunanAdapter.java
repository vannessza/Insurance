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

public class plan100PremitahunanAdapter extends RecyclerView.Adapter<plan100PremitahunanAdapter.PremitahunanViewHolder> {
    Context mContext;
    List<Plan100Model> mData;

    public plan100PremitahunanAdapter(Context mContext, List<Plan100Model> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public PremitahunanViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.plan100_card, parent, false);
        PremitahunanViewHolder vHolder = new PremitahunanViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull  plan100PremitahunanAdapter.PremitahunanViewHolder holder, int position) {
        holder.card_no.setText(String.valueOf(mData.get(position).getNo()));
        holder.card_nominal.setText(String.valueOf(mData.get(position).getPremiTahunan()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class PremitahunanViewHolder extends RecyclerView.ViewHolder {
        private TextView card_no, card_nominal;
        public PremitahunanViewHolder(@NonNull View itemView) {
            super(itemView);
            card_no = (TextView) itemView.findViewById(R.id.card_no);
            card_nominal = (TextView) itemView.findViewById(R.id.card_nominal);
        }
    }
}
