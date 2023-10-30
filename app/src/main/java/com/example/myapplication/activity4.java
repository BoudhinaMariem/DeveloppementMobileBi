package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity4);
        Button btnconnect1 = (Button) findViewById(R.id.btnconnect1);
         return btnconnect1.setOnClickListener(new View.OnClickListener())
        Button btnconnect= (Button) findViewById(R.id.btnconnect);
         return btnconnect.setOnClickListener(new View.OnClickListener()){
             @Override
             public void onClick(View view) {
                 EditText txtemail = findViewById(R.id.txtemail);
                 EditText txtpwd = findViewById(R.id.txtpwd);
                 String txtemail= txtemail.getText().toString();
                 String txtpwd = txtpwd.getText().toString();
                 TextView txterrorpwdjava =findViewById(R.id.txterrorpwd);
                 TextView txtmsgjava =findViewById(R.id.txtmsg);
                 txtmsgjava.setText(txtemail +" "+ txtpwd);

                 TextView txtemailjava=findViewById(R.id.txtemail);
                 TextView txtepwdjava =findViewById(R.id.txtpwd);

                 Boolean valid= Boolean.TRUE;
                 if(txtemail.matches("")){
                     txtemailjava.setText("Ce champ est requis!");
                     valid= Boolean.FALSE;
                 }else{
                     txtemailjava.setText("");

                 }

                 if(txtpwd.matches("")){
                     txterrorpwdjava.setText("Ce champ est requis!");
                     valid= Boolean.FALSE;
                 }else{
                     txtepwdjava.setVisibility(View.INVISIBLE);

                 }
                 if(valid){
                     Intent activity4 = new Intent(MainActivity.this, activity4.class);
                     activity4.putExtra("email", txtemail);
                     startActivity(activity4);
                 }


            }
        });




    }
}