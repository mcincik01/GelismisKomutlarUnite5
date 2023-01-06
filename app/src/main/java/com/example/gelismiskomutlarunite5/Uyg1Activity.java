package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg1Activity.this, MainActivity.class);
        startActivity(uyg);
    }

    public void btnSelamVer1(View view) {
        selamVer();
    }

    public void btnSelamVer2(View view) {
        selamVer();
    }

    private void selamVer() {
        Toast.makeText(this, "Merhaba!", Toast.LENGTH_SHORT).show();
    }
}
