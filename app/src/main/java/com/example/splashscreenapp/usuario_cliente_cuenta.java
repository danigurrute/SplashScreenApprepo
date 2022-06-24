package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuario_cliente_cuenta extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_cliente_cuenta);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView2:
                Intent intent=new Intent( this, usuario_cliente_mensaje.class );
                startActivity(intent);
                break;
            case R.id.imageView5:
                Intent intent1=new Intent( this, usuario_cliente_catalogo.class );
                startActivity(intent1);
                break;
            case R.id.imageView17:
                Intent intent2=new Intent( this, herramientacliente.class );
                startActivity(intent2);
                break;
        }
    }


}