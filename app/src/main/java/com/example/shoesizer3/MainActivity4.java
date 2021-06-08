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

public class MainActivity4 extends AppCompatActivity {
    Button vaihdanakyma4;
    int selectedBrand;
    int selectedGender;
    int selectedSize;
    int wantedBrand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            selectedBrand = extras.getInt("SelectedBrand");
            selectedGender = extras.getInt("SelectedGender");
            selectedSize = extras.getInt("SelectedSize");
        }

        String[] brands = new String[]{
                "Nike", "Adidas"
        };



        Spinner s4 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, brands);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s4.setAdapter(adapter);

        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    wantedBrand = 1;
                }
                if(position==1){
                    wantedBrand = 2;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        vaihdanakyma4 = findViewById(R.id.button4);
        vaihdanakyma4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivities4();
            }
        });
    }
    private void switchActivities4(){
        Intent switchActivityIntent4 = new Intent(this, MainActivity5.class);
        switchActivityIntent4.putExtra("SelectedBrand", selectedBrand);
        switchActivityIntent4.putExtra("SelectedGender", selectedGender);
        switchActivityIntent4.putExtra("SelectedSize", selectedSize);
        switchActivityIntent4.putExtra("WantedBrand", wantedBrand);
        startActivity(switchActivityIntent4);
    }
}