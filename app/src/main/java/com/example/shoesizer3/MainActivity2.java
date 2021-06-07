package com.example.shoesizer3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
    Button vaihdanakyma2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String[] gender = new String[]{
                "Men", "Women"
        };

        Spinner s2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, gender);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);

        vaihdanakyma2 = findViewById(R.id.button2);
        vaihdanakyma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivities2();
            }
        });
    }

    private void switchActivities2(){
        Intent switchActivityIntent2 = new Intent(this, MainActivity3.class);
        startActivity(switchActivityIntent2);
    }
}