package com.example.mydiceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

   ImageView diceImg;
    Button rollBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diceImg = findViewById(R.id.dice_img);
        rollBtn = findViewById(R.id.roll_btn);

        //Setting a function to call on button click
        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
//
    }
    private void rollDice() {
        int randomNum = new Random().nextInt(6) + 1;
        int drawableImg;

        switch (randomNum) {
            case 1:
                drawableImg = R.drawable.dice_1;
                break;
            case 2:
                drawableImg = R.drawable.dice_2;
                break;
            case 3:
                drawableImg = R.drawable.dice_3;
                break;
            case 4:
                drawableImg = R.drawable.dice_4;
                break;
            case 5:
                drawableImg = R.drawable.dice_5;
                break;
            default:
                drawableImg = R.drawable.dice_6;
        }
        //Setting Image As Per the Number from switch
        diceImg.setImageResource(drawableImg);

        //Making a Toast Message
        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show();

    }
}