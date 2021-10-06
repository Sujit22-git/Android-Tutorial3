package com.example.tutorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,pass;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.edtxtuser);
        pass = findViewById(R.id.edtxtpass);
        save = findViewById(R.id.btnsave);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = user.getText().toString();
                String p = pass.getText().toString();

                if(u.equals("admin") && p.equals("admin123")){
                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    i.putExtra("username",u);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Username And Password Wrong...", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}