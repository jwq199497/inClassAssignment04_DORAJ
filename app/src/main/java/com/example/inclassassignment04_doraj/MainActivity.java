package com.example.inclassassignment04_doraj;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textBox;
    private TextView result;
    private float textSize = 12;
    private String text;
    private String show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBox = (EditText)findViewById(R.id.textBox);
        result = (TextView)findViewById(R.id.result);

        text = textBox.getText().toString();
        show = result.getText().toString();


        textBox.setText(text);

        Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();
    }

    protected void onResume(Bundle savedInstanceState){
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();
        textBox.setText(textBox.getText().toString());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.activity_main);

        textBox.setText(textBox.getText().toString());
    }

    public void copyText(View view){
        text = textBox.getText().toString();
        show = result.getText().toString();
        show = show + text;
        result.setText(show);
    }

    public void doubleText(View view){
        text = textBox.getText().toString();
        show = result.getText().toString();
        show = show + text + text;
        result.setText(show);
    }

    public void sizeUp(View view){
        result.setText(result.getText().toString());
        textSize = textSize + 1;
        result.setTextSize(textSize);
    }

    public void sizeDown(View view){
        result.setText(result.getText().toString());
        textSize = textSize - 1;
        result.setTextSize(textSize);
    }
}
