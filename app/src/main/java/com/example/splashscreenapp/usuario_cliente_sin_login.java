package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuario_cliente_sin_login extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_cliente_sin_login);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textView28:
                Intent intent = new Intent(this, usuario_cliente_registro.class);
                startActivity(intent);
                break;
            case R.id.imageView5:
                Intent intent1 = new Intent(this, omitir_login.class);
                startActivity(intent1);
                break;
            case R.id.imageView2:
                Intent intent2 = new Intent(this, usuario_cliente_registro.class);
                startActivity(intent2);
                break;
        }
    }

}