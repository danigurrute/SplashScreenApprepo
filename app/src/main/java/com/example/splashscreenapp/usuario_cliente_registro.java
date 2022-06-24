package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuario_cliente_registro extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_cliente_registro);
    }

        @Override
        public void onClick(View view) {
                switch (view.getId()){
                        case R.id.button3:
                                Intent intent=new Intent( this, usuariocliente.class );
                                startActivity(intent);
                                break;
                    case R.id.admin4:
                        Intent intent1=new Intent( this, usuariocliente.class );
                        startActivity(intent1);
                        break;
                }
        }


}