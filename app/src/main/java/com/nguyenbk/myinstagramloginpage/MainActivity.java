package com.nguyenbk.myinstagramloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextInputEditText tvUsername;
    private TextInputEditText tvPassword;
    private String username = "hoa";
    private String password = "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View view) {
        String username = tvUsername.getText().toString();
        String password = tvPassword.getText().toString();
        if(username.equals(this.username) && password.equals(this.password)){
            Toast.makeText(this, "Hello " + username, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }

    }
}