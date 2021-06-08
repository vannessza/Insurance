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

import Account.User;

public class FragmentProfile extends Fragment {
    View v;
    private Button profile_button_logout;
    private TextView profile_textView_noTelp, profile_textView_umur, profile_textView_ttl,  profile_textView_nama, profile_textView_email ;

    public FragmentProfile() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.profile_fragment, container, false);
        profile_button_logout = v.findViewById(R.id.profile_button_logout);

        profile_textView_umur = v.findViewById(R.id.profile_textView_umur);
        profile_textView_ttl = v.findViewById(R.id.profile_textView_ttl);
        profile_textView_noTelp = v.findViewById(R.id.profile_textView_noTelp);
        profile_textView_nama = v.findViewById(R.id.profile_textView_nama);
        profile_textView_email = v.findViewById(R.id.profile_textView_email);

        Intent intent = new Intent();


        User user = intent.getParcelableExtra("IDnama");

        profile_textView_nama.setText(user.getNama());

        profile_button_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LoginMenu.class);
                startActivity(intent);
            }
        });
        return v;
    }
}