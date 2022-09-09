package com.example.powtorka4p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button przycisk;
    String odczytane;
    EditText loginEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przycisk = findViewById(R.id.button);


    }

    public void przepisz(View view) {
        EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        String email = editTextEmail.getText().toString();
        TextView textViewKomunikat = findViewById(R.id.textViewKomunikat);
        textViewKomunikat.setText("Autor 00000000000");
        EditText editTextPassword1 = findViewById(R.id.editTextTextPassword);
        EditText editTextPassword2 = findViewById(R.id.editTextTextPassword2);
        if(!email.contains("@")){
            textViewKomunikat.setText("Nieprawidłowy adres email");
        }
        else{
            String haslo1 = editTextPassword1.getText().toString();
            String haslo2 = editTextPassword2.getText().toString();
            if (!haslo1.equals(haslo2)){
                textViewKomunikat.setText("Hasła się różnią");
            }
            else{
                textViewKomunikat.setText("Witaj "+email);
            }
        }
    }
}