package com.example.muayad.maxhit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String weight;
    private static String reps;
    EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button calcButton = findViewById(R.id.button2);
        calcButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                displayWeight();
            }
        });
    }
    public void displayText(String message) {
        TextView textView = (TextView) findViewById(R.id.textDisplay);
        textView.setText(message);
    }

    public void displayWeight() {
        Intent nextPage = new Intent(this, weightDisplay.class);
        startActivity(nextPage);
        edit1   = (EditText)findViewById(R.id.editText2);
        weight = edit1.getText().toString();
        setWeight(weight);
    }


    public void setWeight(String w) {
        this.weight = w;
    }
    public static String getWeight() {
        return weight;
    }
    public void setReps(String r) {
        this.reps = r;
    }
    public static String getReps() {
        return reps;
    }

}
