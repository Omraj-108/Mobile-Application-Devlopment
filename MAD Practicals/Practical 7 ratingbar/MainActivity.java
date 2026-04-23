package com.example.ratingbarexample;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button btnSubmit;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResult = findViewById(R.id.tvResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float rating = ratingBar.getRating();

                tvResult.setText("Your Rating: " + rating);

                if (rating >= 4) {
                    tvResult.append("\nThank you! 😊");
                } else if (rating >= 2) {
                    tvResult.append("\nWe will improve!");
                } else {
                    tvResult.append("\nSorry for inconvenience!");
                }
            }
        });
    }
}