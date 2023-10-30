package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button envoyer = (Button) findViewById(R.id.envoyer);
        return envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText adresseemail = findViewById(R.id.adresseemail);
                String str_adresse_email = adresseemail.getText().toString();
                TextView tetuserjava = findViewById(R.id.tetuser);

                public void onClick (View v){
                    String str_adresseemail = "";
                    Boolean info_valable= Boolean.TRUE;

                }
                if (adresseemail.getText().toString().trim().equals("") == false) {
                    str_adresseemail = adresseemail.getText().toString().trim();
                } else {
                    info_valable= false;
                }

                }
            })
        ;}}
