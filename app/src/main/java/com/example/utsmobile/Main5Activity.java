package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Main5Activity extends AppCompatActivity  {
    EditText p,l,t;
    Button hitung;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        p = (EditText)findViewById(R.id.panjang);
        l = (EditText)findViewById(R.id.lebar);
        t = (EditText)findViewById(R.id.tinggi);
        hitung = (Button) findViewById(R.id.button);
        hasil = (TextView)findViewById(R.id.txt_hasil);
        hitung.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(p.length()==0 && l.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (p.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (l.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isipanjang = p.getText().toString();
                    String isilebar = l.getText().toString();
                    String isitinggi = t.getText().toString();
                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);
                    double t = Double.parseDouble(isitinggi);
                    double hs = VolumeBalok(p,l,t);


                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());


                }
            }
        });


    }
    public double VolumeBalok(double p, double l, double t){return p*l*t;}

}
