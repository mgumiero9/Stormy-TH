package com.androiders.stormy.ui;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androiders.stormy.R;
import com.androiders.stormy.weather.Hour;

import java.util.Arrays;

public class HourlyForecastActivity extends AppCompatActivity {

    private Hour[] mHours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast_activity);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.HOURLY_FORECAST);
        mHours = Arrays.copyOf(parcelables, parcelables.length, Hour[].class);
    }
}
