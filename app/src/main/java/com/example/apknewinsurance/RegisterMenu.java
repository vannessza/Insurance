package com.example.apknewinsurance;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

import Account.Akun;
import Account.User;

public class RegisterMenu extends AppCompatActivity {

    private TextInputLayout register_textInputLayout_email, register_textInputLayout_password, register_textInputLayout_namaLengkap,
            register_textInputLayout_tanggalLahir, register_textInputLayout_nomorTelepon;
    private TextView register_textView_registerText;
    private Button register_button_register;
    private CheckBox register_checkBox_agree;
    private ImageView register_imageView_back;
    private Boolean validateEmail, validatePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_menu);

//        ActionBar actionBar  = getSupportActionBar();
//        actionBar.hide();

        register_textInputLayout_email = findViewById(R.id.register_textInputLayout_email);
        register_textInputLayout_password = findViewById(R.id.register_textInputLayout_password);
        register_textInputLayout_namaLengkap = findViewById(R.id.register_textInputLayout_namaLengkap);
        register_textInputLayout_tanggalLahir = findViewById(R.id.register_textInputLayout_tanggalLahir);
        register_textInputLayout_nomorTelepon = findViewById(R.id.register_textInputLayout_nomorTelepon);

        register_textView_registerText = findViewById(R.id.register_textView_registerText);

        register_button_register = findViewById(R.id.register_button_register);

        register_checkBox_agree = findViewById(R.id.register_checkBox_agree);

        register_imageView_back = findViewById(R.id.register_imageView_back);



        register_imageView_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), LoginMenu.class);
                startActivity(intent);
                finish();
            }
        });


        register_button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = register_textInputLayout_namaLengkap.getEditText().getText().toString().trim();
                String email = register_textInputLayout_email.getEditText().getText().toString().trim();
                String password = register_textInputLayout_password.getEditText().getText().toString().trim();
                String tanggalLahir = register_textInputLayout_tanggalLahir.getEditText().getText().toString().trim();
                String nomorTelpon = register_textInputLayout_nomorTelepon.getEditText().getText().toString().trim();


                if (email.isEmpty()) {
                    register_textInputLayout_email.setError("Please enter your email");
                    Toast.makeText(RegisterMenu.this, "Mohon Lengkapi Data Anda!", Toast.LENGTH_SHORT).show();
                } else {
                    register_textInputLayout_email.setError("");
                }

                if (password.isEmpty()) {
                    register_textInputLayout_password.setError("Please enter your password");
                } else {
                    register_textInputLayout_password.setError("");
                }

                if (nama.isEmpty()) {
                    register_textInputLayout_namaLengkap.setError("Please enter your name");
                } else {
                    register_textInputLayout_namaLengkap.setError("");
                }

                if (tanggalLahir.isEmpty()) {
                    register_textInputLayout_tanggalLahir.setError("Please enter your birth date");
                } else {
                    register_textInputLayout_tanggalLahir.setError("");
                }

                if (nomorTelpon.isEmpty()) {
                    register_textInputLayout_nomorTelepon.setError("Please enter your phone number");
                } else {
                    register_textInputLayout_nomorTelepon.setError("");
                }

                if (register_checkBox_agree.isChecked() == false){
                    register_checkBox_agree.setError("Harap setujui terlebih dahulu");
                }

                if (nama.isEmpty() || email.isEmpty() || password.isEmpty() || nomorTelpon.isEmpty() || tanggalLahir.isEmpty()  ){
                    Toast.makeText(RegisterMenu.this, "Mohon Lengkapi Data Anda!", Toast.LENGTH_SHORT).show();
                }

                if (!nama.isEmpty() && !email.isEmpty() && !password.isEmpty() && !nomorTelpon.isEmpty() && !tanggalLahir.isEmpty() && register_checkBox_agree.isChecked()) {
                    Intent intent = new Intent(getBaseContext(), LoginMenu.class);
                    User user = new User(nama, email, password, tanggalLahir, nomorTelpon);
                    Akun.listUser.add(user);

                    Toast.makeText(RegisterMenu.this, "Account Created!", Toast.LENGTH_SHORT).show();

                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();

                }



            }
        });

        register_textInputLayout_email.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String email = register_textInputLayout_email.getEditText().getText().toString().trim();
                Intent intent = new Intent();
                intent.putExtra("IDemail", email);

                Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile("[a-zA-Z0-9+._%-+]{1,256}" + "@"
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" + "(" + "."
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" + ")+");

                if (email.isEmpty()) {
                    register_textInputLayout_email.setError("Please enter your email");
                    validateEmail = false;
                } else {
                    if (!EMAIL_ADDRESS_PATTERN.matcher(email).matches()) {
                        register_textInputLayout_email.setError("Wrong format email");
                        validateEmail = false;
                    } else {
                        register_textInputLayout_email.setError("");
                        validateEmail = true;
                    }
                }
            }


            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        register_textInputLayout_password.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String password = register_textInputLayout_password.getEditText().getText().toString().trim();
                Intent intent = new Intent();
                intent.putExtra("IDpass", password);

                Pattern PASSWORD_PATTERN = Pattern.compile("[a-zA-Z0-9\\!\\@\\#\\$]{0,20}");

                if (password.isEmpty()) {
                    register_textInputLayout_password.setError("Please enter your password");
                    validatePassword = false;
                } else {
                    if (password.length() < 8 || password.length() > 20) {
                        register_textInputLayout_password.setError("Password must be 8 to 20 characters");
                        validatePassword = false;
                    } else if (!PASSWORD_PATTERN.matcher(password).matches()) {
                        register_textInputLayout_password.setError("Must contain a - z, A - Z, !, @, #, $");
                        validatePassword = false;
                    } else {
                        register_textInputLayout_password.setError("");
                        validatePassword = true;
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }


        });

    }
}
