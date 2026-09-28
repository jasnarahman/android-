package com.example.toggle;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView i1, i2;
    ToggleButton b;
    boolean isFirstImage=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        i1 = findViewById(R.id.imageView);
        i2 = findViewById(R.id.imageView2);
        b = findViewById(R.id.toggleButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstImage) {
                    i1.setVisibility(View.GONE);
                    i2.setVisibility(View.VISIBLE);
                }
                else {
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.GONE);
                }
                isFirstImage=!isFirstImage;
            }

        });
    }
}
