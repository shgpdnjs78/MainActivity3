package com.example.mainactivity3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //R.layout.activity_main → app/res/layout/activity_main.xml 같은 뜻이다.)
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);

                startActivity(intent);

        Button moveButton = findViewById(R.id.button4);
        //findViewById(R.id.button4) : 버튼의 text가 아니라 Id값을 넣어줘야한다.
        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        }
        });
    }

    public void btnFn(View v) {
        Toast.makeText(this, "버튼을 눌렀습니다.", Toast.LENGTH_LONG).show();
    }

    public void Naver(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }

    public void call(View v) {
        Intent MyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(MyIntent);

    }

}