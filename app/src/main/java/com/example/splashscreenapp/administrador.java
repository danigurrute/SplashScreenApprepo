package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class administrador extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button11:
                Intent intent=new Intent( this, Admin.class );
                startActivity(intent);
                break;
        }
    }


}
