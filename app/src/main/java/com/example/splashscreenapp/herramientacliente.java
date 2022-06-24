package com.example.splashscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class herramientacliente extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientacliente);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button10:
                Intent intent = new Intent(this, omitir_login.class);
                startActivity(intent);
                break;

        }
    }
}
