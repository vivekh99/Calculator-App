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

                int num1 = Integer.parseInt(firsteditText.getText().toString());

                int num2 = Integer.parseInt(secondNumbereditTxt.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });

    }
}
