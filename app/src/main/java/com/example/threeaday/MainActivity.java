package com.example.threeaday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //should these be private?
    DatabaseHelper dbHelper;
    Button saveBtn;
    EditText edtTask1, edtTask2, edtTask3;
    EditText edtBonus1, edtBonus2, edtBonus3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveBtn = findViewById(R.id.btnSave);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveChanges();
            }
        });
    }

    protected void saveChanges()
    {
        Toast.makeText(MainActivity.this, "This will save to our database", Toast.LENGTH_LONG).show();
    }
}