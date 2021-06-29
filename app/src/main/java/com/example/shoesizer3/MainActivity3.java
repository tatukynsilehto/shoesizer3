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

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {
    Button vaihdanakyma3;
    int selectedBrand;
    int selectedGender;
    int selectedSize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            selectedBrand = extras.getInt("SelectedBrand");
            selectedGender = extras.getInt("SelectedGender");
        }

        String[] size = new String[]{
                "US", "UK", "EU", "CM"
        };

        String[] nikemenUs = new String[]{
                "6", "6.5", "7", "7,5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12", "13", "14", "15" //16
        };

        String[] nikemenEu = new String[]{
                "38.5", "39", "40", "40.5", "41", "42", "42.5", "43", "44", "44.5", "45", "45.5", "46", "47.5", "48.5", "49.5" //16
        };

        String[] nikemenUk = new String[]{
                "5.5", "6", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "12", "13", "14" //16
        };

        String[] nikemenCm = new String[]{
                "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "28.5", "29", "29.5", "30", "31", "32", "33" //16
        };

        String[] nikewomenUs = new String[]{
                "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12" //16
        };

        String[] nikewomenUk = new String[]{
                "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5" //16
        };

        String[] nikewomenEu = new String[]{
                "35.5", "36", "36.5", "37.5", "38", "38.5", "39", "40", "40.5", "41", "42", "42.5", "43", "44", "44.5" //16
        };

        String[] nikewomenCm = new String[]{
                "22", "22.5", "23", "23.5", "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "28.5", "29" //16
        };

        String[] adidasmenUs = new String[]{
                "6", "6.5", "7", "7,5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12", "13", "14", "15" //16
        };

        String[] adidasmenUk = new String[]{
                "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12.5", "13.5", "14.5" //16
        };

        String[] adidasmenEu = new String[]{
                "38 2/3", "39 1/3", "40", "40 2/3", "41 1/3", "42", "42 2/3", "43 1/3", "44", "44 2/3", "45 1/3", "46", "46 1/3", "48", "49 1/3", "50 2/3" //16
        };

        String[] adidasmenCm = new String[]{
                "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "28.5", "29", "29.5", "30", "31", "32", "33" //16
        };

        String[] adidaswomenUs = new String[]{
                "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "12" //16
        };

        String[] adidaswomenUk = new String[]{
                "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10.5" //16
        };

        String[] adidaswomenEu = new String[]{
                "35", "35.5", "36", "36 2/3", "37 1/3", "38", "38 2/3", "39 1/3", "40", "40 2/3", "41 1/3", "42", "42 2/3", "43 1/3", "44", "45" //16
        };

        String[] adidaswomenCm = new String[]{
                "21", "21.5", "22", "22.5", "23", "23.5", "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "29" //16
        };

        String[] pumamenUs = new String[]{
                "6", "6.5", "7", "7,5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12", "12.5", "13", "14" //16
        };

        String[] pumamenEu = new String[]{
                "38", "38.5", "39", "40", "40.5", "41", "42", "42.5", "43", "44", "44.5", "45", "46", "46.5", "47", "48.5" //16
        };

        String[] pumamenUk = new String[]{
                "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12", "13" //16
        };

        String[] pumamenCm = new String[]{
                "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "28.5", "29", "29.5", "30.5", "31", "32", "33" //16
        };

        String[] pumawomenUs = new String[]{
                "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5", "10", "10.5", "11", "11.5", "12" //16
        };

        String[] pumawomenUk = new String[]{
                "2.5", "3", "3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5", "8", "8.5", "9", "9.5" //16
        };

        String[] pumawomenEu = new String[]{
               "35", "35.5", "36","37", "37.5", "38", "38.5", "39", "40", "40.5", "41", "42", "42.5", "43", "44" //16
        };

        String[] pumawomenCm = new String[]{
                "21,5", "22", "22.5", "23", "23.5", "24", "24.5", "25", "25.5", "26", "26.5", "27", "27.5", "28", "28.5" //16
        };

        Spinner s3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, size);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(adapter3);

        Spinner s4 = (Spinner) findViewById(R.id.spinner4);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikemenUs);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikemenUk);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikemenEu);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikemenCm);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter8 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikewomenUs);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter9 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikewomenUk);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter10 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikewomenEu);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter11 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nikewomenCm);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter12 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidasmenUs);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter13 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidasmenUk);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter14 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidasmenEu);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter15 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidasmenCm);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter16 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidaswomenUs);
        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter17 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidaswomenUk);
        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter18 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidaswomenEu);
        adapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter19 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adidaswomenCm);
        adapter19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter20 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pumamenUs);
        adapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter21 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pumamenUk);
        adapter21.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter22 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pumamenEu);
        adapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter23 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pumamenCm);
        adapter23.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter24 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pumawomenUs);
        adapter24.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter25 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pumawomenUk);
        adapter25.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter26 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pumawomenEu);
        adapter26.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter27 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, pumawomenCm);
        adapter27.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0 && selectedGender==1 && selectedBrand==1 ){
                    s4.setAdapter(adapter4);
                }
                if(position==1 && selectedGender==1 && selectedBrand==1 ){
                    s4.setAdapter(adapter5);
                }
                if(position==2 && selectedGender==1 && selectedBrand==1 ){
                    s4.setAdapter(adapter6);
                }
                if(position==3 && selectedGender==1 && selectedBrand==1 ){
                    s4.setAdapter(adapter7);
                }
                if(position==0 && selectedGender==2 && selectedBrand==1 ){
                    s4.setAdapter(adapter8);
                }
                if(position==1 && selectedGender==2 && selectedBrand==1 ){
                    s4.setAdapter(adapter9);
                }
                if(position==2 && selectedGender==2 && selectedBrand==1 ){
                    s4.setAdapter(adapter10);
                }
                if(position==3 && selectedGender==2 && selectedBrand==1 ){
                    s4.setAdapter(adapter11);
                }
                if(position==0 && selectedGender==1 && selectedBrand==2 ){
                    s4.setAdapter(adapter12);
                }
                if(position==1 && selectedGender==1 && selectedBrand==2 ){
                    s4.setAdapter(adapter13);
                }
                if(position==2 && selectedGender==1 && selectedBrand==2 ){
                    s4.setAdapter(adapter14);
                }
                if(position==3 && selectedGender==1 && selectedBrand==2 ){
                    s4.setAdapter(adapter15);
                }
                if(position==0 && selectedGender==2 && selectedBrand==2 ){
                    s4.setAdapter(adapter16);
                }
                if(position==1 && selectedGender==2 && selectedBrand==2 ){
                    s4.setAdapter(adapter17);
                }
                if(position==2 && selectedGender==2 && selectedBrand==2 ){
                    s4.setAdapter(adapter18);
                }
                if(position==3 && selectedGender==2 && selectedBrand==2 ){
                    s4.setAdapter(adapter19);
                }
                if(position==0 && selectedGender==1 && selectedBrand==3 ){
                    s4.setAdapter(adapter20);
                }
                if(position==1 && selectedGender==1 && selectedBrand==3 ){
                    s4.setAdapter(adapter21);
                }
                if(position==2 && selectedGender==1 && selectedBrand==3 ){
                    s4.setAdapter(adapter22);
                }
                if(position==3 && selectedGender==1 && selectedBrand==3 ){
                    s4.setAdapter(adapter23);
                }
                if(position==0 && selectedGender==2 && selectedBrand==3 ){
                    s4.setAdapter(adapter24);
                }
                if(position==1 && selectedGender==2 && selectedBrand==3 ){
                    s4.setAdapter(adapter25);
                }
                if(position==2 && selectedGender==2 && selectedBrand==3 ){
                    s4.setAdapter(adapter26);
                }
                if(position==3 && selectedGender==2 && selectedBrand==3 ){
                    s4.setAdapter(adapter27);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               //NIKE MENS
                if(position==0 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 1;
                }
                if(position==1 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 2;
                }
                if(position==2 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 3;
                }
                if(position==3 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 4;
                }
                if(position==4 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 5;
                }
                if(position==5 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 6;
                }
                if(position==6 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 7;
                }
                if(position==7 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 8;
                }
                if(position==8 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 9;
                }
                if(position==9 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 10;
                }
                if(position==10 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 11;
                }
                if(position==11 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 12;
                }
                if(position==12 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 13;
                }
                if(position==13 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 14;
                }
                if(position==14 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 15;
                }
                if(position==15 && selectedBrand==1 && selectedGender==1){
                    selectedSize = 16;
                }
                //NIKE WOMENS
                if(position==0 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 17;
                }
                if(position==1 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 18;
                }
                if(position==2 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 19;
                }
                if(position==3 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 20;
                }
                if(position==4 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 21;
                }
                if(position==5 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 22;
                }
                if(position==6 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 23;
                }
                if(position==7 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 24;
                }
                if(position==8 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 25;
                }
                if(position==9 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 26;
                }
                if(position==10 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 27;
                }
                if(position==11 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 28;
                }
                if(position==12 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 29;
                }
                if(position==13 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 30;
                }
                if(position==14 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 31;
                }
                if(position==15 && selectedBrand==1 && selectedGender==2){
                    selectedSize = 32;
                }
                //ADIDAS MENS
                if(position==0 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 33;
                }
                if(position==1 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 34;
                }
                if(position==2 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 35;
                }
                if(position==3 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 36;
                }
                if(position==4 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 37;
                }
                if(position==5 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 38;
                }
                if(position==6 && selectedBrand==2&& selectedGender==1){
                    selectedSize = 39;
                }
                if(position==7 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 40;
                }
                if(position==8 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 41;
                }
                if(position==9 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 42;
                }
                if(position==10 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 43;
                }
                if(position==11 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 44;
                }
                if(position==12 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 45;
                }
                if(position==13 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 46;
                }
                if(position==14 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 47;
                }
                if(position==15 && selectedBrand==2 && selectedGender==1){
                    selectedSize = 48;
                }
                //ADIDAS WOMENS
                if(position==0 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 49;
                }
                if(position==1 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 50;
                }
                if(position==2 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 51;
                }
                if(position==3 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 52;
                }
                if(position==4 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 53;
                }
                if(position==5 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 54;
                }
                if(position==6 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 55;
                }
                if(position==7 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 56;
                }
                if(position==8 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 57;
                }
                if(position==9 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 58;
                }
                if(position==10 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 59;
                }
                if(position==11 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 60;
                }
                if(position==12 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 61;
                }
                if(position==13 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 62;
                }
                if(position==14 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 63;
                }
                if(position==15 && selectedBrand==2 && selectedGender==2){
                    selectedSize = 64;
                }
                //Puma MENS
                if(position==0 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 65;
                }
                if(position==1 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 66;
                }
                if(position==2 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 67;
                }
                if(position==3 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 68;
                }
                if(position==4 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 69;
                }
                if(position==5 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 70;
                }
                if(position==6 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 71;
                }
                if(position==7 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 72;
                }
                if(position==8 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 73;
                }
                if(position==9 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 74;
                }
                if(position==10 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 75;
                }
                if(position==11 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 76;
                }
                if(position==12 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 77;
                }
                if(position==13 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 78;
                }
                if(position==14 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 79;
                }
                if(position==15 && selectedBrand==3 && selectedGender==1){
                    selectedSize = 80;
                }
                //ADIDAS WOMENS
                if(position==0 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 81;
                }
                if(position==1 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 82;
                }
                if(position==2 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 83;
                }
                if(position==3 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 84;
                }
                if(position==4 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 85;
                }
                if(position==5 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 86;
                }
                if(position==6 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 87;
                }
                if(position==7 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 88;
                }
                if(position==8 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 89;
                }
                if(position==9 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 90;
                }
                if(position==10 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 91;
                }
                if(position==11 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 92;
                }
                if(position==12 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 93;
                }
                if(position==13 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 94;
                }
                if(position==14 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 95;
                }
                if(position==15 && selectedBrand==3 && selectedGender==2){
                    selectedSize = 96;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

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
        switchActivityIntent3.putExtra("SelectedBrand", selectedBrand);
        switchActivityIntent3.putExtra("SelectedGender", selectedGender);
        switchActivityIntent3.putExtra("SelectedSize", selectedSize);
        startActivity(switchActivityIntent3);
    }
}