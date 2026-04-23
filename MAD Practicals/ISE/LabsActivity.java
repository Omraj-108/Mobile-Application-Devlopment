package com.yash.a110t5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class LabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labs);

        Button btnBack = findViewById(R.id.btnBackToHome);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        GridView gridView = findViewById(R.id.gridView);
        List<Lab> labList = new ArrayList<>();
        
        // Manually adding 12 labs with their respective images and names
        labList.add(new Lab("Java Programming Lab", R.drawable.lab1_javaprogramming, 
            "This lab is dedicated to learning core and advanced Java concepts, featuring high-performance systems for development and testing."));
            
        labList.add(new Lab("Advanced System Lab", R.drawable.lab2_advancedsystem,
            "The Advanced System Lab focuses on complex system architectures and high-end computing research."));
            
        labList.add(new Lab("Database Lab", R.drawable.lab3_databaselab, 
            "In this lab, students practice SQL, NoSQL, and database management system design using industry-standard software."));
            
        labList.add(new Lab("R Programming Lab", R.drawable.lab4_rprogramming, 
            "Dedicated to statistical computing and data visualization, the R Programming Lab is essential for data science students."));
            
        labList.add(new Lab("Project Lab", R.drawable.lab5_projectlab, 
            "A creative space for students to collaborate and work on their final year projects and innovative prototypes."));
            
        labList.add(new Lab("Research Lab", R.drawable.lab6_researchlab, 
            "The Research Lab provides access to specialized equipment and journals for advanced academic and industrial research."));
            
        labList.add(new Lab("Web Technology Lab", R.drawable.lab7_webtechlab, 
            "Focused on front-end and back-end web development, covering HTML, CSS, JavaScript, and various modern frameworks."));
            
        labList.add(new Lab("Python Lab", R.drawable.lab8_pythonlab, 
            "A versatile lab for learning Python, used for automation, artificial intelligence, and general-purpose programming."));
            
        labList.add(new Lab("C Programming Lab", R.drawable.lab9_cprogmlab, 
            "The foundational lab for learning procedural programming and understanding low-level computer operations."));
            
        labList.add(new Lab("System Programming Lab", R.drawable.lab10_systemproglab, 
            "Focuses on operating system internals, compiler design, and assembly language programming."));
            
        labList.add(new Lab("Mobile Dev Lab", R.drawable.lab11_mobiledevlab, 
            "Equipped for Android and iOS development, this lab helps students build and test mobile applications."));
            
        labList.add(new Lab("C++ Lab", R.drawable.lab12_cpplab, 
            "Focused on object-oriented programming with C++, exploring memory management and system-level performance."));

        LabAdapter adapter = new LabAdapter(this, labList, new LabAdapter.OnLabImageClickListener() {
            @Override
            public void onImageClick(Lab lab) {
                Intent intent = new Intent(LabsActivity.this, LabDetailActivity.class);
                intent.putExtra("lab_data", lab);
                startActivity(intent);
            }
        });
        
        gridView.setAdapter(adapter);
    }
}