package com.example.apknewinsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

import Model.DataDeposit;
import Model.Transfer;
import Model.Transfer;

public class InputTransfer extends AppCompatActivity {
    private ImageView transfer_imageView_back;
    private TextInputLayout transfer_textInputLayout_jumlahTransfer;
    private Button transfer_button_pembayaran;
    private ArrayList<Transfer> nominal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_transfer);

        transfer_imageView_back = findViewById(R.id.transfer_imageView_back);
        transfer_button_pembayaran = findViewById(R.id.transfer_button_pembayaran);
        transfer_textInputLayout_jumlahTransfer = findViewById(R.id.transfer_textInputLayout_jumlahTransfer);


        transfer_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), FragmentHome.class);
                startActivity(intent);
            }
        });

        transfer_button_pembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uangDeposit = transfer_textInputLayout_jumlahTransfer.getEditText().getText().toString().trim();

                if(!uangDeposit.isEmpty()){
                    Intent intent = new Intent(getBaseContext(), Payment.class);
                    intent.putExtra("totalDeposit", uangDeposit);
                    startActivity(intent);

                }
            }
        });

        transfer_textInputLayout_jumlahTransfer.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String deposit = transfer_textInputLayout_jumlahTransfer.getEditText().getText().toString().trim();

                if(deposit.isEmpty()) {
                    transfer_textInputLayout_jumlahTransfer.setError("Harap masukkan jumlah transfer");
                } else {
                    transfer_textInputLayout_jumlahTransfer.setError("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
