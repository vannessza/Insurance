package com.example.apknewinsurance;

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

public class Plan100Klaim extends Fragment {

    View v;
    private RecyclerView fragment_recyclerview_klaimmeninggal;
    private List<Plan100Model> dataNominal;
    public Plan100Klaim() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.plan100_klaim_fragment, container, false);
        fragment_recyclerview_klaimmeninggal = (RecyclerView) v.findViewById(R.id.fragment_recyclerview_klaimmeninggal);
        dataNominal = new ArrayList<Plan100Model>();
        //        dataNominal = new ArrayList<>();
//        dataNominal.add(new Plan100Model(100,100,200,300,400,500,600));
//        dataNominal.add(new Plan100Model(100,100,200,300,400,500,600));
//        dataNominal.add(new Plan100Model(100,100,200,300,400,500,600));
//        dataNominal.add(new Plan100Model(100,100,200,300,400,500,600));
        plan100KlaimAdapter adapter = new plan100KlaimAdapter(getContext(), dataNominal);
        fragment_recyclerview_klaimmeninggal.setLayoutManager(new LinearLayoutManager(getActivity()));
        fragment_recyclerview_klaimmeninggal.setAdapter(adapter);
        return v;
    }
}
