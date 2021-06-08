package com.example.apknewinsurance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Model.Plan100Model;

public class AsuransiTradisional extends AppCompatActivity {
    private TabLayout plan100_tablayout;
    private Button main_button_hitung;
    private ViewPager plan100_vpager;
    private ViewPagerAdapter adapter;
    private TextInputLayout main_textinput_uang, main_textview_umur;
    private TextView plan100_umur;
    private TextView plan100_tahunan;
    private TextView plan100_semesteran;
    private TextView plan100_triwulan;
    private TextView plan100_bulanan;
    private Spinner Tradisional_spinner_jeniskelamin, main_spinner_masa;
    private List<Plan100Model> dataNominal;
    int year;
    int month;
    int day;
    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {


        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asuransi_tradisional);
        plan100_tablayout = (TabLayout) findViewById(R.id.plan100_tablayout);
        plan100_vpager = (ViewPager) findViewById(R.id.plan100_vpager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Plan100Premitahunan(), "Premi Tahunan");
        adapter.AddFragment(new Plan100Klaim(), "Klaim Meninggal Dunia");
        adapter.AddFragment(new Plan100Nilaidijamin(), "Nilai Tunai yang Dijamin");
        adapter.AddFragment(new Plan100Deathterminal(), "Death Terminal");
        adapter.AddFragment(new Plan100Totalklaim(), "Total Klaim Meninggal");
        adapter.AddFragment(new Plan100Nilaitidakdijamin(),"Nilai Tunai ynag Tidak Dijamin");
        plan100_vpager.setAdapter(adapter);
        plan100_tablayout.setupWithViewPager(plan100_vpager);
        main_textinput_uang = findViewById(R.id.main_textinput_uang);
        main_textview_umur = findViewById(R.id.main_textview_umur);
        main_button_hitung = findViewById(R.id.main_button_hitung);
        plan100_umur = findViewById(R.id.plan100_umur);
        Tradisional_spinner_jeniskelamin = findViewById(R.id.Tradisional_spinner_jeniskelamin);
        main_spinner_masa = findViewById(R.id.main_spinner_masa);
        plan100_tahunan = findViewById(R.id.plan100_tahunan);
        plan100_semesteran = findViewById(R.id.plan100_semesteran);
        plan100_triwulan = findViewById(R.id.plan100_triwulan);
        plan100_bulanan = findViewById(R.id.plan100_bulanan);

    }



    private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            main_button_hitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String b = plan100_umur.getText().toString();
                    int umur = Integer.parseInt(main_textview_umur.getEditText().getText().toString().trim());
                    long a = Long.parseLong(main_textinput_uang.getEditText().getText().toString().trim());
                    long c = a;
                    long bc = a;
                    long uangtertanggung = a;
                    long uangp = a;
                    double bunga = 5.5;
                    int masapremi = 0;
                    long uangresiko = a;
                    System.out.println("Cara Bayar : ");
                    long bulanan = 0;
                    long triwulan = 0;
                    long semesteran = 0;
                    long tahunan = 0;
                    long tahunan1 = 0;
                    int dx = 0;
                    int lx = 0;
                    if (main_spinner_masa.getSelectedItem().toString() == "1 Tahun") {
                        masapremi = 1;
                    } else if (main_spinner_masa.getSelectedItem().toString() == "2 Tahun") {
                        masapremi = 2;
                    } else if (main_spinner_masa.getSelectedItem().toString() == "3 Tahun") {
                        masapremi = 3;
                    } else if (main_spinner_masa.getSelectedItem().toString() == "4 Tahun") {
                        masapremi = 4;
                    } else if (main_spinner_masa.getSelectedItem().toString() == "5 Tahun") {
                        masapremi = 5;
                    } else if (main_spinner_masa.getSelectedItem().toString() == "6 Tahun") {
                        masapremi = 6;
                    }

                    if (Tradisional_spinner_jeniskelamin.getSelectedItem()== "Pria") {
                        if (umur == 1) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 2) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 3) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 4) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 5) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 6) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 7) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 8) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 9) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 10) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 11) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 12) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 13) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 14) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 15) {
                            dx = 706;
                            lx = 96336;
                        }
                        if (umur == 16) {
                            dx = 706;
                            lx = 96336;
                        }
                        if (umur == 17) {
                            dx = 706;
                            lx = 96336;
                        }
                        if (umur == 18) {
                            dx = 706;
                            lx = 96336;
                        }
                        if (umur == 19) {
                            dx = 706;
                            lx = 96336;
                        }
                        if (umur == 20) {
                            dx = 993;
                            lx = 95335;
                        }
                        if (umur == 21) {
                            dx = 993;
                            lx = 95335;
                        }
                        if (umur == 22) {
                            dx = 993;
                            lx = 95335;
                        }
                        if (umur == 23) {
                            dx = 993;
                            lx = 95335;
                        }
                        if (umur == 24) {
                            dx = 993;
                            lx = 95335;
                        }
                        if (umur == 25) {
                            dx = 1019;
                            lx = 94342;
                        }
                        if (umur == 26) {
                            dx = 1019;
                            lx = 94342;
                        }
                        if (umur == 27) {
                            dx = 1019;
                            lx = 94342;
                        }
                        if (umur == 28) {
                            dx = 1019;
                            lx = 94342;
                        }
                        if (umur == 29) {
                            dx = 1019;
                            lx = 94342;
                        }
                        if (umur == 30) {
                            dx = 1185;
                            lx = 93323;
                        }
                        if (umur == 31) {
                            dx = 1185;
                            lx = 93323;
                        }
                        if (umur == 32) {
                            dx = 1185;
                            lx = 93323;
                        }
                        if (umur == 33) {
                            dx = 1185;
                            lx = 93323;
                        }
                        if (umur == 34) {
                            dx = 1185;
                            lx = 93323;
                        }
                        if (umur == 35) {
                            dx = 1542;
                            lx = 92138;
                        }
                        if (umur == 36) {
                            dx = 1542;
                            lx = 92138;
                        }
                        if (umur == 37) {
                            dx = 1542;
                            lx = 92138;
                        }
                        if (umur == 38) {
                            dx = 1542;
                            lx = 92138;
                        }
                        if (umur == 39) {
                            dx = 1542;
                            lx = 92138;
                        }
                        if (umur == 40) {
                            dx = 2175;
                            lx = 90597;
                        }
                        if (umur == 41) {
                            dx = 2175;
                            lx = 90597;
                        }
                        if (umur == 42) {
                            dx = 2175;
                            lx = 90597;
                        }
                        if (umur == 43) {
                            dx = 2175;
                            lx = 90597;
                        }
                        if (umur == 44) {
                            dx = 2175;
                            lx = 90597;
                        }
                        if (umur == 45) {
                            dx = 3165;
                            lx = 88421;
                        }
                        if (umur == 46) {
                            dx = 3165;
                            lx = 88421;
                        }
                        if (umur == 47) {
                            dx = 3165;
                            lx = 88421;
                        }
                        if (umur == 48) {
                            dx = 3165;
                            lx = 88421;
                        }
                        if (umur == 49) {
                            dx = 3165;
                            lx = 88421;
                        }
                        if (umur == 50) {
                            dx = 4615;
                            lx = 85256;
                        }
                        if (umur == 51) {
                            dx = 4615;
                            lx = 85256;
                        }
                        if (umur == 52) {
                            dx = 4615;
                            lx = 85256;
                        }
                        if (umur == 53) {
                            dx = 4615;
                            lx = 85256;
                        }
                        if (umur == 54) {
                            dx = 4615;
                            lx = 85256;
                        }
                        if (umur == 55) {
                            dx = 6573;
                            lx = 80641;
                        }
                        if (umur == 56) {
                            dx = 6573;
                            lx = 80641;
                        }
                        if (umur == 57) {
                            dx = 6573;
                            lx = 80641;
                        }
                        if (umur == 58) {
                            dx = 6573;
                            lx = 80641;
                        }
                        if (umur == 59) {
                            dx = 6573;
                            lx = 80641;
                        }
                        if (umur == 60) {
                            dx = 9007;
                            lx = 74068;
                        }
                        if (umur == 61) {
                            dx = 9007;
                            lx = 74068;
                        }
                        if (umur == 62) {
                            dx = 9007;
                            lx = 74068;
                        }
                        if (umur == 63) {
                            dx = 9007;
                            lx = 74068;
                        }
                        if (umur == 64) {
                            dx = 9007;
                            lx = 74068;
                        }
                        if (umur == 65) {
                            dx = 11583;
                            lx = 65061;
                        }
                    } else if (Tradisional_spinner_jeniskelamin.getSelectedItem()== "Wanita") {
                        if (umur == 1) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 2) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 3) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 4) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 5) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 6) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 7) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 8) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 9) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 10) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 11) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 12) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 13) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 14) {
                            dx = 422;
                            lx = 96750;
                        }
                        if (umur == 15) {
                            dx = 545;
                            lx = 96455;
                        }
                        if (umur == 16) {
                            dx = 545;
                            lx = 96455;
                        }
                        if (umur == 17) {
                            dx = 545;
                            lx = 96455;
                        }
                        if (umur == 18) {
                            dx = 545;
                            lx = 96455;
                        }
                        if (umur == 19) {
                            dx = 545;
                            lx = 96455;
                        }
                        if (umur == 20) {
                            dx = 684;
                            lx = 95911;
                        }
                        if (umur == 21) {
                            dx = 684;
                            lx = 95911;
                        }
                        if (umur == 22) {
                            dx = 684;
                            lx = 95911;
                        }
                        if (umur == 23) {
                            dx = 684;
                            lx = 95911;
                        }
                        if (umur == 24) {
                            dx = 684;
                            lx = 95911;
                        }
                        if (umur == 25) {
                            dx = 777;
                            lx = 95226;
                        }
                        if (umur == 26) {
                            dx = 777;
                            lx = 95226;
                        }
                        if (umur == 27) {
                            dx = 777;
                            lx = 95226;
                        }
                        if (umur == 28) {
                            dx = 777;
                            lx = 95226;
                        }
                        if (umur == 29) {
                            dx = 777;
                            lx = 95226;
                        }
                        if (umur == 30) {
                            dx = 989;
                            lx = 94450;
                        }
                        if (umur == 31) {
                            dx = 989;
                            lx = 94450;
                        }
                        if (umur == 32) {
                            dx = 989;
                            lx = 94450;
                        }
                        if (umur == 33) {
                            dx = 989;
                            lx = 94450;
                        }
                        if (umur == 34) {
                            dx = 989;
                            lx = 94450;
                        }
                        if (umur == 35) {
                            dx = 1378;
                            lx = 93461;
                        }
                        if (umur == 36) {
                            dx = 1378;
                            lx = 93461;
                        }
                        if (umur == 37) {
                            dx = 1378;
                            lx = 93461;
                        }
                        if (umur == 38) {
                            dx = 1378;
                            lx = 93461;
                        }
                        if (umur == 39) {
                            dx = 1378;
                            lx = 93461;
                        }
                        if (umur == 40) {
                            dx = 1965;
                            lx = 92083;
                        }
                        if (umur == 41) {
                            dx = 1965;
                            lx = 92083;
                        }
                        if (umur == 42) {
                            dx = 1965;
                            lx = 92083;
                        }
                        if (umur == 43) {
                            dx = 1965;
                            lx = 92083;
                        }
                        if (umur == 44) {
                            dx = 1965;
                            lx = 92083;
                        }
                        if (umur == 45) {
                            dx = 2765;
                            lx = 90118;
                        }
                        if (umur == 46) {
                            dx = 2765;
                            lx = 90118;
                        }
                        if (umur == 47) {
                            dx = 2765;
                            lx = 90118;
                        }
                        if (umur == 48) {
                            dx = 2765;
                            lx = 90118;
                        }
                        if (umur == 49) {
                            dx = 2765;
                            lx = 90118;
                        }
                        if (umur == 50) {
                            dx = 3847;
                            lx = 87353;
                        }
                        if (umur == 51) {
                            dx = 3847;
                            lx = 87353;
                        }
                        if (umur == 52) {
                            dx = 3847;
                            lx = 87353;
                        }
                        if (umur == 53) {
                            dx = 3847;
                            lx = 87353;
                        }
                        if (umur == 54) {
                            dx = 3847;
                            lx = 87353;
                        }
                        if (umur == 55) {
                            dx = 5213;
                            lx = 83505;
                        }
                        if (umur == 56) {
                            dx = 5213;
                            lx = 83505;
                        }
                        if (umur == 57) {
                            dx = 5213;
                            lx = 83505;
                        }
                        if (umur == 58) {
                            dx = 5213;
                            lx = 83505;
                        }
                        if (umur == 59) {
                            dx = 5213;
                            lx = 83505;
                        }
                        if (umur == 60) {
                            dx = 7111;
                            lx = 78293;
                        }
                        if (umur == 61) {
                            dx = 7111;
                            lx = 78293;
                        }
                        if (umur == 62) {
                            dx = 7111;
                            lx = 78293;
                        }
                        if (umur == 63) {
                            dx = 7111;
                            lx = 78293;
                        }
                        if (umur == 64) {
                            dx = 7111;
                            lx = 78293;
                        }
                        if (umur == 65) {
                            dx = 9581;
                            lx = 71182;
                        }
                    }
                    long resiko = 0;
                    if (umur >= 1 && umur <= 14) {
                        resiko = (long) (uangresiko * 0.01);
                    } else if (umur >= 15 && umur <= 19) {
                        resiko = (long) (uangresiko * 0.02);
                    } else if (umur >= 20 && umur <= 24) {
                        resiko = (long) (uangresiko * 0.03);
                    } else if (umur >= 25 && umur <= 29) {
                        resiko = (long) (uangresiko * 0.04);
                    } else if (umur >= 30 && umur <= 34) {
                        resiko = (long) (uangresiko * 0.05);
                    } else if (umur >= 35 && umur <= 39) {
                        resiko = (long) (uangresiko * 0.06);
                    } else if (umur >= 40 && umur <= 44) {
                        resiko = (long) (uangresiko * 0.07);
                    } else if (umur >= 45 && umur <= 49) {
                        resiko = (long) (uangresiko * 0.09);
                    } else if (umur >= 50 && umur <= 54) {
                        resiko = (long) (uangresiko * 0.13);
                    } else if (umur >= 55 && umur <= 59) {
                        resiko = (long) (uangresiko * 0.17);
                    } else if (umur >= 60 && umur <= 65) {
                        resiko = (long) (uangresiko * 0.23);
                    }

                    long hasil = a * 9581;
                    int tabel = 100 - umur;
                    hasil = (hasil / 71182) + resiko;
                    hasil = (long) (hasil + a * 0.055);
                    long total = hasil / 5;

                    if (total / 12 > 500000) {
                        bulanan = total / 12;
                    }
                    if (total / 4 > 500000) {
                        triwulan = total / 4;
                    }
                    if (total / 2 > 500000) {
                        semesteran = total / 2;
                    }
                    if (total / 1 > 500000) {
                        tahunan = total / 1;
                    }
                    plan100_tahunan.setText(String.valueOf(tahunan));
                    plan100_semesteran.setText(String.valueOf(semesteran));
                    plan100_triwulan.setText(String.valueOf(triwulan));
                    plan100_bulanan.setText(String.valueOf(bulanan));

                    long d = +tahunan;

                    double kali = 0;
                    if (umur == 1) {
                        kali = 0.88;
                    } else if (umur == 2) {
                        kali = 0.89;
                    } else if (umur == 3) {
                        kali = 0.90;
                    } else if (umur == 4) {
                        kali = 0.91;
                    } else if (umur == 5) {
                        kali = 0.92;
                    } else if (umur == 6) {
                        kali = 0.93;
                    } else if (umur == 7) {
                        kali = 0.94;
                    } else if (umur == 8) {
                        kali = 0.95;
                    } else if (umur == 9) {
                        kali = 0.96;
                    } else if (umur == 10) {
                        kali = 0.97;
                    } else if (umur == 11) {
                        kali = 0.98;
                    } else if (umur == 12) {
                        kali = 0.99;
                    } else if (umur == 13) {
                        kali = 1;
                    } else if (umur == 14) {
                        kali = 1.1;
                    } else if (umur == 15) {
                        kali = 0.87;
                    } else if (umur == 16) {
                        kali = 0.885;
                    } else if (umur == 17) {
                        kali = 0.9;
                    } else if (umur == 18) {
                        kali = 0.915;
                    } else if (umur == 19) {
                        kali = 0.93;
                    } else if (umur == 20) {
                        kali = 0.8;
                    } else if (umur == 21) {
                        kali = 0.815;
                    } else if (umur == 22) {
                        kali = 0.83;
                    } else if (umur == 23) {
                        kali = 0.845;
                    } else if (umur == 24) {
                        kali = 0.86;
                    } else if (umur == 25) {
                        kali = 0.77;
                    } else if (umur == 26) {
                        kali = 0.785;
                    } else if (umur == 27) {
                        kali = 0.8;
                    } else if (umur == 28) {
                        kali = 0.815;
                    } else if (umur == 29) {
                        kali = 0.83;
                    } else if (umur == 30) {
                        kali = 0.74;
                    } else if (umur == 31) {
                        kali = 0.755;
                    } else if (umur == 32) {
                        kali = 0.77;
                    } else if (umur == 33) {
                        kali = 0.785;
                    } else if (umur == 34) {
                        kali = 0.8;
                    } else if (umur == 35) {
                        kali = 0.715;
                    } else if (umur == 36) {
                        kali = 0.73;
                    } else if (umur == 37) {
                        kali = 0.745;
                    } else if (umur == 38) {
                        kali = 0.76;
                    } else if (umur == 39) {
                        kali = 0.775;
                    } else if (umur == 40) {
                        kali = 0.69;
                    } else if (umur == 41) {
                        kali = 0.705;
                    } else if (umur == 42) {
                        kali = 0.72;
                    } else if (umur == 43) {
                        kali = 0.735;
                    } else if (umur == 44) {
                        kali = 0.75;
                    } else if (umur == 45) {
                        kali = 0.62;
                    } else if (umur == 46) {
                        kali = 0.635;
                    } else if (umur == 47) {
                        kali = 0.65;
                    } else if (umur == 48) {
                        kali = 0.665;
                    } else if (umur == 49) {
                        kali = 0.68;
                    } else if (umur == 50) {
                        kali = 0.515;
                    } else if (umur == 51) {
                        kali = 0.53;
                    } else if (umur == 52) {
                        kali = 0.545;
                    } else if (umur == 53) {
                        kali = 0.56;
                    } else if (umur == 54) {
                        kali = 0.575;
                    } else if (umur == 55) {
                        kali = 0.45;
                    } else if (umur == 56) {
                        kali = 0.465;
                    } else if (umur == 57) {
                        kali = 0.48;
                    } else if (umur == 58) {
                        kali = 0.495;
                    } else if (umur == 59) {
                        kali = 0.51;
                    } else if (umur == 60) {
                        kali = 0.385;
                    } else if (umur == 61) {
                        kali = 0.4;
                    } else if (umur == 62) {
                        kali = 0.415;
                    } else if (umur == 63) {
                        kali = 0.43;
                    } else if (umur == 64) {
                        kali = 0.445;
                    } else if (umur == 65) {
                        kali = 0.4;
                    }
                    tahunan = (long) (tahunan / 7);
                    tahunan1 = (long) (tahunan / 463);

                    long No = 0;
                    long PremiTahunan = 0;
                    long Klaim = 0;
                    long NilaiDijamin = 0;
                    long DeathTerminal = 0;
                    long TotalKlaim = 0;
                    long NilaitidakDijamin = 0;

                    long tahunan2 = 0;
                    for (int i = 0; i < tabel; i++) {
                        No++;

                        //premi tahunan
                        if (i >= 0 && i < masapremi) {
                            PremiTahunan = (int) +d;
                        }
                        if (i >= masapremi) {
                            PremiTahunan = 0;
                        }

                        //klaim meninggal
                        Klaim = (long) c;
                        //nilai tunai yang dijamin
                        for (int j = 0; j < masapremi; j++) {
                            tahunan2 = tahunan2 + tahunan;
                        }
                        NilaiDijamin = tahunan2;
                        if (i != 0) {
                            NilaiDijamin = (long) (NilaiDijamin * kali);
                        }
                        //death terminal bonus
                        if (i >= 0 && i <= 9) {
                            DeathTerminal = 0;

                        }
                        if (i >= 10 && i <= 15) {
                            DeathTerminal = (int) (c * 25 / 100);
                        }
                        if (i >= 16 && i <= 20) {
                            DeathTerminal = (int) (c * 50 / 100);
                        }
                        if (i >= 21 && i <= 25) {
                            DeathTerminal = (int) (c * 75 / 100);
                        }
                        if (i >= 26) {
                            DeathTerminal = (int) (c / 1);
                        }
                        //total klaim meninggal dunia
                        if (i >= 0 && i <= 9) {
                            TotalKlaim = (int) (0 + c);
                        }
                        if (i >= 10 && i <= 15) {
                            TotalKlaim = (int) ((int) (c * 25 / 100) + c);
                        }
                        if (i >= 16 && i <= 20) {
                            TotalKlaim = (int) ((int) (c * 50 / 100) + c);
                        }
                        if (i >= 21 && i <= 25) {
                            TotalKlaim = (int) ((int) (c * 75 / 100) + c);
                        }
                        if (i >= 26) {
                            TotalKlaim = (int) ((int) (c / 1) + c);
                        }
                        int k = 98;
                        int l = 97;

                        //Nilai Tunai yang tidak dijamin
                        for (int j = 0; j < masapremi; j++) {
                            tahunan1 = tahunan1 + tahunan;
                        }
                        NilaitidakDijamin = tahunan1;
                        if (i >= 0 && i <= 9) {
                            NilaitidakDijamin = 0;
                        }
                        if (i == tabel - 2) {
                            NilaiDijamin = (long) (uangp * 0.90);
                        }
                        if (i == tabel - 1) {
                            NilaitidakDijamin = 0;
                            NilaiDijamin = 0;
                        }
                        if (i >= 10 && i < tabel) {
                            NilaitidakDijamin = (long) ((NilaitidakDijamin * kali) /2);
                        }
                        Plan100Model temp = new Plan100Model(No, PremiTahunan, Klaim, NilaiDijamin, DeathTerminal, TotalKlaim, NilaitidakDijamin);
                        Intent intent = new Intent();
                        intent.putExtra("BarangBaru", String.valueOf(temp));
                        setResult(200, intent);

                    }
                }
            });
        }
    };
    int Calculateage(long date){
        Calendar dob = Calendar.getInstance();
        dob.setTimeInMillis(date);

        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        return age;
    }
}