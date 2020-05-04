package com.example.utsmobile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.utsmobile.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText txtusername;
    private EditText txtpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // code ini dipanggil ketika activity dimulai.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtusername = (EditText) findViewById(R.id.txtusername);
        txtpassword= (EditText) findViewById(R.id.txtpassword);
        btnlogin  = (Button) findViewById(R.id.btnlogin);
    }

    public void checkLogin(View arg0) {



            final String username= txtusername.getText().toString();
            final String pass = txtpassword.getText().toString();

            if (username.equals("ni kadek sri erawati") && pass.equals("18101163")) {
                //jika login berhasil
                Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                MainActivity.this.startActivity(intent);
                finish();
            } else {
                //jika login gagal

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Username atau Password Anda Salah")
                        .setNegativeButton("Retry", null).create().show();
            }




    }


}
