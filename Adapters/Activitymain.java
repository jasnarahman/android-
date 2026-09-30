package com.example.adapters;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText num1, num2;
    Button btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnDivide = findViewById(R.id.btnDivide);

        // Student data
        String[] students = {
                "Anu",
                "Arun",
                "Rahul",
                "Meera",
                "Akhil",
                "Aaru"
        };

        // Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                students
        );

        // Set adapter
        listView.setAdapter(adapter);

        // Divide button
        btnDivide.setOnClickListener(v -> {

            try {
                int number1 = Integer.parseInt(
                        num1.getText().toString().trim()
                );

                int number2 = Integer.parseInt(
                        num2.getText().toString().trim()
                );

                int result = number1 / number2;

                Toast.makeText(
                        MainActivity.this,
                        "Result = " + result,
                        Toast.LENGTH_SHORT
                ).show();

            } catch (ArithmeticException e) {

                Toast.makeText(
                        MainActivity.this,
                        "Cannot divide by zero",
                        Toast.LENGTH_SHORT
                ).show();

            } catch (NumberFormatException e) {

                Toast.makeText(
                        MainActivity.this,
                        "Enter valid numbers",
                        Toast.LENGTH_SHORT
                ).show();

            } catch (Exception e) {

                Toast.makeText(
                        MainActivity.this,
                        "An error occurred",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
