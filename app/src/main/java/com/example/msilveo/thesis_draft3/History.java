package com.example.msilveo.thesis_draft3;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class History extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private SliderAdapter sliderAdapter;
    private Button mBackBtn;
    private int mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);

        mBackBtn = (Button) findViewById(R.id.backBtn);

        sliderAdapter = new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);

    }

    public void previous(View view){
        startActivity(new Intent(History.this,MainActivity.class));
    }
    //comment
}
