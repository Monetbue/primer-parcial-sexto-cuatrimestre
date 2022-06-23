package com.example.primer_parcial_spinner_planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = (Spinner) findViewById(R.id.spinner1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Sistema solar")){
                    return; //nothing

                }else
                {
                    String item =parent.getItemAtPosition(position).toString();

                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_LONG).show();

                    if (parent.getItemAtPosition(position).equals("Mercurio")){

                        Intent intent = new Intent ( MainActivity.this, mercurioActivity.class);
                        startActivity(intent);

                    }
                    if (parent.getItemAtPosition(position).equals("Venus")){

                        Intent intent = new Intent ( MainActivity.this, venusActivity.class);
                        startActivity(intent);

                    }
                    if (parent.getItemAtPosition(position).equals("Tierra")){

                        Intent intent = new Intent ( MainActivity.this, tierraActivity.class);
                        startActivity(intent);

                    }
                    if (parent.getItemAtPosition(position).equals("Marte")){

                        Intent intent = new Intent ( MainActivity.this, marteActivity.class);
                        startActivity(intent);

                    }
                    if (parent.getItemAtPosition(position).equals("Jupiter")){

                        Intent intent = new Intent ( MainActivity.this, jupiterActivity.class);
                        startActivity(intent);

                    }
                    if (parent.getItemAtPosition(position).equals("Saturno")){

                        Intent intent = new Intent ( MainActivity.this, saturnoActivity.class);
                        startActivity(intent);

                    }
                    if (parent.getItemAtPosition(position).equals("Urano")){

                        Intent intent = new Intent ( MainActivity.this, uranoActivity.class);
                        startActivity(intent);

                    }
                    if (parent.getItemAtPosition(position).equals("Neptuno")){

                        Intent intent = new Intent ( MainActivity.this, neptunoActivity.class);
                        startActivity(intent);

                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}