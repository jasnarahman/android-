package com.example.act10;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView a1,a2,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        a1 = findViewById(R.id.textView);
        a2 = findViewById(R.id.textView2);

        b2 = findViewById(R.id.button2);

        Bundle extra = getIntent().getExtras();

        if (extra != null) {
            String text = extra.getString("name");
            String text1 = extra.getString("age");

            a1.setText(text);
            a2.setText(text1);

        }

        b2.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(i);
        });
    }
}
