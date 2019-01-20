package com.example.myfirstapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firsteditText = (EditText) findViewById(R.id.firsteditText);
                EditText secondNumbereditTxt = (EditText) findViewById(R.id.secondNumbereditTxt);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                double num1 = Integer.parseInt(firsteditText.getText().toString());

                double num2 = Integer.parseInt(secondNumbereditTxt.getText().toString());
                double result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });

        Button btn_multiply = (Button) findViewById(R.id.multiply_btn);
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firsteditText1 = (EditText) findViewById(R.id.firsteditText);
                EditText secondNumbereditTxt1 = (EditText) findViewById(R.id.secondNumbereditTxt);
                TextView resultTextView1 = (TextView) findViewById(R.id.resultTextView);

                double num_m1 = Integer.parseInt(firsteditText1.getText().toString());

                double num_m2 = Integer.parseInt(secondNumbereditTxt1.getText().toString());
                double result1 = num_m1 * num_m2;
                resultTextView1.setText(result1 + "");
            }
        });

        Button btn_divide = (Button) findViewById(R.id.divide_btn);
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firsteditText2 = (EditText) findViewById(R.id.firsteditText);
                EditText secondNumbereditTxt2 = (EditText) findViewById(R.id.secondNumbereditTxt);
                TextView resultTextView1 = (TextView) findViewById(R.id.resultTextView);

                double num_d1 = Integer.parseInt(firsteditText2.getText().toString());

                double num_d2 = Integer.parseInt(secondNumbereditTxt2.getText().toString());
                double result2 = num_d1 / num_d2;
                resultTextView1.setText(result2 + "");
            }
        });

        Button btn_subtract = (Button) findViewById(R.id.subtract_btn);
        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firsteditText3 = (EditText) findViewById(R.id.firsteditText);
                EditText secondNumbereditTxt3 = (EditText) findViewById(R.id.secondNumbereditTxt);
                TextView resultTextView3 = (TextView) findViewById(R.id.resultTextView);

                double num_s1 = Integer.parseInt(firsteditText3.getText().toString());

                double num_s2 = Integer.parseInt(secondNumbereditTxt3.getText().toString());
                double result3 = num_s1 - num_s2;
                resultTextView3.setText(result3 + "");
            }
        });
    }
}
