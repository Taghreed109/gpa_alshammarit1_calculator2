package com.example.gpa_alshammarit1_calculator2;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    private static final String AAA= MainActivity.class.getSimpleName();

    Button bb;
    EditText c1,c2,c3,c4,c5;
    TextView gpa;
    int count=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bb=(Button)findViewById(R.id.bb);
        c1=(EditText)findViewById(R.id.c1);
        c2=(EditText)findViewById(R.id.c2);
        c3=(EditText)findViewById(R.id.c3);
        c4=(EditText)findViewById(R.id.c4);
        c5=(EditText)findViewById(R.id.c5);
        gpa=(TextView)findViewById(R.id.gpa);
        gpa.setBackgroundColor(Color.WHITE);
        bb.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                float c11, c12, c13, c14, c15;
                if (count % 2 == 0) {
                    if (c1.getText().toString().equals("") || c2.getText().toString().equals("") ||
                            c3.getText().toString().equals("") ||
                            c4.getText().toString().equals("") || c5.getText().toString().equals("")) {
                        gpa.setText("Enter grades in all fields");
                    }
                    else {
                        c11 = Float.parseFloat(c1.getText().toString());
                        c12 = Float.parseFloat(c2.getText().toString());
                        c13 = Float.parseFloat(c3.getText().toString());
                        c14 = Float.parseFloat(c4.getText().toString());
                        c15 = Float.parseFloat(c5.getText().toString());
                        float avg = c11 + c12 + c13 + c14 + c15;
                        avg = avg / 5;
                        if (avg < 60) {
                            gpa.setText(Float.toString(avg));
                            gpa.setBackgroundColor(Color.RED);
                        } else if (avg > 60 && avg < 80) {
                            gpa.setText(Float.toString(avg));
                            gpa.setBackgroundColor(Color.YELLOW);
                        } else if (avg >= 80 && avg <= 100) {
                            gpa.setText(Float.toString(avg));
                            gpa.setBackgroundColor(Color.GREEN);
                        }
                        count++;
                        bb.setText("Clear");
                    }

                }
                else
                {
                    c1.setText("");
                    c2.setText("");
                    c3.setText("");
                    c4.setText("");
                    c5.setText("");
                    gpa.setText("");
                    bb.setText("Compute GPA");
                    gpa.setBackgroundColor(Color.WHITE);
                    count++;
                }
            }
        });
        Log.i(AAA, "OnCreated is called");

    }



    @Override
    protected void onStart(){
        super.onStart();
        Log.i(AAA, "OnStart is called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(AAA, "OnStop is called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(AAA, "OnPause is called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(AAA, "OnResume is called");

    }


}
