package com.example.msilveo.thesis_draft3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Chart extends AppCompatActivity {
    GridView gridView;

    String[] values = {
            "A",
            "I/E",
            "U/O",
            "BA",
            "KA",
            "DA/RA",
            "GA",
            "HA",
            "LA",
            "MA",
            "NA",
            "PA",
            "SA",
            "TA",
            "WA",
            "YA"
    };

    int[] images = {
            R.drawable.a,
            R.drawable.i,
            R.drawable.u,
            R.drawable.ba,
            R.drawable.ka,
            R.drawable.da,
            R.drawable.ga,
            R.drawable.ha,
            R.drawable.la,
            R.drawable.ma,
            R.drawable.na,
            R.drawable.pa,
            R.drawable.sa,
            R.drawable.ta,
            R.drawable.wa,
            R.drawable.ya,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        gridView = (GridView) findViewById(R.id.gridview);

        GridAdapter gridAdapter = new GridAdapter(this, values, images);

        gridView.setAdapter(gridAdapter);
    }
}
