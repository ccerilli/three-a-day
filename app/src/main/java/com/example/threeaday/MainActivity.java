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
    Task testTask1, testTask2, testTask3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveBtn = findViewById(R.id.btnSave);

        //Create 3 tasks one time for initial database testing
        //todo: Figure out how to connect autoincrement id from db to Task constructor
        /* Only had to do this one time
        testTask1 = new Task(1,"Run 3 Miles","Fitness");
        testTask2 = new Task(2,"Call Parents","Social");
        testTask3 = new Task(3,"Work on this App","Professional");

        dbHelper = new DatabaseHelper(MainActivity.this);
        dbHelper.addTask(testTask1);
        dbHelper.addTask(testTask2);
        dbHelper.addTask(testTask3);

         */

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