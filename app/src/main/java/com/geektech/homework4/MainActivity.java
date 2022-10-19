package com.geektech.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText theme;
    private EditText sms;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        theme = findViewById(R.id.them);
        sms = findViewById(R.id.sms);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            String login=email.getText().toString();
            String them=theme.getText().toString();
            String message = sms.getText().toString();
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{login});
            intent.putExtra(Intent.EXTRA_EMAIL,them);
            intent.putExtra(Intent.EXTRA_EMAIL,message);
            intent.setType("message/rfc822");
            startActivity(intent);
        });
    }
}