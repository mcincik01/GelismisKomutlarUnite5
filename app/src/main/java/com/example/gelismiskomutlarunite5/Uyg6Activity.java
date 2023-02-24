package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        EditText editTextKisaKenar = findViewById(R.id.editTextTextPersonName);
        EditText editTextUzunKenar = findViewById(R.id.editTextTextPersonName2);
        Button buttonKareAlani = findViewById(R.id.btnkare);
        Button buttonDikdortgenAlani = findViewById(R.id.btndikdörtgenalan);
        TextView textViewAlan = findViewById(R.id.textView12);

        buttonKareAlani.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Integer kenar;
                Integer alan;
                kenar = Integer.parseInt(editTextKisaKenar.getText().toString());
                Dortgen kare = new Dortgen(kenar);
                alan = kare.alaniBul();
                textViewAlan.setText(alan.toString());
            }
        });
        buttonDikdortgenAlani.setOnClickListener(new View.OnClickListener(){
        public void onClick(View view) {
            Integer kisaKenar;
            Integer uzunKenar;
            Integer alan;
            kisaKenar = Integer.parseInt(editTextKisaKenar.getText().toString());
            uzunKenar = Integer.parseInt(editTextUzunKenar.getText().toString());
            Dortgen dikdortgen = new Dortgen(kisaKenar,uzunKenar);
            alan = dikdortgen.alaniBul();
            textViewAlan.setText(alan.toString());
        }
    });

    }
    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg6Activity.this, MainActivity.class);
        startActivity(uyg);

    }
}
