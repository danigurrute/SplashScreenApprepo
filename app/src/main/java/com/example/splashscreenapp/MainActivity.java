package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.recolector:
                Intent intent=new Intent( this, Usuariorecolector.class );
                startActivity(intent);
                break;
            case R.id.user:
                Intent intent1=new Intent(MainActivity.this, usuariocliente.class);
                startActivity(intent1);
                break;
            case R.id.admin:
                Intent intent2=new Intent(MainActivity.this, Admin.class);
                startActivity(intent2);
                break;
            case R.id.button17:
                Intent intent3=new Intent(MainActivity.this,omitir_login.class);
                startActivity(intent3);
                break;
        }
    }


}