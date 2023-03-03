package com.zybooks.utilitycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TipActivity extends AppCompatActivity {
    private Button btnMain;
    private Button btnTip10;
    private Button btnTip15;
    private Button btnTip20;
    private EditText numBillAmt;
    private TextView txtTip;
    private float bill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
        btnMain = (Button) findViewById(R.id.btnMain1);
        btnTip10 = (Button) findViewById(R.id.btnTip10);
        btnTip15 = (Button) findViewById(R.id.btnTip15);
        btnTip20 = (Button) findViewById(R.id.btnTip20);
        numBillAmt = (EditText) findViewById(R.id.numBillAmt);
        txtTip = (TextView) findViewById(R.id.txtTip);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openMain();}
        });
        btnTip10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {calcTip((float).1);}
        });
        btnTip15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {calcTip((float).15);}
        });
        btnTip20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {calcTip((float).20);}
        });
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void calcTip(float percent){
        float bill = Float.parseFloat(numBillAmt.getText().toString());
        float totalTip = bill*percent;
        txtTip.setText(Float.toString(totalTip));
    }
}