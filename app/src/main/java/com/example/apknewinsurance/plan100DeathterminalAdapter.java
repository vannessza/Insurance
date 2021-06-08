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

public class plan100DeathterminalAdapter extends RecyclerView.Adapter<plan100DeathterminalAdapter.DeathterminalViewHolder> {

    Context mContext;
    List<Plan100Model> mData;

    public plan100DeathterminalAdapter(Context mContext, List<Plan100Model> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public DeathterminalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.plan100_card, parent, false);
        DeathterminalViewHolder vHolder = new DeathterminalViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull plan100DeathterminalAdapter.DeathterminalViewHolder holder, int position) {
        holder.card_no.setText(String.valueOf(mData.get(position).getNo()));
        holder.card_nominal.setText(String.valueOf(mData.get(position).getDeathTerminal()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class DeathterminalViewHolder extends RecyclerView.ViewHolder {
        private TextView card_no, card_nominal;
        public DeathterminalViewHolder(@NonNull View itemView) {
            super(itemView);
            card_no = (TextView) itemView.findViewById(R.id.card_no);
            card_nominal = (TextView) itemView.findViewById(R.id.card_nominal);
        }
    }
}