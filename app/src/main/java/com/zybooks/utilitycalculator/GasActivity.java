package com.zybooks.utilitycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GasActivity extends AppCompatActivity {
    //set up views
    private Button btnMain;
    private Button btnCalcGas;
    private EditText numGasCap;
    private EditText numMiles;
    private TextView txtMPG;

    private RatingBar ratingMpg;

    //set up variables
    private int mpg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas);
        //Grab our Views
        txtMPG = (TextView) findViewById(R.id.txtMPG);
        numGasCap = (EditText) findViewById(R.id.numGasCap);
        numMiles = (EditText) findViewById(R.id.numMiles);
        btnMain = (Button) findViewById(R.id.btnMain2);
        btnCalcGas = (Button) findViewById(R.id.btnCalcGas);
        ratingMpg = (RatingBar) findViewById(R.id.ratingMpg);

        //Set Click Event Listeners
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openMain();}
        });
        btnCalcGas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {calcGas();}

        });
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void calcGas(){
        String gasCapStr = numGasCap.getText().toString();
        String milesStr = numMiles.getText().toString();
        float mpgFloat = Integer.parseInt(milesStr)/Integer.parseInt(gasCapStr);
        mpg = (int) Math.ceil(mpgFloat);
        txtMPG.setText("Miles Per Gallon: "+mpg);
        if(mpg > 30){ratingMpg.setRating(3);}
        if(mpg > 15 || mpg < 20){ratingMpg.setRating((float)1.5);}
        if(mpg < 15){ratingMpg.setRating(1);}

    }



}