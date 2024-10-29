package com.example.letsshopanything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void kurti(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Kurti - ₹249",Toast.LENGTH_LONG);
        t.show();
    }
    public void formals(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Formals - ₹360",Toast.LENGTH_LONG);
        t.show();
    }
    public void gown(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Gown - ₹150",Toast.LENGTH_LONG);
        t.show();
    }
    public void saree(View view){
        Toast t =Toast.makeText(getApplicationContext(),"Saree - ₹490",Toast.LENGTH_LONG);
        t.show();
    }
}