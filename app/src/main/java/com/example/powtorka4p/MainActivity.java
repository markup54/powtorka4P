package com.example.powtorka4p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
        loginEditText = findViewById(R.id.editText);
        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                odczytane = loginEditText.getText().toString();
                Log.i("TEXT",odczytane);
                Toast.makeText(MainActivity.this,odczytane,Toast.LENGTH_SHORT).show();
            }
        });
    }
}