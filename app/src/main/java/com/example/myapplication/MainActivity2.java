package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    Button button1;
    RadioGroup radioGroup;
    String str;
    CheckBox[] cbs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radioGroup= findViewById(R.id.rg);
        button =  findViewById(R.id.okButton);
        button1 =  findViewById(R.id.checkbtn);
        cbs=new CheckBox[4];
        cbs[0] = (CheckBox)findViewById(R.id.checkBox1);
        cbs[1] = (CheckBox)findViewById(R.id.checkBox2);
        cbs[2] = (CheckBox)findViewById(R.id.checkBox3);
        cbs[3] = (CheckBox)findViewById(R.id.checkBox4);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb =findViewById(checkedId);

                str = "您喜欢的城市是：" + rb.getText().toString();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,str, Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = "";
                for (int i=0;i<cbs.length;i++)
                {
                    if(cbs[i].isChecked())
                    {
                        string+=cbs[i].getText().toString()+";";
                        //cbs[i].setChecked(false);
                    }
                }
                Toast.makeText(MainActivity2.this,string, Toast.LENGTH_SHORT).show();
            }
        });

    }}


