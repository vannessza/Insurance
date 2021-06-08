package com.example.apknewinsurance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Model.Plan100Model;

public class Plan100Premitahunan extends Fragment {

    View v;
    private RecyclerView fragment_recyclerview_premitahunan;
    private List<Plan100Model> dataNominal;
    private plan100PremitahunanAdapter adapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        dataNominal = new ArrayList<>();
//        dataNominal.add(new Plan100Model(100,100,200,300,400,500,600));
//        dataNominal.add(new Plan100Model(100,100,200,300,400,500,600));
//        dataNominal.add(new Plan100Model(100,100,200,300,400,500,600));
//        dataNominal.add(new Plan100Model(100,100,200,300,400,500,600));


    }

    public Plan100Premitahunan() {
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            if(resultCode == 200){
                Plan100Model BarangBaru = data.getParcelableExtra("BarangBaru");
                dataNominal.add(BarangBaru);
                adapter.notifyDataSetChanged();
            }
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.plan100_premitahunan_fragment, container, false);
        fragment_recyclerview_premitahunan = (RecyclerView) v.findViewById(R.id.fragment_recyclerview_premitahunan);
        dataNominal = new ArrayList<Plan100Model>();
//        Log.d("berhasil", String.valueOf(dataNominal.get(0).getNo()));
        plan100PremitahunanAdapter adapter = new plan100PremitahunanAdapter(getContext(),  dataNominal);
        fragment_recyclerview_premitahunan.setLayoutManager(new LinearLayoutManager(getActivity()));
        fragment_recyclerview_premitahunan.setAdapter(adapter);
        return v;
    }
}
