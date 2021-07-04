package com.example.shoesizer3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
        }

        TextView t = (TextView) findViewById(R.id.textView5);
        //TO NIKE
        //Nike mens
        if(selectedBrand==1 && selectedGender==1 && selectedSize==1 && wantedBrand==1){
                t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 5.5 \n EU: 38.5 \n CM: 24");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==2 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 6 \n EU: 39 \n CM: 24.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==3 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 6 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==4 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 6.5 \n EU: 40.5 \n CM: 25.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==5 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 7 \n EU: 41 \n CM: 26");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==6 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 7.5 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==7 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 8 \n EU: 42.5 \n CM: 27");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==8 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 8.5 \n EU: 43 \n CM: 27.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==9 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 9 \n EU: 44 \n CM: 28");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==10 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 9.5 \n EU: 44.5 \n CM: 28.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==11 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 10 \n EU: 45 \n CM: 29");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==12 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 10.5 \n EU: 45.5 \n CM: 29.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==13 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 11 \n EU: 46 \n CM: 30");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==14 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 13 \n UK: 12 \n EU: 47.5 \n CM: 31");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==15 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 14 \n UK: 13 \n EU: 48.5 \n CM: 32");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==16 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 15 \n UK: 14 \n EU: 49.5 \n CM: 33");
        }
        //Nike Womens
        if(selectedBrand==1 && selectedGender==2 && selectedSize==17 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5 \n UK: 2.5 \n EU: 35.5 \n CM: 22");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==18 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5.5 \n UK: 3 \n EU: 36 \n CM: 22.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==19 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 3.5 \n EU: 36.5 \n CM: 23");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==20 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 4 \n EU: 37.5 \n CM: 23.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==21 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 4.5 \n EU: 38 \n CM: 24");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==22 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 5 \n EU: 38.5 \n CM: 24.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==23 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 5.5 \n EU: 39 \n CM: 25");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==24 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 6 \n EU: 40 \n CM: 25.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==25 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 6.5 \n EU: 40.5 \n CM: 26");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==26 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 7 \n EU: 41 \n CM: 26.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==27 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 7.5 \n EU: 42 \n CM: 27");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==28 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 8 \n EU: 42.5 \n CM: 27.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==29 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 8.5 \n EU: 43 \n CM: 28");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==30 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 9 \n EU: 44 \n CM: 28.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==31 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 10.5 \n EU: 44.5 \n CM: 29");
        }
        //Adidas Men
        if(selectedBrand==2 && selectedGender==1 && selectedSize==33 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 5.5 \n EU: 38.5 \n CM: 24");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==34 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 6 \n EU: 39 \n CM: 24.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==35 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 6 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==36 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 6.5 \n EU: 40.5 \n CM: 25.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==37 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 7 \n EU: 41 \n CM: 26");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==38&& wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 7.5 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==39 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 8 \n EU: 42.5 \n CM: 27");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==40 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 8.5 \n EU: 43 \n CM: 27.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==41 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 9 \n EU: 44 \n CM: 28");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==42 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 9.5 \n EU: 44.5 \n CM: 28.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==43 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 10 \n EU: 45 \n CM: 29");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==44 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 10.5 \n EU: 45.5 \n CM: 29.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==45 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 11 \n EU: 46 \n CM: 30");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==46 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 13 \n UK: 12 \n EU: 47.5 \n CM: 31");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==47 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 14 \n UK: 13 \n EU: 48.5 \n CM: 32");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==48 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 15 \n UK: 14 \n EU: 49.5 \n CM: 33");
        }
        //adidas womens
        if(selectedBrand==2 && selectedGender==2 && selectedSize==49 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5 \n UK: 2.5 \n EU: 35.5 \n CM: 22");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==50 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5.5 \n UK: 3 \n EU: 36 \n CM: 22.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==51 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 3.5 \n EU: 36.5 \n CM: 23");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==52 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 4 \n EU: 37.5 \n CM: 23.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==53 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 4.5 \n EU: 38 \n CM: 24");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==54 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 5 \n EU: 38.5 \n CM: 24.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==55 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 5.5 \n EU: 39 \n CM: 25");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==56 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 6 \n EU: 40 \n CM: 25.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==57 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 6.5 \n EU: 40.5 \n CM: 26");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==58 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 7 \n EU: 41 \n CM: 26.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==59 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 7.5 \n EU: 42 \n CM: 27");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==60 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 8 \n EU: 42.5 \n CM: 27.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==61 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 8.5 \n EU: 43 \n CM: 28");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==62 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 9 \n EU: 44 \n CM: 28.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==63 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 10.5 \n EU: 44.5 \n CM: 29");
        }
        //Puma Men
        if(selectedBrand==3 && selectedGender==1 && selectedSize==33 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 5.5 \n EU: 38.5 \n CM: 24");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==34 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 6 \n EU: 39 \n CM: 24.5");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==35 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 6 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==36 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 6.5 \n EU: 40.5 \n CM: 25.5");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==37 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 7 \n EU: 41 \n CM: 26");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==38&& wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 7.5 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==39 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 8 \n EU: 42.5 \n CM: 27");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==40 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 8.5 \n EU: 43 \n CM: 27.5");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==41 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 9 \n EU: 44 \n CM: 28");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==42 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 9.5 \n EU: 44.5 \n CM: 28.5");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==43 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 10 \n EU: 45 \n CM: 29");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==44 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 10.5 \n EU: 45.5 \n CM: 29.5");
        }
        if(selectedBrand==3 & selectedGender==1 && selectedSize==45 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 11 \n EU: 46 \n CM: 30");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==46 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 13 \n UK: 12 \n EU: 47.5 \n CM: 31");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==47 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 14 \n UK: 13 \n EU: 48.5 \n CM: 32");
        }
        if(selectedBrand==3 && selectedGender==1 && selectedSize==48 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 15 \n UK: 14 \n EU: 49.5 \n CM: 33");
        }
        //Puma womens
        if(selectedBrand==3 && selectedGender==2 && selectedSize==49 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5 \n UK: 2.5 \n EU: 35.5 \n CM: 22");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==50 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5.5 \n UK: 3 \n EU: 36 \n CM: 22.5");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==51 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 3.5 \n EU: 36.5 \n CM: 23");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==52 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 4 \n EU: 37.5 \n CM: 23.5");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==53 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 4.5 \n EU: 38 \n CM: 24");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==54 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 5 \n EU: 38.5 \n CM: 24.5");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==55 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 5.5 \n EU: 39 \n CM: 25");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==56 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 6 \n EU: 40 \n CM: 25.5");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==57 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 6.5 \n EU: 40.5 \n CM: 26");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==58 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 7 \n EU: 41 \n CM: 26.5");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==59 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 7.5 \n EU: 42 \n CM: 27");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==60 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 8 \n EU: 42.5 \n CM: 27.5");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==61 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 8.5 \n EU: 43 \n CM: 28");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==62 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 9 \n EU: 44 \n CM: 28.5");
        }
        if(selectedBrand==3 && selectedGender==2 && selectedSize==63 && wantedBrand==1){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 10.5 \n EU: 44.5 \n CM: 29");
        }





        //TO Adidas



        //Nike men
        if(selectedBrand==1 && selectedGender==1 && selectedSize==1 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 5.5 \n EU: 38 2/3 \n CM: 24");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==2 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 6 \n EU: 39 1/3 \n CM: 24.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==3 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 6.5 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==4 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 7 \n EU: 40 2/3 \n CM: 25.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==5 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 7.5 \n EU: 41 1/3 \n CM: 26");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==6 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 8 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==7 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 8.5 \n EU: 42 2/3 \n CM: 27");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==8 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 9 \n EU: 43 1/3 \n CM: 27.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==9 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 9.5 \n EU: 44 \n CM: 28");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==10 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 10 \n EU: 44 2/3 \n CM: 28.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==11 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 10.5 \n EU: 45 1/3 \n CM: 29");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==12 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 11 \n EU: 46 \n CM: 29.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==13 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 11.5 \n EU: 46 1/3 \n CM: 30");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==14 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 13 \n UK: 12.5 \n EU: 48 \n CM: 31");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==15 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 14 \n UK: 13.5 \n EU: 49 1/3 \n CM: 32");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==16 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 15 \n UK: 14.5 \n EU: 50 2/3 \n CM: 33");
        }
        //Nike Womens
        if(selectedBrand==1 && selectedGender==2 && selectedSize==17 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 4 \n UK: 2.5 \n EU: 35 \n CM: 21");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==18 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 4.5 \n UK: 3 \n EU: 35.5 \n CM: 21.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==19 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5 \n UK: 3.5 \n EU: 36 \n CM: 22");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==20 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5.5 \n UK: 4 \n EU: 36 2/3 \n CM: 22.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==21 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 4.5 \n EU: 37 1/3 \n CM: 23");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==22 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 5 \n EU: 38 \n CM: 23.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==23 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 5.5 \n EU: 3 2/3 \n CM: 24");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==24 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 6 \n EU: 39 1/3 \n CM: 24.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==25 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 6.5 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==26 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 7 \n EU: 40 2/3 \n CM: 25.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==27 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 7.5 \n EU: 41 1/3 \n CM: 26");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==28 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 8 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==29 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 8.5 \n EU: 42 2/3 \n CM: 27");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==30 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 9 \n EU: 43 1/3 \n CM: 27.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==31 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 9.5 \n EU: 44 \n CM: 28");
        }
        //Adidas Men
        if(selectedBrand==2 && selectedGender==1 && selectedSize==33 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 5.5 \n EU: 38 2/3 \n CM: 24");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==34 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 6 \n EU: 39 1/3 \n CM: 24.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==35 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 6.5 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==36 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 7 \n EU: 40 2/3 \n CM: 25.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==37 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 7.5 \n EU: 41 1/3 \n CM: 26");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==38 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 8 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==39 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 8.5 \n EU: 42 2/3 \n CM: 27");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==40 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 9 \n EU: 43 1/3 \n CM: 27.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==41 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 9.5 \n EU: 44 \n CM: 28");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==42 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 10 \n EU: 44 2/3 \n CM: 28.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==43 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 10.5 \n EU: 45 1/3 \n CM: 29");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==44 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 11 \n EU: 46 \n CM: 29.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==45 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 11.5 \n EU: 46 1/3 \n CM: 30");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==46 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 13 \n UK: 12.5 \n EU: 48 \n CM: 31");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==47 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 14 \n UK: 13.5 \n EU: 49 1/3 \n CM: 32");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==48 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 15 \n UK: 14.5 \n EU: 50 2/3 \n CM: 33");
        }
        //adidas Womens
        if(selectedBrand==2 && selectedGender==2 && selectedSize==49 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 4 \n UK: 2.5 \n EU: 35 \n CM: 21");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==50 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 4.5 \n UK: 3 \n EU: 35.5 \n CM: 21.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==51 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5 \n UK: 3.5 \n EU: 36 \n CM: 22");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==52 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5.5 \n UK: 4 \n EU: 36 2/3 \n CM: 22.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==53 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 4.5 \n EU: 37 1/3 \n CM: 23");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==54 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 5 \n EU: 38 \n CM: 23.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==55 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 5.5 \n EU: 3 2/3 \n CM: 24");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==56 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 6 \n EU: 39 1/3 \n CM: 24.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==57 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 6.5 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==58 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 7 \n EU: 40 2/3 \n CM: 25.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==59 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 7.5 \n EU: 41 1/3 \n CM: 26");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==60 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 8 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==61 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 8.5 \n EU: 42 2/3 \n CM: 27");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==62 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 9 \n EU: 43 1/3 \n CM: 27.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==63 && wantedBrand==2){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 9.5 \n EU: 44 \n CM: 28");
        }




        //TO Puma



        //Nike men
        if(selectedBrand==1 && selectedGender==1 && selectedSize==1 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 5.5 \n EU: 38 2/3 \n CM: 24");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==2 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 6 \n EU: 39 1/3 \n CM: 24.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==3 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 6.5 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==4 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 7 \n EU: 40 2/3 \n CM: 25.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==5 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 7.5 \n EU: 41 1/3 \n CM: 26");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==6 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 8 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==7 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 8.5 \n EU: 42 2/3 \n CM: 27");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==8 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 9 \n EU: 43 1/3 \n CM: 27.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==9 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 9.5 \n EU: 44 \n CM: 28");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==10 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 10 \n EU: 44 2/3 \n CM: 28.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==11 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 10.5 \n EU: 45 1/3 \n CM: 29");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==12 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 11 \n EU: 46 \n CM: 29.5");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==13 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 11.5 \n EU: 46 1/3 \n CM: 30");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==14 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 13 \n UK: 12.5 \n EU: 48 \n CM: 31");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==15 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 14 \n UK: 13.5 \n EU: 49 1/3 \n CM: 32");
        }
        if(selectedBrand==1 && selectedGender==1 && selectedSize==16 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 15 \n UK: 14.5 \n EU: 50 2/3 \n CM: 33");
        }
        //Nike Womens
        if(selectedBrand==1 && selectedGender==2 && selectedSize==17 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 4 \n UK: 2.5 \n EU: 35 \n CM: 21");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==18 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 4.5 \n UK: 3 \n EU: 35.5 \n CM: 21.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==19 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5 \n UK: 3.5 \n EU: 36 \n CM: 22");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==20 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5.5 \n UK: 4 \n EU: 36 2/3 \n CM: 22.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==21 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 4.5 \n EU: 37 1/3 \n CM: 23");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==22 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 5 \n EU: 38 \n CM: 23.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==23 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 5.5 \n EU: 3 2/3 \n CM: 24");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==24 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 6 \n EU: 39 1/3 \n CM: 24.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==25 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 6.5 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==26 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 7 \n EU: 40 2/3 \n CM: 25.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==27 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 7.5 \n EU: 41 1/3 \n CM: 26");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==28 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 8 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==29 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 8.5 \n EU: 42 2/3 \n CM: 27");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==30 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 9 \n EU: 43 1/3 \n CM: 27.5");
        }
        if(selectedBrand==1 && selectedGender==2 && selectedSize==31 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 9.5 \n EU: 44 \n CM: 28");
        }
        //Adidas Men
        if(selectedBrand==2 && selectedGender==1 && selectedSize==33 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 5.5 \n EU: 38 2/3 \n CM: 24");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==34 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 6 \n EU: 39 1/3 \n CM: 24.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==35 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 6.5 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==36 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 7 \n EU: 40 2/3 \n CM: 25.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==37 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 7.5 \n EU: 41 1/3 \n CM: 26");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==38 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 8 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==39 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 8.5 \n EU: 42 2/3 \n CM: 27");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==40 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 9 \n EU: 43 1/3 \n CM: 27.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==41 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 9.5 \n EU: 44 \n CM: 28");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==42 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 10 \n EU: 44 2/3 \n CM: 28.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==43 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 10.5 \n EU: 45 1/3 \n CM: 29");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==44 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11.5 \n UK: 11 \n EU: 46 \n CM: 29.5");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==45 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 12 \n UK: 11.5 \n EU: 46 1/3 \n CM: 30");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==46 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 13 \n UK: 12.5 \n EU: 48 \n CM: 31");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==47 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 14 \n UK: 13.5 \n EU: 49 1/3 \n CM: 32");
        }
        if(selectedBrand==2 && selectedGender==1 && selectedSize==48 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 15 \n UK: 14.5 \n EU: 50 2/3 \n CM: 33");
        }
        //adidas Womens
        if(selectedBrand==2 && selectedGender==2 && selectedSize==49 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 4 \n UK: 2.5 \n EU: 35 \n CM: 21");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==50 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 4.5 \n UK: 3 \n EU: 35.5 \n CM: 21.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==51 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5 \n UK: 3.5 \n EU: 36 \n CM: 22");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==52 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 5.5 \n UK: 4 \n EU: 36 2/3 \n CM: 22.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==53 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6 \n UK: 4.5 \n EU: 37 1/3 \n CM: 23");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==54 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 6.5 \n UK: 5 \n EU: 38 \n CM: 23.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==55 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7 \n UK: 5.5 \n EU: 3 2/3 \n CM: 24");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==56 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 7.5 \n UK: 6 \n EU: 39 1/3 \n CM: 24.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==57 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8 \n UK: 6.5 \n EU: 40 \n CM: 25");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==58 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 8.5 \n UK: 7 \n EU: 40 2/3 \n CM: 25.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==59 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9 \n UK: 7.5 \n EU: 41 1/3 \n CM: 26");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==60 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 9.5 \n UK: 8 \n EU: 42 \n CM: 26.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==61 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10 \n UK: 8.5 \n EU: 42 2/3 \n CM: 27");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==62 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 10.5 \n UK: 9 \n EU: 43 1/3 \n CM: 27.5");
        }
        if(selectedBrand==2 && selectedGender==2 && selectedSize==63 && wantedBrand==3){
            t.setText("Based on your current shoe the size of the shoe you are going to buy should be: \n \n US: 11 \n UK: 9.5 \n EU: 44 \n CM: 28");
        }



        vaihdanakyma5 = findViewById(R.id.button5);
        vaihdanakyma5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    switchActivities5();
                }
        });

    }
    private void switchActivities5(){
        Intent switchActivityIntent5 = new Intent(this, MainActivity.class);
        startActivity(switchActivityIntent5);
    }
}