package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ss206Activity extends AppCompatActivity {
    public Asker asker;
    public Tankcı tankci;
    String mesaj = "";

    TextView textViewMesaj;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        asker = new Asker();
        tankci = new Tankcı();
        textViewMesaj = findViewById(R.id.textViewMesaj);
        Button buttonAsker = findViewById(R.id.buttonAsker);
        Button buttonTankci = findViewById(R.id.buttonTankci);

        buttonAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj=asker.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });

        buttonTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             mesaj=tankci.atesEt();
             textViewMesaj.setText(mesaj);
            }
        });

    }

    public void btnBack(View view) {
        Intent uyg = new Intent(ss206Activity.this, MainActivity.class);
        startActivity(uyg);
        mesaj = tankci.atesEt();
        textViewMesaj.setText(mesaj);
    }

}

