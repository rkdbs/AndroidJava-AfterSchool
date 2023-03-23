package com.cookandroid.ch04_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edX, edY;
    Button btnPlus, btnMinus, btnMul, btnDiv;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edX = findViewById(R.id.edX);
        edY = findViewById(R.id.edY);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtResult = findViewById(R.id.txtResult);

        // 연산자 버튼
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strX = edX.getText().toString(); // return type 변환 (문자열)
                int x = Integer.parseInt(strX); // int(정수)로 변환
                String strY = edY.getText().toString();
                int y = Integer.parseInt(strY);
                int result = x + y;
                txtResult.setText("계산결과 : " + result);
            }
        });
    }

    public void btnClick(View view) {
        String strX = edX.getText().toString(); // return type 변환 (문자열)
        int x = Integer.parseInt(strX); // int(정수)로 변환
        String strY = edY.getText().toString();
        int y = Integer.parseInt(strY);
        switch (view.getId()) {
            case R.id.btnMinus:
                txtResult.setText("계산결과 : " + (x-y));
                break;
            case R.id.btnMul:
                txtResult.setText("계산결과 : " + (x*y));
                break;
            case R.id.btnDiv:
                txtResult.setText("계산결과 : " + (x/y));
                break;
        }
    }
}