package com.gursimran.birthdaywisher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class wish extends AppCompatActivity {

    TextView e1;
    String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish);

      e1=findViewById(R.id.textView);
      s1=getIntent().getExtras().getString("name");
      e1.setText(s1);

    }
}