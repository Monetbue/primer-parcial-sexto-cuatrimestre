package com.example.primer_parcial_spinner_planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jupiterActivity extends AppCompatActivity {
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jupiter);
        regresar = (Button) findViewById(R.id.regresar);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jupiterActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}