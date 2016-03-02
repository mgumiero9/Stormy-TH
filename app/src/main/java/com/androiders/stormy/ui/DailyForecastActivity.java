package com.androiders.stormy.ui;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.androiders.stormy.R;
import com.androiders.stormy.adapters.DayAdapter;
import com.androiders.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday",
                                    "Thursday", "Friday", "Saturday" };

        /* This is the old version used for learning adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                daysOfTheWeek);

        setListAdapter(adapter);*/

        DayAdapter adapter = new DayAdapter(this,  mDays);
    }
}
