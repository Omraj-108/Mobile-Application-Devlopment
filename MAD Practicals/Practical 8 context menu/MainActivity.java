package com.example.contextmenuexample;


import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        registerForContextMenu(imageView);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v.getId() == R.id.imageView) {
            menu.setHeaderTitle("Image Options");
            getMenuInflater().inflate(R.menu.context_menu, menu);
        }
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.open) {
            Toast.makeText(this, "Open clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.save) {
            Toast.makeText(this, "Save clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.delete) {
            Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}