package com.example.exprimentno6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    CheckBox checkBox;
    RadioGroup radioGroup;
    ToggleButton toggleButton;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        toggleButton = findViewById(R.id.toggleButton);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editText.getText().toString();

                String check = checkBox.isChecked() ? "Accepted" : "Not Accepted";

                int selectedId = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(selectedId);
                String gender = (radioButton != null) ? radioButton.getText().toString() : "Not Selected";

                String toggle = toggleButton.isChecked() ? "ON" : "OFF";

                String result = "Name: " + name +
                        "\nTerms: " + check +
                        "\nGender: " + gender +
                        "\nToggle: " + toggle;

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });
    }
}