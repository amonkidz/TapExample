package com.example.tapexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_LIST = 201;

    EditText editText_login_id;
    EditText editText_login_pw;

    String login_id = "hanna";
    String login_pw = "hanna";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText_login_id = findViewById(R.id.editid);
        editText_login_pw = findViewById(R.id.editpw);

        Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = editText_login_id.getText().toString();
                String pw = editText_login_pw.getText().toString();

                if(id.equals(login_id) && pw.equals(login_pw)) {
                    Toast.makeText(getApplicationContext(), "로그인 성공", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), ListShowActivity.class);
                    intent.putExtra("id", id);
                    startActivityForResult(intent, REQUEST_CODE_LIST);
                } else if (!(id.equals(login_id)) || !(pw.equals(login_pw))) {
                    Toast.makeText(getApplicationContext(), "로그인 실패", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}