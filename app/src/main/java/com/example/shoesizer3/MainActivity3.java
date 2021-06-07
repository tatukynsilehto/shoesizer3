package com.example.shoesizer3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity3 extends AppCompatActivity {
    Button vaihdanakyma3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String[] size = new String[]{
                "US", "UK", "EU", "CM"
        };

        String[] size2 = new String[]{

        };

        Spinner s3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, size);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(adapter3);

        vaihdanakyma3 = findViewById(R.id.button3);
        vaihdanakyma3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivities3();
            }
        });
    }

    private void switchActivities3(){
        Intent switchActivityIntent3 = new Intent(this, MainActivity4.class);
        startActivity(switchActivityIntent3);
    }
}