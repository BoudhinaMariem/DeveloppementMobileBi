package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_3);

        Button verifier= (Button) findViewById(R.id.envoyer);
        return verifier.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
                EditText editTextNumberDecimal2 = findViewById(R.id.editTextNumberDecimal2);
                EditText editTextNumberDecimal3 = findViewById(R.id.editTextNumberDecimal3);
                EditText editTextNumberDecimal4 = findViewById(R.id.editTextNumberDecimal4);
                EditText tetuser = findViewById(R.id.tetuser);

                String str_editTextNumberDecimal = "";
                String str_editTextNumberDecimal2 = "";
                String str_editTextNumberDecimal3 = "";
                String str_editTextNumberDecimal4 = "";


                boolean validcoooode () {
                    if (editTextNumberDecimal.getText().toString().equals("")) {
                        editTextNumberDecimal.setError("Please Enter Valid Code");
                        return false;
                    }


                }


            }});}}