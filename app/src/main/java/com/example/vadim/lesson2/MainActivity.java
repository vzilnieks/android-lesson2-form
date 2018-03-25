package com.example.vadim.lesson2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void onLoginClick(View view) {

    EditText editTextEmail = findViewById(R.id.editTextEmail);
    EditText editTextPassword = findViewById(R.id.editTextPassword);

    String email = editTextEmail.getText().toString();
    String password = editTextPassword.getText().toString();

    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
    alertDialog.setTitle("Alert");
    alertDialog.setMessage("Email: " + email + " Password:" + password);
    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
      new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int which) {
          dialog.dismiss();
        }
      });
    alertDialog.show();

  }
}
