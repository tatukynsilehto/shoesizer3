package com.example.shoesizer3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button vaihdanakyma;
    Button measureAnk;
    Button info;
    int selectedBrand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] brands = new String[]{
                "Nike", "Adidas", "Puma"
        };

        measureAnk = findViewById(R.id.measurebutton);
        measureAnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.infinityshoes.com/size-chart"));
                startActivity(browserIntent);
            }
        });

        info = findViewById(R.id.button6);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setCancelable(true);
                builder.setMessage("All of the size conversions on this app are estimates. For accurate sizing of a shoe you should always try it on.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }); builder.show();
            }
        });

        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, brands);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    selectedBrand = 1;
                }
                if(position==1){
                    selectedBrand = 2;
                }
                if(position==2){
                    selectedBrand = 3;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        vaihdanakyma = findViewById(R.id.button);
        vaihdanakyma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivities();
            }
        });

    }

    private void switchActivities(){
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);
        switchActivityIntent.putExtra("SelectedBrand", selectedBrand);
        startActivity(switchActivityIntent);
    }

}