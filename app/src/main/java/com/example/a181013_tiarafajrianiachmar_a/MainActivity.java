package com.example.a181013_tiarafajrianiachmar_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt_nama,txt_pass;
    Button btn_login,btn_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_nama=findViewById(R.id.txt_name);
        txt_pass=findViewById(R.id.txt_password);


        btn_login=findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama=txt_nama.getText().toString();
                String pass=txt_pass.getText().toString();
                if(nama.equals("tiara")&&pass.equals("181013")){
                    Intent intent = new Intent(MainActivity.this,inputBiodata.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"Maaf Anda Belum Terdaftar...",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_close=findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}