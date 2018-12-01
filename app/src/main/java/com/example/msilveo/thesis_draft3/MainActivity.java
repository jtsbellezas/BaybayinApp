package com.example.msilveo.thesis_draft3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView historyCard, chartCard, learnCard, quizCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // defining Cards
        historyCard = (CardView) findViewById(R.id.historyCard);
        chartCard = (CardView) findViewById(R.id.chartCard);
        learnCard = (CardView) findViewById(R.id.learnCard);
        quizCard = (CardView) findViewById(R.id.quizCard);

        //Add Click listener to the cards
        historyCard.setOnClickListener(this);
        chartCard.setOnClickListener(this);
        learnCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent i;

        switch (v.getId())
        {
            case R.id.historyCard: i = new Intent(this,History.class);
            startActivity(i);
            break;

            /*case R.id.chartCard: i = new Intent(this,Chart.class);
            startActivity(i);
            break;*/

            case R.id.learnCard: i = new Intent(this,Learn.class);
            startActivity(i);
            break;

            case R.id.quizCard: i = new Intent(this,Quiz.class);
            startActivity(i);
            break;

            default:break;
        }
    }
}

