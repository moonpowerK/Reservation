package com.hanbit.reservation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    RadioButton rdCal, rdClock;
    CalendarView cvSet;
    TimePicker tpSet;
    Button btSet;
    TextView year, month, day, hour, minut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdCal = (RadioButton) findViewById(R.id.rdCal);
        rdClock = (RadioButton) findViewById(R.id.rdClock);
        cvSet = (CalendarView) findViewById(R.id.cvSet);
        tpSet = (TimePicker) findViewById(R.id.tpSet);
        btSet = (Button) findViewById(R.id.rdCal);
        year = (TextView) findViewById(R.id.rdCal);
        month = (TextView) findViewById(R.id.rdCal);
        day = (TextView) findViewById(R.id.rdCal);
        hour = (TextView) findViewById(R.id.hour);
        minut = (TextView) findViewById(R.id.minut);

        cvSet.setVisibility(View.INVISIBLE);
        tpSet.setVisibility(View.INVISIBLE);

        rdCal.setOnClickListener(this);
        rdClock.setOnClickListener(this);
        btSet.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rdCal :
                tpSet.setVisibility(View.INVISIBLE);
                cvSet.setVisibility(View.VISIBLE);
                break;
            case R.id.rdClock :
                tpSet.setVisibility(View.VISIBLE);
                cvSet.setVisibility(View.INVISIBLE);
                break;
            case R.id.btSet :

                break;
        }
    }
}
