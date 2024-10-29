package com.example.letsshopanything;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public  void foodpage(View view){
        Intent i= new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(i);
    }
    public  void accessoriespage(View view){
        Intent i= new Intent(MainActivity3.this,MainActivity5.class);
        startActivity(i);
    }
    public  void clothespage(View view){
        Intent i= new Intent(MainActivity3.this,MainActivity6.class);
        startActivity(i);
    }
    public  void gadgetspage(View view){
        Intent i= new Intent(MainActivity3.this,MainActivity7.class);
        startActivity(i);
    }

}