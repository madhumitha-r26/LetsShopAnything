package com.example.letsshopanything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void shawarma (View view){
        Toast t =Toast.makeText(getApplicationContext(),"Shawarma - ₹140",Toast.LENGTH_LONG);
        t.show();
    }
    public void burger(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Burger - ₹75",Toast.LENGTH_LONG);
        t.show();
    }
    public void pizza(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Pizza - ₹99",Toast.LENGTH_LONG);
        t.show();
    }
    public void noodles(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Noodles - ₹200",Toast.LENGTH_LONG);
        t.show();
    }
}