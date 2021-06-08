package com.example.apknewinsurance;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentHome extends Fragment {
    View v;
    private Button home_button_plan100, home_button_isiSaldo;
    private TextView home_textView_paymentHistory, home_textView_jumlahSaldo;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public FragmentHome() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.home_fragment, container, false);
        home_textView_jumlahSaldo = v.findViewById(R.id.home_textView_jumlahSaldo);
        home_textView_paymentHistory = v.findViewById(R.id.home_textView_paymentHistory);
        home_button_isiSaldo = (Button) v.findViewById(R.id.home_button_isiSaldo);
        home_button_plan100 = (Button) v.findViewById(R.id.home_button_plan100);
        home_button_plan100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AsuransiTradisional.class);
                startActivity(intent);
            }
        });

        return v;
    }

}
