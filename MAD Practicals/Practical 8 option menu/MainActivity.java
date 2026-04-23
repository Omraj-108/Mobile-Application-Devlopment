package com.example.optionmenuexample;



import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect Toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    // Menu create
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // Menu click
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.mobile) {
            Toast.makeText(this, "Mobile Selected", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.laptop) {
            Toast.makeText(this, "Laptop Selected", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.computer) {
            Toast.makeText(this, "Computer Selected", Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}