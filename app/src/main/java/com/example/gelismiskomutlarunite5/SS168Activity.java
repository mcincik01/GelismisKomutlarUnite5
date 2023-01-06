package com.example.gelismiskomutlarunite5;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SS168Activity extends AppCompatActivity {
    EditText textNumber1, textNumber2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss168_activity);

        textNumber1 = findViewById(R.id.textNumber1);
        textNumber2 = findViewById(R.id.textNumber2);
    }

    public void btnPlus(View view) {
        int result = calculate(Integer.parseInt(textNumber1.getText().toString()), Integer.parseInt(textNumber2.getText().toString()), "+");
        Toast.makeText(this, "Toplam: " + result, Toast.LENGTH_SHORT).show();
    }

    public void btnMinus(View view) {
        int result = calculate(Integer.parseInt(textNumber1.getText().toString()), Integer.parseInt(textNumber2.getText().toString()), "-");
        Toast.makeText(this, "Çıkarma: " + result, Toast.LENGTH_SHORT).show();
    }

    public void btnTimes(View view) {
        int result = calculate(Integer.parseInt(textNumber1.getText().toString()), Integer.parseInt(textNumber2.getText().toString()), "*");
        Toast.makeText(this, "Çarpma: " + result, Toast.LENGTH_SHORT).show();
    }

    public void btnDivide(View view) {
        int result = calculate(Integer.parseInt(textNumber1.getText().toString()), Integer.parseInt(textNumber2.getText().toString()), "/");
        Toast.makeText(this, "Bölme: " + result, Toast.LENGTH_SHORT).show();
    }

    public int calculate(int number1, int number2, String option) {
        int number = 0;
        if(option == "+") number = number1 + number2;
        else if(option == "-") number = number1 - number2;
        else if(option == "*") number = number1 * number2;
        else if(option == "/") number = number1 / number2;
        return number;
    }
}
