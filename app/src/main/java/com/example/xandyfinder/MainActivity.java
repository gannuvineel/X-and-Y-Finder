package com.example.xandyfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    float x=0, y=0, a1, b1, c1, a2, b2, c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final Button button2 = findViewById(R.id.button2);
        final EditText et1  = findViewById(R.id.editText2);
        final EditText et2  = findViewById(R.id.editText3);
        final EditText et3  = findViewById(R.id.editText4);
        final EditText et4  = findViewById(R.id.editText5);
        final EditText et5  = findViewById(R.id.editText6);
        final EditText et6  = findViewById(R.id.editText7);
        final TextView tv1  = findViewById(R.id.textView10);
        final TextView tv2  = findViewById(R.id.textView12);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button



                a1 = Float.parseFloat(et1.getText().toString());
                b1 = Float.parseFloat(et2.getText().toString());
                c1 = Float.parseFloat(et3.getText().toString());
                a2 = Float.parseFloat(et4.getText().toString());
                b2 = Float.parseFloat(et5.getText().toString());
                c2 = Float.parseFloat(et6.getText().toString());

                x = (b2*c1 - b1*c2) / (a2*b1 - a1*b2);
                y = (a1*x + c1) / (-b1);

                tv1.setText(x+"");
                tv2.setText(y+"");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");
                tv1.setText("");
                tv2.setText("");
            }
        });
    }
}
