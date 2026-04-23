package com.example.intent_example;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button b1, b2, b3, b4;
    int request_Code = 1;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---Web browser button---

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent i = new
                        Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/"));
                startActivity(i);
            }
        });

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent i = new Intent(Intent.ACTION_PICK);
                i.setType("image/*");
                startActivityForResult(i, request_Code);
            }
        });
        //---Show Map button---
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent i = new
                        Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:37.827500,-122.481670"));
                startActivity(i);
            }
        });


        //---Choose Contact button---
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent i = new
                        Intent(android.content.Intent.ACTION_PICK);
                i.setType(ContactsContract.Contacts.CONTENT_TYPE);
                startActivityForResult(i,request_Code);
            }
        });

    }
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == request_Code)
        {
            if (resultCode == RESULT_OK)
            {
                Toast.makeText(this,data.getData().toString(),
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(
                        android.content.Intent.ACTION_VIEW,
                        Uri.parse(data.getData().toString()));
                startActivity(i);
            }       }    }}