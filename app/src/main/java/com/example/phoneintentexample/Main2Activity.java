package com.example.phoneintentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);

        Intent intentToFirstActivity = new Intent();
        intentToFirstActivity.putExtra("key", "Подтвердите данные!");
        setResult(RESULT_CANCELED, intentToFirstActivity);
    }

    public void onCloseActivity(View view) {
        Intent intentToFirstActivity_OK = new Intent();
        intentToFirstActivity_OK.putExtra("name", editText.getText().toString());
        intentToFirstActivity_OK.putExtra("family", editText2.getText().toString());
        intentToFirstActivity_OK.putExtra("phone", editText3.getText().toString());
        setResult(RESULT_OK, intentToFirstActivity_OK);
        this.finish();
    }
}
