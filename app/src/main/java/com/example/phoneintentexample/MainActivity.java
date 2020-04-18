package com.example.phoneintentexample;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int CODEFORSECONDACTIVITY = 1;
    private static final int CODEFORCHANGEGROUPACTIVITY = 2;

    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
    }

    public void onClickCreateContact(View view) {
        Intent intentCreateContact = new Intent(this, Main2Activity.class);
        startActivityForResult(intentCreateContact, CODEFORSECONDACTIVITY);
    }


    public void onClickChangeGroup(View view) {
        Intent intentChangeGroup = new Intent(this, ChangeGroupActivity.class);
        startActivityForResult(intentChangeGroup, CODEFORCHANGEGROUPACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CODEFORSECONDACTIVITY) {
            if (resultCode == RESULT_CANCELED) {
                textView.setText(null);
                textView2.setText(null);
                textView3.setText(data.getStringExtra("key"));
                textView3.setTextColor(Color.parseColor("#FF0000"));
            } else if (resultCode == RESULT_OK) {
                textView.setText(data.getStringExtra("name"));
                textView.setTextColor(Color.parseColor("#8A2BE2"));
                textView2.setText(data.getStringExtra("family"));
                textView2.setTextColor(Color.parseColor("#8A2BE2"));
                textView3.setText(data.getStringExtra("phone"));
                textView3.setTextColor(Color.parseColor("#8A2BE2"));
            }
        } else if (requestCode == CODEFORCHANGEGROUPACTIVITY) {
            if (resultCode == RESULT_OK) {
                textView4.setText(data.getStringExtra("group"));
                textView4.setTextColor(Color.parseColor("#8A2BE2"));
            }
        }

    }

}
