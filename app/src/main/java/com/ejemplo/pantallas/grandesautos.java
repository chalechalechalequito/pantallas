package com.ejemplo.pantallas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grandesautos extends AppCompatActivity {

    Button weee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grandesautos);

        weee = findViewById(R.id.weyno);

        weee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),miaumiau.class);
                startActivity(intent);
            }
        });
    }
}
