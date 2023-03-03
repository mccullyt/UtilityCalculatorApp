package com.zybooks.utilitycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button tempButton;
    private Button tipButton;
    private Button gasButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gasButton = (Button) findViewById(R.id.btnGas);
        tempButton = (Button) findViewById(R.id.btnTemp);
        tipButton = (Button) findViewById(R.id.btnTip);

        gasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openGasCalc();}
        });
        tempButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openTempConverter();}
        });
        tipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openTipCalc();}
        });
        }
    public void openGasCalc(){
        Intent intent = new Intent(this, GasActivity.class);
        startActivity(intent);
    }

    public void openTempConverter(){
        Intent intent = new Intent(this, TempActivity.class);
        startActivity(intent);
    }
    public void openTipCalc(){
        Intent intent = new Intent(this, TipActivity.class);
        startActivity(intent);
    }

}
