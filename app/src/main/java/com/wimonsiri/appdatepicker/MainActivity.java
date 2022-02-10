package com.wimonsiri.appdatepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements
        DatePicker.OnDateChangedListener, View.OnClickListener {
    private DatePicker datePicker;
    private Button btnSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        datePicker.setOnDateChangedListener(this);
        btnSet = (Button) findViewById(R.id.btnSet);
        btnSet.setOnClickListener(this);
    }
    @Override
    public void onDateChanged(DatePicker view, int year, int monthOfYear, int
            dayOfMonth) {
        String dateStr ="";
        dateStr = dayOfMonth + "/" + monthOfYear + "/" + year;
        Toast.makeText(this,dateStr,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View view) {
        String dateStr = "";
        dateStr = datePicker.getDayOfMonth() + "/" + datePicker.getMonth() +

                "/" + datePicker.getYear();
        Toast.makeText(this,"Your set date : " + dateStr,
                Toast.LENGTH_SHORT).show();

    }
}