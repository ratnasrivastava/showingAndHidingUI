package com.ratnasrivastava.showingandhidinguielements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button showButton, hideButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showButton = findViewById(R.id.showButton);
        hideButton = findViewById(R.id.hideButton);
        textView = findViewById(R.id.textView);
    }

    public void showAndHide(View view) {
        switch (view.getId()) {
            case R.id.showButton:
                textView.setVisibility(View.VISIBLE);
                break;
            case R.id.hideButton:
                textView.setVisibility(View.INVISIBLE);
                break;
        }
    }
}