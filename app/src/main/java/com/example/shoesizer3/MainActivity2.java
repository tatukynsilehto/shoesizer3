package com.example.shoesizer3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button vaihdanakyma2;
    int selectedBrand;
    int selectedGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            selectedBrand = extras.getInt("SelectedBrand");
        }

        String[] gender = new String[]{
                "Men", "Women"
        };

        Spinner s2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, gender);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    selectedGender = 1;
                }
                if(position==1){
                    selectedGender = 2;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

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
        switchActivityIntent2.putExtra("SelectedBrand", selectedBrand);
        switchActivityIntent2.putExtra("SelectedGender", selectedGender);
        startActivity(switchActivityIntent2);
    }
}