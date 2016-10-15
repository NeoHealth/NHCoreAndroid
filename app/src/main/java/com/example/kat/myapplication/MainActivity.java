package com.example.kat.myapplication;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import static android.Manifest.permission.BLUETOOTH;

public class MainActivity extends AppCompatActivity {
    Button buttonToggle;
    private BluetoothAdapter BA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BA = BluetoothAdapter.getDefaultAdapter();
        buttonToggle = (Button) findViewById(R.id.toggleButton);
        buttonToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(turnOn, 0);

            }
        });

    }








}
