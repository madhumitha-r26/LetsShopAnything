package com.example.letsshopanything;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
EditText e1,e2;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = (EditText) findViewById(R.id.editTextTextEmailAddress);
        e2 = (EditText) findViewById(R.id.editTextTextPassword);
        b1 = (Button) findViewById(R.id.button);
    }
        public void movepage(View view){
            String username =e1.getText().toString();
            String password = e2.getText().toString();
            if(username.equals("madhumitha@gmail.com")&& password.equals("Madhu26")){
                Intent i= new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
            else if(username.equals(" ")&& password.equals(" ")){
                Toast.makeText(getApplicationContext(),"Enter the correct Username and Password",Toast.LENGTH_LONG).show();

            }
            else{
                Toast.makeText(getApplicationContext(),"Wrong Username and Password",Toast.LENGTH_LONG).show();
            }
        }
}
