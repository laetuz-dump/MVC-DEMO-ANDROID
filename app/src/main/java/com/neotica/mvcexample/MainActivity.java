package com.neotica.mvcexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayAppText();
            }
        });

        //When User click the button, the textview will display text.
    }

    public Model GetAppFromModel(){

        return new Model("Demo App",999,5);
    }

    public void DisplayAppText(){
        textView.setText(GetAppFromModel().getAppName() + " Downloads " + GetAppFromModel().getAppDownloads());
    }

    //view: TextView
    //Model: Model.java class
    // Controller: MainActivity
}