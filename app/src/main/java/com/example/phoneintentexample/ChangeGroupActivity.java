package com.example.phoneintentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ChangeGroupActivity extends AppCompatActivity {


    EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_group);

        editText4 = findViewById(R.id.editText4);
    }

    public void onClickOK(View view) {
        Intent intentOK = new Intent();
        intentOK.putExtra("group", editText4.getText().toString());
        setResult(RESULT_OK, intentOK);
        this.finish();

    }
}
