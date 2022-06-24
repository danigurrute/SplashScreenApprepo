package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuariocliente extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuariocliente);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
                Intent intent = new Intent(this, usuario_cliente_registro.class);
                startActivity(intent);
                break;
            case R.id.admin7:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.admin3:
                Intent intent2 = new Intent(this, usuario_cliente_catalogo.class);
                startActivity(intent2);
                break;

        }
    }
}