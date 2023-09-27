package com.example.mainactivity3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText idText,pwText;
    private Button loginButton;
    private TextView signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //회원가입 버튼
        idText = findViewById(R.id.editID);
        pwText = findViewById(R.id.ediPassword);
        loginButton = findViewById(R.id.loginbutton);
        signin = findViewById(R.id.signin);;

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = idText.getText().toString();
                String pw = pwText.getText().toString();
                if(id.equals("")||pw.equals("")){
                    Toast.makeText(getApplicationContext(),"id와 비밀번호를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);
                }
            }
        });

        //회원가입 버튼 클릭시, 회원가입 페이지로 이동
        signin.setOnClickListener(v -> {
            Intent intent = new Intent(this, SigninActivity.class);
            startActivity(intent);
        });
    }
}