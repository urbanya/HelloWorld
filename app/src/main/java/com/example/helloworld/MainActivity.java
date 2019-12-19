package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {


    Button Button1;
    TextView Text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button1 = (Button) findViewById(R.id.Button1);
        Button1.setOnClickListener(this);

        Text1 = (TextView) findViewById(R.id.Text1);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, Menue.class);
        startActivity(intent);
        this.finish();
    }
}
