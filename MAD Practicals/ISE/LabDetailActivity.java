package com.yash.a110t5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LabDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_detail);

        Button btnBack = findViewById(R.id.btnBackToLabs);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView labImage = findViewById(R.id.detailLabImage);
        TextView labName = findViewById(R.id.detailLabName);
        TextView labDescription = findViewById(R.id.detailLabDescription);

        Lab lab = (Lab) getIntent().getSerializableExtra("lab_data");
        if (lab != null) {
            labImage.setImageResource(lab.getImageResId());
            labName.setText(lab.getName());
            labDescription.setText(lab.getDescription());
        }
    }
}