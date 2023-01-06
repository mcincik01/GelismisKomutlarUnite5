package com.example.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {
    EditText textNumber1, textNumber2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg3Activity.this, MainActivity.class);
        startActivity(uyg);
    }

    public void btnSuccess(View view) {
        int result = calculate(Integer.parseInt(textNumber1.getText().toString()), Integer.parseInt(textNumber2.getText().toString()));
        Toast.makeText(this, "Toplam: " + result, Toast.LENGTH_SHORT).show();
    }

    public int calculate(int number1, int number2) {
        return number1 + number2;
    }
}
