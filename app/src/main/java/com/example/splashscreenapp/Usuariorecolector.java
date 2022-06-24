package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Usuariorecolector extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuariorecolector);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.admin5:
            Intent intent=new Intent (this, vistausuariorecolector.class);
            startActivity(intent);
            break;
        }
    }
}