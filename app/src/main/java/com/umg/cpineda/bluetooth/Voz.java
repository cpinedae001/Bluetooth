package com.umg.cpineda.bluetooth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Voz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voz);
    }

    public void menu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        System.out.println("Pasando al menu principal");
        Toast.makeText(this, "Regresando al menú.", Toast.LENGTH_LONG).show();
    }
}
