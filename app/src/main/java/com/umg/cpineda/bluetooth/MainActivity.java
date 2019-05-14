package com.umg.cpineda.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      private BluetoothAdapter mBluetoothAdapter;
      Button btnBlueTooth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
         btnBlueTooth= (Button) findViewById(R.id.btnBlueTooth);
    }

    public void habilitarBlue(View view){
        try {



            if(!mBluetoothAdapter.isEnabled()){
                Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableBtIntent, 0);
                Toast.makeText(this,"Bluetooth no esta activo.", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"El bluetooth esta activo.", Toast.LENGTH_LONG).show();
            }
        }catch (Exception e){
            System.out.println("Error al inicial la app");
            e.printStackTrace();
        }

    }

    public void voz(View view){
        System.out.println("envio de direcciones por voz");
        if(!mBluetoothAdapter.isEnabled()){

            Toast.makeText(this,"Bluetooth no esta activo. Active el Bluetooth.", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"El bluetooth esta activo.", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, Voz.class);
            startActivity(i);
        }
    }

    public void control(View view){
        System.out.println("envio de direcciones por botones");

        if(!mBluetoothAdapter.isEnabled()){
            Toast.makeText(this,"Bluetooth no esta activo. Active el Bluetooth.", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"El bluetooth esta activo.", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, Control.class);
            startActivity(i);
        }
    }
}
