package com.example.mainactivity3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {

    Button btnCamera , button6;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        btnCamera = (Button) findViewById(R.id.camera);
        imageView = (ImageView) findViewById(R.id.imagefile);

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        //카메라 촬영을 하면 이미지뷰에 사진 삽입
        if(requestCode ==0 && resultCode == RESULT_OK){
            //Bundle로 데이터를 입력
            Bundle extras = data.getExtras();
            //Bitmap으로 컨버전
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            //이미지뷰에 Bitmap으로 이미지를 입력
            imageView.setImageBitmap(imageBitmap);
        }
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CameraActivity로 이동하는 코드를 작성합니다.
                Intent intent = new Intent();
                setResult(0,intent);
                finish();


            }
        });
    }

}