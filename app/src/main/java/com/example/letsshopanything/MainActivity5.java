package com.example.letsshopanything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void wallet(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Wallet - ₹500",Toast.LENGTH_LONG);
        t.show();
    }
    public void bag(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Sling Bag - ₹1499",Toast.LENGTH_LONG);
        t.show();
    }
    public void pendant(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Pendant - ₹2000",Toast.LENGTH_LONG);
        t.show();
    }
    public void clip(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Clip - ₹345",Toast.LENGTH_LONG);
        t.show();
    }
}