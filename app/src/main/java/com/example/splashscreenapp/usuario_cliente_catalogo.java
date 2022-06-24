package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuario_cliente_catalogo extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_cliente_catalogo);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView1:
                Intent intent=new Intent( this, usuario_cliente_cuenta.class );
                startActivity(intent);
                break;
            case R.id.imageView2:
                Intent intent1=new Intent( this, usuario_cliente_mensaje.class );
                startActivity(intent1);
                break;
            case R.id.botellas1:
                Intent intent2=new Intent( this, detallesueterpolar.class );
                startActivity(intent2);
                break;
            case R.id.bolso1:
                Intent intent3=new Intent( this, detallebolso.class );
                startActivity(intent3);
                break;
            case R.id.camisa1:
                Intent intent4=new Intent( this, dtallecamisa.class );
                startActivity(intent4);
                break;
            case R.id.mesa1:
                Intent intent5=new Intent( this, detallemesa.class );
                startActivity(intent5);
                break;
            case R.id.tricilo1:
                Intent intent6=new Intent( this, detalletriciclo.class );
                startActivity(intent6);
                break;
            case R.id.jarron1:
                Intent intent7=new Intent( this, detallejarronA.class );
                startActivity(intent7);
                break;
            case R.id.ladrillo1:
                Intent intent8=new Intent( this, detalleladrillosp.class );
                startActivity(intent8);
                break;
            case R.id.madera1:
                Intent intent9=new Intent( this, detallemaderap.class );
                startActivity(intent9);
                break;
        }
    }


}
