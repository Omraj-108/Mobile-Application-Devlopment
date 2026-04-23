package com.example.popmenuex;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView productImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productImage = findViewById(R.id.productImage);

        productImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(MainActivity.this, productImage);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(item -> {

                    if (item.getItemId() == R.id.add_to_cart) {
                        Toast.makeText(MainActivity.this, "Added to Cart", Toast.LENGTH_SHORT).show();
                        return true;

                    } else if (item.getItemId() == R.id.wishlist) {
                        Toast.makeText(MainActivity.this, "Added to Wishlist", Toast.LENGTH_SHORT).show();
                        return true;

                    } else if (item.getItemId() == R.id.order) {
                        Toast.makeText(MainActivity.this, "Order Placed", Toast.LENGTH_SHORT).show();
                        return true;
                    }

                    return false;
                });

                popupMenu.show();
            }
        });
    }
}