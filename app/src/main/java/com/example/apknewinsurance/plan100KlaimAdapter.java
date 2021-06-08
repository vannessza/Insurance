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

public class plan100KlaimAdapter extends RecyclerView.Adapter<plan100KlaimAdapter.KlaimViewHolder> {

    Context mcontext;
    List<Plan100Model> mData;
    public plan100KlaimAdapter(Context mcontext, List<Plan100Model> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public KlaimViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mcontext).inflate(R.layout.plan100_card, parent, false);
        KlaimViewHolder vHolder = new KlaimViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull  plan100KlaimAdapter.KlaimViewHolder holder, int position) {
        holder.card_no.setText(String.valueOf(mData.get(position).getNo()));
        holder.card_nominal.setText(String.valueOf(mData.get(position).getKlaim()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class KlaimViewHolder extends RecyclerView.ViewHolder {
        private TextView card_no, card_nominal;
        public KlaimViewHolder(@NonNull  View itemView) {
            super(itemView);
            card_no = (TextView) itemView.findViewById(R.id.card_no);
            card_nominal = (TextView) itemView.findViewById(R.id.card_nominal);
        }
    }
}
