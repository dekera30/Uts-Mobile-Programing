package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    Button btnExit;
    Button btnbangun1;
    Button btnbangun2;
    Button btnruang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnbangun1=findViewById(R.id.btnbangun1);
        btnbangun1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this.getApplicationContext(), Main3Activity.class);
                Main2Activity.this.startActivity(intent);
            }
        });

        btnbangun2=findViewById(R.id.btnbangun2);
        btnbangun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this.getApplicationContext(), Main4Activity.class);
                Main2Activity.this.startActivity(intent);
            }
        });

        btnruang=findViewById(R.id.btnruang);
        btnruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this.getApplicationContext(), Main5Activity.class);
                Main2Activity.this.startActivity(intent);
            }
        });


    }
}
