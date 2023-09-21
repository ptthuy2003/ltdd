package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private String input, answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv);
    }
    public void ButtonClick(View view){
        Button botton= (Button) view;
        String data = botton.getText().toString();

        switch(data){
            case "AC":
                input= "";
                break;
            case "C":
                if(input.length()>0){
                    String newtext = input.substring(0,input.length()-1);
                    input= newtext;
                }
                break;
            case "=":
                solver();
                answer= input;
                break;
            case "*":
                solver();
                input += "*";
                break;
            default:
                if (input== null){
                    input="";
                }
                if (data.equals("+")|| data.equals("-")||data.equals("/")){
                    solver();
                }
                input+= data;
        }
        tv.setText(input);
    }
    public void solver(){
        if (input.split("\\*").length==2){
            String number[] = input.split("\\*");
            try {
                double mal= Double.parseDouble(number[0])* Double.parseDouble(number[1]);
                input= mal+ "";
            }catch (Exception e){
            }
        }
        if (input.split("\\/").length==2){
            String number[] = input.split("\\/");
            try {
                double mal= Double.parseDouble(number[0])/ Double.parseDouble(number[1]);
                input= mal+ "";
            }catch (Exception e){
            }
        }
        if (input.split("\\+").length==2){
            String number[] = input.split("\\+");
            try {
                double mal= Double.parseDouble(number[0])+ Double.parseDouble(number[1]);
                input= mal+ "";
            }catch (Exception e){
            }
        }
        if (input.split("\\-").length==2){
            String number[] = input.split("\\-");
            try {
                double mal= Double.parseDouble(number[0])- Double.parseDouble(number[1]);
                input= mal+ "";
            }catch (Exception e){
            }
        }

        String n[]= input.split("\\.");
        if (n.length>1){
            if(n[1].equals("0")){
                input= n[0];
            }
        }
    }
}