package com.zybooks.utilitycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class TempActivity extends AppCompatActivity {
    private Button btnMain;
    private Button btnCalcTemp;
    private EditText numDegrees;
    private RadioGroup radioGroup;
    private TextView txtTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        //grab views
        btnMain = (Button) findViewById(R.id.btnMain3);
        btnCalcTemp = (Button) findViewById(R.id.btnCalcTemp);
        numDegrees = (EditText) findViewById(R.id.numDegrees);
        radioGroup = (RadioGroup) findViewById(R.id.radioGrpTemp);
        txtTemperature = (TextView) findViewById(R.id.txtTemperature);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openMain();}
        });
        btnCalcTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {convertTemp();}
        });
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void convertTemp(){
        float newTemp = 0;
        float oldTemp = Float.parseFloat(numDegrees.getText().toString());
        int checkedId = radioGroup.getCheckedRadioButtonId();
        //If C is true
        if(checkedId==R.id.radioC){
            newTemp = (oldTemp-32)*5/9;
            txtTemperature.setText("Your Tempature is: "+newTemp+"C");
        }
        //If F is true
        if(checkedId==R.id.radioF){
           newTemp =(oldTemp*9/5)+32;
            txtTemperature.setText("Your Tempature is: "+newTemp+"F");
        }




    }
}