package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText celsiusInput, fahrenheitInput, kelvinInput;
    Button convertButton;
    TextView fahrenheitResult, celsiusResult, kelvinResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsiusInput = findViewById(R.id.celsiusInput);
        fahrenheitInput = findViewById(R.id.fahrenheitInput);
        kelvinInput = findViewById(R.id.kelvinInput);
        convertButton = findViewById(R.id.convertButton);
        fahrenheitResult = findViewById(R.id.fahrenheitResult);
        celsiusResult = findViewById(R.id.celsiusResult);
        kelvinResult = findViewById(R.id.kelvinResult);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!celsiusInput.getText().toString().isEmpty()) {
                    double celsius = Double.parseDouble(celsiusInput.getText().toString());
                    double fahrenheit = (celsius * 9/5) + 32;
                    double kelvin = celsius + 273.15;

                    fahrenheitResult.setText("Fahrenheit: " + fahrenheit);
                    celsiusResult.setText("Celsius: " + celsius);
                    kelvinResult.setText("Kelvin: " + kelvin);
                } else if (!fahrenheitInput.getText().toString().isEmpty()) {
                    double fahrenheit = Double.parseDouble(fahrenheitInput.getText().toString());
                    double celsius = (fahrenheit - 32) * 5/9;
                    double kelvin = (fahrenheit + 459.67) * 5/9;

                    fahrenheitResult.setText("Fahrenheit: " + fahrenheit);
                    celsiusResult.setText("Celsius: " + celsius);
                    kelvinResult.setText("Kelvin: " + kelvin);
                } else if (!kelvinInput.getText().toString().isEmpty()) {
                    double kelvin = Double.parseDouble(kelvinInput.getText().toString());
                    double celsius = kelvin - 273.15;
                    double fahrenheit = (kelvin * 9/5) - 459.67;

                    fahrenheitResult.setText("Fahrenheit: " + fahrenheit);
                    celsiusResult.setText("Celsius: " + celsius);
                    kelvinResult.setText("Kelvin: " + kelvin);
                }
            }
        });
    }
}
