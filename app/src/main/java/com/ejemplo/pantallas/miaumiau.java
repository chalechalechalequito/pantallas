package com.ejemplo.pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class miaumiau extends AppCompatActivity {

    Button butface,butgoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miaumiau);

        butface = findViewById(R.id.buttface);
        butgoo = findViewById(R.id.buttgoogle);

        butface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),grandesautos.class);
                startActivity(intent);
            }
        });

        butgoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),grandesautos.class);
                startActivity(intent);
            }
        });
    }
}
