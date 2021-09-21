package com.example.helloworld2;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  EditText name;
  Button ok;
  TextView result;
  String userName;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    name = findViewById(R.id.editTextName);
    ok = findViewById(R.id.buttonOk);
    result = findViewById(R.id.textViewResult);

    ok.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {


        userName = name.getText().toString();
        result.setText(userName);
      }
    });
  }
}