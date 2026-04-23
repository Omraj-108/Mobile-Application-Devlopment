package com.example.listviewlayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect ListView
        listView = findViewById(R.id.listView1);

        // Data
        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};

        // Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                fruits
        );

        // Set adapter to ListView
        listView.setAdapter(adapter);
    }
}