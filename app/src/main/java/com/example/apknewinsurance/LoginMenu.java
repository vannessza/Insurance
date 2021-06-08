package com.example.apknewinsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.regex.Pattern;

import Account.Akun;
import Account.User;

public class LoginMenu extends AppCompatActivity {

    private TextInputLayout login_textInputLayout_email, login_textInputLayout_password;
    private Button login_button_login;
    private Intent intent;
    private TextView login_textView_signIn, login_textView_daftar, login_textView_butuhBantuan;
    private ArrayList<User> listOrang;
    private Boolean validateEmail, validatePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_menu);

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();

        listOrang = Akun.listUser;
        login_textInputLayout_email = findViewById(R.id.login_textInputLayout_email);
        login_textInputLayout_password = findViewById(R.id.login_textInputLayout_password);
        login_button_login = findViewById(R.id.login_button_login);
        login_textView_daftar = findViewById(R.id.login_textView_daftar);
        login_textView_butuhBantuan = findViewById(R.id.login_textView_butuhBantuan);

        login_button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = login_textInputLayout_email.getEditText().getText().toString().trim();
                String password = login_textInputLayout_password.getEditText().getText().toString().trim();

                boolean exists = false;

                for (int i=0; i<listOrang.size(); i++) {
                    User temp = listOrang.get(i);

                    if(Akun.listUser.get(i).getEmail().equalsIgnoreCase(email) && Akun.listUser.get(i).getPassword().equalsIgnoreCase(password)){
                        exists = true;
                        Toast.makeText(getBaseContext(), "Login Berhasil!", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getBaseContext(), MainActivity.class);
                        intent.putExtra("IDnama", temp);
                        intent.putExtra("index", i);
                        startActivity(intent);
                        finish();

                        break;
                    } else {
                        Toast.makeText(getBaseContext(), "Login Gagal! Cek Email atau Password", Toast.LENGTH_LONG).show();

                    }

                } if (exists == false) {
                    Toast.makeText(getBaseContext(),"Akun tidak ada!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        login_textInputLayout_email.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String email = login_textInputLayout_email.getEditText().getText().toString().trim();

                Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile("[a-zA-Z0-9+._%-+]{1,256}" + "@"
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" + "(" + "."
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" + ")+");

                if(email.isEmpty()){
                    login_textInputLayout_email.setError("Please enter your email");
                    validateEmail = false;
                }else{
                    if (!EMAIL_ADDRESS_PATTERN.matcher(email).matches()){
                        login_textInputLayout_email.setError("Wrong format email");
                        validateEmail = false;
                    }else{
                        login_textInputLayout_email.setError("");
                        validateEmail = true;
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        login_textInputLayout_password.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String password = login_textInputLayout_password.getEditText().getText().toString().trim();

                Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9\\!\\@\\#\\$]{0,20}");

                if (password.isEmpty()){
                    login_textInputLayout_password.setError("Please enter your password");
                    validatePassword = false;
                }else{

                    login_textInputLayout_password.setError("");
                    validatePassword = true;

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        login_textView_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), RegisterMenu.class);
                startActivity(intent);
                finish();
            }
        });


        login_textView_butuhBantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext(), Support.class);
                startActivity(intent);
            }
        });
    }
}
