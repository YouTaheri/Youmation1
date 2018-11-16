package com.example.yousef.youmation1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class youMainActivity extends AppCompatActivity {

    Button insta,tele,fab;
    Animation instamation1,instamation2, telemation1,telemation2;
    Boolean show=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_main);

        fab = findViewById(R.id.fab);
        insta = findViewById(R.id.insta);
        tele =  findViewById(R.id.tele);
        instamation1 = AnimationUtils.loadAnimation(this, R.anim.instamation);
        instamation2 = AnimationUtils.loadAnimation(this, R.anim.instamation_back);
        telemation1 = AnimationUtils.loadAnimation(this, R.anim.telemation);
        telemation2 = AnimationUtils.loadAnimation(this, R.anim.telemation_back);

        fab.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(show) {
                    insta.startAnimation(instamation2);
                    tele.startAnimation(telemation2);
                    fab.animate().rotation(0).setDuration(600).start();
                    show = false;

                }else {
                    insta.startAnimation(instamation1);
                    tele.startAnimation(telemation1);
                    fab.animate().rotation(-180).setDuration(900).start();
                    show = true;
                }
            }
        });
    }
}
