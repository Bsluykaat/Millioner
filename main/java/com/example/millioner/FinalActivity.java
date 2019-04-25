package com.example.millioner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {
    Button yesButton, noButton;
    TextView result, num;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        yesButton = (Button) findViewById(R.id.yesButton);
        noButton = (Button) findViewById(R.id.noButton);
        result = (TextView) findViewById(R.id.resultTextView);
        num = (TextView) findViewById(R.id.numOfRightAnswers);
        num.setText(Integer.toString(getIntent().getIntExtra("numOfRight", 0)));
        if (getIntent().getIntExtra("numOfRight", 0) != 7) {
            result.setText(R.string.resultIfNotAllRight);
        }
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinalActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
