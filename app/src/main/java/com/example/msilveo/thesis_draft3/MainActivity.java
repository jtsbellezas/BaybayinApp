package com.example.msilveo.thesis_draft3;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    //main buttons
    private Button hBttn;
    private Button lBttn;
    private Button qBttn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainButtonFunc();


    }

    public void mainButtonFunc(){


        hBttn = (Button) findViewById(R.id.button21);
        lBttn = (Button) findViewById(R.id.button22);
        qBttn = (Button) findViewById(R.id.button23);

        hBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHistory();


            }
        });

        lBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openLearn();

            }
        });

        qBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openQuiz();
            }
        });

    }

    public void openHistory(){

        Intent intent = new Intent(this, History.class);
        startActivity(intent);

    }

    public void openLearn(){

        Intent intent = new Intent(this, Chart.class);
        startActivity(intent);

    }

    public void openQuiz(){

        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);

    }

}

