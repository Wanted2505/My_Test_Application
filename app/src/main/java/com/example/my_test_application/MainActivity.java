package com.example.my_test_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText firstDigitInput = findViewById(R.id.input_first_digit);
        EditText secondDigitInput = findViewById(R.id.input_second_digit);

        Button compareButton = findViewById(R.id.btn_compare);

        TextView resultText = findViewById(R.id.text_result);
        Switch deleteSwitch = findViewById(R.id.switch2);

        compareButton.setOnClickListener(v -> {

            String first = firstDigitInput.getText().toString();
            String second = secondDigitInput.getText().toString();

            try {

                Integer intFirst = Integer.valueOf(first);
                Integer intSecond = Integer.valueOf(second);

                Log.v("DigitComparator", "Comparing " + intFirst + " and " + intSecond);

                if (intFirst.equals(intSecond)) {
                    resultText.setText("Числа равны");
                } else {
                    resultText.setText("Числа не равны");
                }
            } catch (NumberFormatException numberFormatException) {
                resultText.setText("Введите два числа");
            }
        });
}}