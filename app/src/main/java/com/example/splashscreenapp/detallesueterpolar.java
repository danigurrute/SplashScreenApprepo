package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class detallesueterpolar extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallesueterpolar);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView8:
                Intent intent = new Intent(this, usuario_cliente_catalogo.class);
                startActivity(intent);
                break;
            case R.id.imageView13:
                Intent intent1 = new Intent(this, listadeseosuterpolar.class);
                startActivity(intent1);
                break;

        }
    }
}