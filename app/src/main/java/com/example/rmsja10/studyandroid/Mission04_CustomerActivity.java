package com.example.rmsja10.studyandroid;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mission04_CustomerActivity extends AppCompatActivity {

    String strNowDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission04__customer);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
        String strNow = format.format(calendar.getTime());

        final Button nowDateButton = (Button)findViewById(R.id.btn_nowDate);
        nowDateButton.setText(strNow);
        strNowDate = strNow;

        nowDateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DATE);
                //int hour = calendar.get(Calendar.HOUR);
                //int minute = calendar.get(Calendar.MINUTE);

                DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener(){
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String strSelectDate = String.format("%s년 %s월 %s일", year, month, dayOfMonth);
                        nowDateButton.setText(strSelectDate);
                        strNowDate = strSelectDate;
                    }
                };

                DatePickerDialog dateDialog = new DatePickerDialog(Mission04_CustomerActivity.this, dateSetListener, year, month, day);
                dateDialog.show();
            }
        });

        Button customerSaveButton = (Button)findViewById(R.id.bnt_customer_save);
        customerSaveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editTextName = (EditText)findViewById(R.id.editTextName);
                EditText editTextPassWord = (EditText)findViewById(R.id.editTextPassWord);
                String s = String.format("이름 : %s \n 나이 : %s \n 생년월일 : %s", editTextName.getText(), editTextPassWord.getText(), strNowDate);
                Toast toast = Toast.makeText(getBaseContext(), s, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
