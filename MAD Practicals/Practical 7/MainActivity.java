package com.example.progressbarexample;


import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etMarks;
    Button btnShow;
    ProgressBar progressBar;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMarks = findViewById(R.id.etMarks);
        btnShow = findViewById(R.id.btnShow);
        progressBar = findViewById(R.id.progressBar);
        tvResult = findViewById(R.id.tvResult);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = etMarks.getText().toString();

                if (input.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter marks", Toast.LENGTH_SHORT).show();
                    return;
                }

                int marks = Integer.parseInt(input);

                if (marks < 0 || marks > 100) {
                    Toast.makeText(MainActivity.this, "Enter valid marks (0-100)", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Percentage (out of 100)
                int percentage = marks;

                // Set ProgressBar
                progressBar.setProgress(percentage);

                // Show result
                tvResult.setText("Percentage: " + percentage + "%");
            }
        });
    }
}