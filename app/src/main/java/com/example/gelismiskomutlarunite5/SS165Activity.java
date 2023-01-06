package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS165Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss165_activity);
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(SS165Activity.this, MainActivity.class);
        startActivity(uyg);
    }

    public void btnSuccess(View view) {
        int topla = 15 + 15;
        Toast.makeText(this, "Topla: " + topla, Toast.LENGTH_SHORT).show();
    }
}
