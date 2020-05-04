package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Main3Activity extends AppCompatActivity {
    EditText alas,tinggi,a,b,c;
    Button hitung;
    TextView hasil;
    TextView hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        alas = (EditText)findViewById(R.id.alas);
        tinggi = (EditText)findViewById(R.id.tinggi);
        a = (EditText)findViewById(R.id.a);
        b = (EditText)findViewById(R.id.b);
        c = (EditText)findViewById(R.id.c);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView)findViewById(R.id.txt_hasil);
        hasil2 = (TextView)findViewById(R.id.txt_hasil2);

        hitung.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(alas.length()==0 && tinggi.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (alas.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = alas.getText().toString();
                    String isitinggi = tinggi.getText().toString();
                    String isisisia = a.getText().toString();
                    String isisisib = b.getText().toString();
                    String isisisic = c.getText().toString();
                    double alas = Double.parseDouble(isialas);
                    double tinggi = Double.parseDouble(isitinggi);
                    double a = Double.parseDouble(isisisia);
                    double b = Double.parseDouble(isisisib);
                    double c = Double.parseDouble(isisisic);
                    double hs = LuasSegitiga(alas,tinggi);
                    double hs2 = KelilingSegitiga(a,b,c);

                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());

                    output = String.valueOf(hs2);
                    hasil2.setText(output.toString());
                }
            }
        });

        }
    public double LuasSegitiga(double alas, double tinggi){return alas*tinggi/2;}
    public double KelilingSegitiga(double a, double b, double c){return a+b+c;}
    }
