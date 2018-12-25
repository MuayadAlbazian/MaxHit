package com.example.muayad.maxhit;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class weightDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_display);

        final String weight = MainActivity.getWeight();
        int number = Integer.parseInt(weight);
        if(number == 0) {
            System.out.println("Please enter a proper number");
        }

        int maxHit = (int) Math.round((.033 * number * 5) + number);
        System.out.println(Math.round(maxHit));
        EditText hitText = (EditText) findViewById(R.id.textView);
        String max = Integer.toString(maxHit);
        hitText.setText(max);
        hitText.setTextSize(56);



    }


}
