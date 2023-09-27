package com.example.mainactivity3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    Button button1, button2, button3, button4, button6;
    int originalButtonColor = Color.GRAY;  // 버튼의 원래 색상을 설정합니다.
    boolean isColorChanged1 = false, isColorChanged2 = false, isColorChanged3 = false, isColorChanged4 = false;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main3);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        // 버튼의 배경색을 원래 색상으로 설정합니다.
        button1.setBackgroundColor(originalButtonColor);
        button2.setBackgroundColor(originalButtonColor);
        button3.setBackgroundColor(originalButtonColor);
        button4.setBackgroundColor(originalButtonColor);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isColorChanged1) {
                    button1.setBackgroundColor(originalButtonColor); // 원래 색상으로 변경
                    isColorChanged1 = false;
                } else {
                    button1.setBackgroundColor(Color.RED); // 버튼 색상을 빨간색으로 변경
                    isColorChanged1 = true;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isColorChanged2) {
                    button2.setBackgroundColor(originalButtonColor); // 원래 색상으로 변경
                    isColorChanged2 = false;
                } else {
                    button2.setBackgroundColor(Color.GREEN); // 버튼 색상을 초록색으로 변경
                    isColorChanged2 = true;
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isColorChanged3) {
                    button3.setBackgroundColor(originalButtonColor); // 원래 색상으로 변경
                    isColorChanged3 = false;
                } else {
                    button3.setBackgroundColor(Color.BLUE); // 버튼 색상을 파란색으로 변경
                    isColorChanged3 = true;
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isColorChanged4) {
                    button4.setBackgroundColor(originalButtonColor); // 원래 색상으로 변경
                    isColorChanged4 = false;
                } else {
                    button4.setBackgroundColor(Color.YELLOW); // 버튼 색상을 노란색으로 변경
                    isColorChanged4 = true;
                }
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CameraActivity로 이동하는 코드를 작성합니다.
                Intent intent = new Intent(MainActivity3.this, CameraActivity.class);
                startActivityForResult(intent,0);
                //startActivity(intent);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 0) {
            if (resultCode == 0) {
                finish();
            }
        }
    }
}
