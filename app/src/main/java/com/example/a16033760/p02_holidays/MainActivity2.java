package com.example.a16033760.p02_holidays;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView lv;
    TextView tvType;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String year = i.getStringExtra("type");
        String year1 = i.getStringExtra("special");

        tvType = (TextView) findViewById(R.id.textViewTitle2);

        if(year.equals("Secular")){
            lv = (ListView) this.findViewById(R.id.listViewHolidays);
            tvType.setText(year);

            holiday = new ArrayList<Holiday>();
            holiday.add(new Holiday("New Year's Day", "1 Jan 2017", "nye"));
            holiday.add(new Holiday("Labour Day", "1 May 2017", "ld"));;

            // Link this Activity object, the row.xml layout for
            //  each row and the food String array together
            aa = new HolidayArray(this, R.layout.holidays, holiday);
            lv.setAdapter(aa);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Holiday selectedFood = holiday.get(position);

                    Toast.makeText(MainActivity2.this, selectedFood.getName()
                                    + " Date: " + selectedFood.getDate(),
                            Toast.LENGTH_LONG).show();
                }

            });
        }else if(year.equals("Ethnic & Religion")){
            lv = (ListView) this.findViewById(R.id.listViewHolidays);
            tvType.setText(year);

            holiday = new ArrayList<Holiday>();
            holiday.add(new Holiday("Chinese New Year", "28-29 Jan 2017", "cny"));
            holiday.add(new Holiday("Good Friday", "14 April 2017", "gf"));

            // Link this Activity object, the row.xml layout for
            //  each row and the food String array together
            aa = new HolidayArray(this, R.layout.holidays, holiday);
            lv.setAdapter(aa);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Holiday selectedFood = holiday.get(position);

                    Toast.makeText(MainActivity2.this, selectedFood.getName()
                                    + " Date: " + selectedFood.getDate(),
                            Toast.LENGTH_LONG).show();
                }

            });
        }else{
            Toast.makeText(this, "Not Valid", Toast.LENGTH_SHORT).show();
        }

    }
}
