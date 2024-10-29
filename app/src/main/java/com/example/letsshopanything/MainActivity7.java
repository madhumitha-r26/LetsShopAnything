package com.example.letsshopanything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public  void echo(View view){
        Toast t= Toast.makeText(getApplicationContext(),"Echo - ₹3999",Toast.LENGTH_LONG);
        t.show();
    }
    public  void bluetooth_headphone(View view){
        Toast t= Toast.makeText(getApplicationContext(),"Bluetooth Headphones - ₹899",Toast.LENGTH_LONG);
        t.show();
    }
    public  void phone(View view){
        Toast t= Toast.makeText(getApplicationContext(),"Phone - ₹15000",Toast.LENGTH_LONG);
        t.show();
    }
    public  void laptop(View view){
        Toast t= Toast.makeText(getApplicationContext(),"Laptop - ₹55499",Toast.LENGTH_LONG);
        t.show();
    }
}