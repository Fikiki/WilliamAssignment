package com.tchongwe.william;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.Button;
//william tchongwe
//15922

public class About extends AppCompatActivity {
TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

      Button  click= findViewById(R.id.aboutClickText);

      display= findViewById(R.id.displayText);

        click.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
              display.setText(  "This application has three buttons, one for dublin bike API that will show a list of stations around dublin as well as a number of bikes available." +
                                "also will show have another button that will show a map of dublin and some markers" +
                                "and the final but will show what this pplication is about when one clicks on it.");
            }
                                      }
        );

    }



    }

