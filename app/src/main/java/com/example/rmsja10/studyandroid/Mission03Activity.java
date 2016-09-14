package com.example.rmsja10.studyandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Mission03Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission03);

        Button customerButton = (Button)findViewById(R.id.btn_customer);
        Button salesButton = (Button)findViewById(R.id.btn_sales);
        Button productButton = (Button)findViewById(R.id.btn_product);

        View.OnClickListener clickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_customer:
                        Intent intent = new Intent(getApplicationContext(), Mission04_CustomerActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn_sales:
                        intent = new Intent(getApplicationContext(), Mission04_SalseActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn_product:
                        intent = new Intent(getApplicationContext(), Mission04_ProductActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };

        customerButton.setOnClickListener(clickListener);
        salesButton.setOnClickListener(clickListener);
        productButton.setOnClickListener(clickListener);
    }


}
