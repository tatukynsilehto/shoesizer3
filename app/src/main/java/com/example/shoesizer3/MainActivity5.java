package com.example.shoesizer3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button vaihdanakyma5;
    int selectedBrand;
    int selectedGender;
    int selectedSize;
    int wantedBrand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            selectedBrand = extras.getInt("SelectedBrand");
            selectedGender = extras.getInt("SelectedGender");
            selectedSize = extras.getInt("SelectedSize");
            wantedBrand = extras.getInt("WantedBrand");

            vaihdanakyma5 = findViewById(R.id.button5);
            vaihdanakyma5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switchActivities5();
                }
            });
        }
    }
    private void switchActivities5(){
        Intent switchActivityIntent5 = new Intent(this, MainActivity.class);
        startActivity(switchActivityIntent5);
    }
}