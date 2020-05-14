package com.pfe.enginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class EnginAuth extends AppCompatActivity {

    TextInputLayout matricule;

    Button identification_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engin_auth);

        matricule = findViewById(R.id.matricule);
        identification_btn = findViewById(R.id.identification_btn);


    }

    private void enginIdentification(){

        identification_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String matricule_text = matricule.getEditText().getText().toString();

                //check if it exists in the database then proceed to the next activity


                //Intent intent = new Intent(EnginAuth.this,)


            }
        });
    }


}
