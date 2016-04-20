package com.example.memo.higherorlower;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;



public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void checkGuess(View view){


        EditText guessedNumber = (EditText) findViewById(R.id.guessedNumber);

        String guessNumberString = guessedNumber.getText().toString();

        int guessedNumberint = Integer.parseInt(guessNumberString);





        if (guessedNumberint > randomNumber ) {

            Toast.makeText(getApplicationContext(),"Too high",Toast.LENGTH_LONG).show();

        } else if (guessedNumberint  < randomNumber) {

            Toast.makeText(getApplicationContext(),"Too Low",Toast.LENGTH_LONG).show();
        } else  {

            Toast.makeText(getApplicationContext(),"Correct , well done ;)",Toast.LENGTH_LONG).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenrator = new Random();
        randomNumber = randomGenrator.nextInt(21);


        }}