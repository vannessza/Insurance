package com.example.apknewinsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Support extends AppCompatActivity {


    private Button support_button_faq, support_button_email, support_button_whatsapp, support_button_aboutus, support_button_privasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        support_button_email = findViewById(R.id.support_button_email);
        support_button_faq = findViewById(R.id.support_button_faq);
        support_button_whatsapp = findViewById(R.id.support_button_whatsapp);
        support_button_aboutus = findViewById(R.id.support_button_aboutus);
        support_button_privasi = findViewById(R.id.support_button_privasi);

        support_button_faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModalContentFaq modalContentFaq = new ModalContentFaq();
                modalContentFaq.show(getSupportFragmentManager(), "modalMenu");
            }
        });


        support_button_privasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModalContentPrivacy modalContentPrivacy = new ModalContentPrivacy();
                modalContentPrivacy.show(getSupportFragmentManager(),"modalMenu");
            }
        });

        support_button_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModalContentAboutUs modalContentAboutUs = new ModalContentAboutUs();
                modalContentAboutUs.show(getSupportFragmentManager(), "modalMenu");
            }
        });

        support_button_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("mailto:mchandra05@student.ciputra.ac.id"));
                startActivity(intent);
            }
        });

        support_button_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://wa.me/085155318815?text=Halo%20Tim%20Support%20Life%20Saving%20Insurance"));
                startActivity(intent);

//                https://wa.me/085155318815?text=Halo,%20saya%20ingin%20konfirmasi%20pembayaran%20saya%20pada%20aplikasi%20Live%20Saving%20Insurance
            }
        });
    }
}
