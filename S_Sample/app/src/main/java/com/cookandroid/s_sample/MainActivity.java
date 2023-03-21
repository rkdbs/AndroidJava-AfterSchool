package com.cookandroid.s_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn; // 전역변수(필드)
    EditText txtName; // 필드선언
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnClick); // xml Button 위젯과 연결
        txtName = findViewById(R.id.txtName); // xml의 EditText와 연결

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtName.getText().toString(); // 문자열로 바꿔 넣어주기
                Toast.makeText(getApplicationContext(), "이름" + name, Toast.LENGTH_LONG).show();
            }
        });
    }
}