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

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;


public class activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Button  bouton_ok = (Button) findViewById(R.id.bouton_ok);
        return bouton_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextTextPassword = findViewById(R.id.editTextTextPassword);
                EditText editTextTextPassword2 = findViewById(R.id.editTextTextPassword2);
                //String editTextTextPassword= editTextTextPassword.getText().toString();
                //String editTextTextPassword2 = editTextTextPassword.getText().toString();
                TextView textView4 = findViewById(R.id.textView4);
                TextView textView9 = findViewById(R.id.textView9);
                boolean validateInput () {
                    if (editTextTextPassword.getText().toString().equals("")) {
                        editTextTextPassword.setError("Entrer le  Password");
                        return false;
                    }
                    if (editTextTextPassword2.getText().toString().equals("")) {
                        editTextTextPassword2.setError("confirmer le mdp");
                        return false;
                    }
                    if (!editTextTextPassword.getText().toString().equals(editTextTextPassword2.getText().toString())) {
                        editTextTextPassword2.setError("Password does not match");
                        return false;
                    }
                    return true;
                }
            }};}}