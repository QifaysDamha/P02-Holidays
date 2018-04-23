package com.example.a16033760.p02_holidays;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayArray extends ArrayAdapter<Holiday> {

    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvHoliday;
    private TextView tvDate;
    private ImageView imgHoliday;

    public HolidayArray(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);

        holiday = objects;

        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.holidays, parent, false);

        imgHoliday = (ImageView)rowView.findViewById(R.id.imageView);
        tvHoliday = (TextView)rowView.findViewById(R.id.textViewHoliday);
        tvDate = (TextView)rowView.findViewById(R.id.textViewDate);

        Holiday currentHoliday = holiday.get(position);
        Holiday currentDate = holiday.get(position);
        // Set the TextView to show the food

        tvHoliday.setText(currentHoliday.getName());
        tvDate.setText(currentDate.getDate());
        // Set the image to star    or nostar accordingly
        if(currentHoliday.getImage().equals("nye")) {
            imgHoliday.setImageResource(R.drawable.newyear);
        }
        else if(currentHoliday.getImage().equals("ld")){
            imgHoliday.setImageResource(R.drawable.labourday);
        }else if(currentHoliday.getImage().equals("cny")){
            imgHoliday.setImageResource(R.drawable.cny);
        }else if(currentHoliday.getImage().equals("gf")){
            imgHoliday.setImageResource(R.drawable.goodfriday);
        }else{
            imgHoliday.setImageResource(R.drawable.ic_launcher_background);
        }

        return rowView;
    }

}
