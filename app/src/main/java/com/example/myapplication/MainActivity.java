package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Button  confirmer = (Button) findViewById(R.id.envoyer);
        return confirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText prenom = findViewById(R.id.prenom);
                EditText nom = findViewById(R.id.nom);
                EditText naissance = findViewById(R.id.naissance);
                RadioGroup s = findViewById(R.id.radiosexe);
                CheckBox acceptation_conditions = findViewById(R.id.acceptation_conditions);


            }

            EditText email = findViewById(R.id.email);
            EditText pass = findViewById(R.id.pass);
            EditText str_commentaire = findViewById(R.id.commentaire);
            TextView txterroruser = findViewById(R.id.txterroruser);
            String str_email = email.getText().toString();
            String str_pass = pass.getText().toString();
            TextView txterroruserjava = findViewById(R.id.txterroruser);


            public void onClick(View v) {
                String str_nom = "";
                String str_prenom = "";
                String str_email = "";
                String str_pass = "";
                String str_naissance = "";
                String str_commentaire = "";
                String str_date = "";
                String str_acceptation_conditions = "";
                String str_sexe = "";
                Boolean info_valable = Boolean.TRUE;


                boolean info_valable;
                if (str_nom.getBytes().toString().trim().equals("") == false) {
                    str_nom = str_nom.getBytes().toString().trim();
                } else {
                    info_valable = false;
                }

                if (str_prenom.getBytes().toString().trim().equals("") == false) {
                    str_prenom = str_prenom.getBytes().toString().trim();
                } else {
                    info_valable = false;
                }


                if (email.getText().toString().trim().equals("") == false) {
                    str_email = email.getText().toString().trim();
                } else {
                    info_valable = false;
                }
                int selectedId = str_sexe.getCheckedRadioButtonId();
                if (selectedId != -1) {
                    RadioButton radioSexButton;
                    radioSexButton = (RadioButton) findViewById(selectedId);
                    str_sexe = radioSexButton.getText().toString();
                } else {
                    info_valable = false;
                }

                if (str_acceptation_conditions.isChecked()) {
                    str_acceptation_conditions = " ";

                } else {
                    info_valable = false;
                }

                //InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                //imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);




            }

        })
                ;
    }}

