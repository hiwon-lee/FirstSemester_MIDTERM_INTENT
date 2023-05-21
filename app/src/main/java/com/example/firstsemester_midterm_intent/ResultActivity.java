package com.example.firstsemester_midterm_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    Button btnreturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent(); //인텐트 가져옴
        int[] voutcout=intent.getIntArrayExtra("votec");
        String[] imageName=intent.getStringArrayExtra("imgname");
        TextView[] tv =new TextView[9];
        Integer[] tvid ={R.id.tv1,R.id.tv2,R.id.tv3,
                R.id.tv4,R.id.tv5,R.id.tv6,
                R.id.tv7,R.id.tv8,R.id.tv9};
        for(int i =0;i<9;i++){
            tv[i] = findViewById(tvid[i]);
            tv[i].setText(imageName[i]);
        }
        RatingBar[] rbar =new RatingBar[9];
        Integer[] rbarid ={R.id.rbar1, R.id.rbar2,R.id.rbar3,
                R.id.rbar4, R.id.rbar5,R.id.rbar6,
                R.id.rbar7, R.id.rbar8,R.id.rbar9  };
        for(int i = 0; i<9;i++) {
            rbar[i]=findViewById(rbarid[i]);
            rbar[i].setRating(voutcout[i]);
        }
        btnreturn = findViewById(R.id.btnreturn);
        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}