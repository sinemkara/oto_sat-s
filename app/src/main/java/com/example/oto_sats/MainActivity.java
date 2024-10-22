package com.example.oto_sats;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner sp;
RadioButton bnz,dzl,mnl,yo,to;
CheckBox çlk,djtl,snrf;
Button hsp;
TextView sonuc;
    private int selectedPosition;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=findViewById(R.id.sp);
        bnz=findViewById(R.id.bnz);
        dzl=findViewById(R.id.dzl);
        mnl=findViewById(R.id.mnl);
        yo=findViewById(R.id.yo);
        to=findViewById(R.id.to);
        çlk=findViewById(R.id.çlk);
        djtl=findViewById(R.id.djtl);
        snrf=findViewById(R.id.snrf);
        hsp=findViewById(R.id.hsp);
        sonuc=findViewById(R.id.sonuc);

        hsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Spinner'dan seçilen pozisyonu al
                int selectedPosition = sp.getSelectedItemPosition();

                //TOPLAM DEĞİŞKENİ TANIMLAKİ BAŞLANGIÇ OLSUN
                int toplam=0;

                //BURASI BOŞ TATLIM
                if (selectedPosition==0){}


                //opel
                else if (selectedPosition == 1) {
                    toplam += 25000;
                    if (bnz.isChecked()){
                        toplam+=0;
                    }
                    if (dzl.isChecked()){
                        toplam+=7000;
                    }
                    if (mnl.isChecked()){
                        toplam+=0;
                    }
                    if (yo.isChecked()){
                        toplam+=3500;
                    }
                    if (to.isChecked()){
                        toplam+=6000;
                    }
                    if (çlk.isChecked()){
                        toplam+=1500;
                    }
                    if (djtl.isChecked()){
                        toplam+=2000;
                    }
                    if (snrf.isChecked()){
                        toplam+=1500;
                    }


                //Renault
                } else if (selectedPosition == 2) {
                    toplam += 30000;
                    if (bnz.isChecked()){
                        toplam+=0;
                    }
                    if (dzl.isChecked()){
                        toplam+=5500;
                    }
                    if (mnl.isChecked()){
                        toplam+=0;
                    }
                    if (yo.isChecked()){
                        toplam+=5000;
                    }
                    if (to.isChecked()){
                        toplam+=7500;
                    }
                    if (çlk.isChecked()){
                        toplam+=1250;
                    }
                    if (djtl.isChecked()){
                        toplam+=1750;
                    }
                    if (snrf.isChecked()){
                        toplam+=1500;
                    }


                }//Ford
                else if (selectedPosition == 3) {
                    toplam += 33000;
                    if (bnz.isChecked()){
                        toplam+=0;
                    }
                    if (dzl.isChecked()){
                        toplam+=6000;
                    }
                    if (mnl.isChecked()){
                        toplam+=0;
                    }
                    if (yo.isChecked()){
                        toplam+=4500;
                    }
                    if (to.isChecked()){
                        toplam+=7000;
                    }
                    if (çlk.isChecked()){
                        toplam+=1800;
                    }
                    if (djtl.isChecked()){
                        toplam+=2200;
                    }
                    if (snrf.isChecked()){
                        toplam+=1300;
                    }
                }

                //BURASI SON AŞAMAA
                sonuc.setText("Sonuç= "+Integer.toString(toplam));
                Toast.makeText(getApplicationContext(),"Fiyat = "+sonuc.getText().toString(), Toast.LENGTH_SHORT).show();
            }//ONCLİCK BİTİŞ
        });//HSP BİTİŞ

    }
}