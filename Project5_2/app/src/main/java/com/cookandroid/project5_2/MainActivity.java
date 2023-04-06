package com.cookandroid.project5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtX, edtY;
    // Button btnAdd, btnSub, btnMul, btnDiv;
    Button btnCals[] = new Button[4];
    Integer btnCalsID[] = { R.id.btnAdd, R.id.btnSub, R.id.btnMul, R.id.btnDiv };
    TextView txtResult;
    Button btnArr[] = new Button[10];
    Integer numIDArr[] = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
    int num1, num2;
    Integer result = 0;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단계산기[가윤]");
        edtX = findViewById(R.id.edtX);
        edtY = findViewById(R.id.edtY);
//        btnAdd = findViewById(R.id.btnAdd);
//        btnSub = findViewById(R.id.btnSub);
//        btnMul = findViewById(R.id.btnMul);
//        btnDiv = findViewById(R.id.btnDiv);
        for(i=0; i<btnCals.length; i++)
            btnCals[i] = findViewById(btnCalsID[i]);
        txtResult = findViewById(R.id.txtResult);
        for(i=0; i<btnArr.length; i++)
            btnArr[i] = findViewById(numIDArr[i]);

        for(i=0; i<btnCals.length; i++) {
            // final int index = i; // 익명 클래스 안에서 사용하기 위한 변수
            btnCals[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = Integer.parseInt(edtX.getText().toString());
                    num2 = Integer.parseInt(edtY.getText().toString());
                    switch (view.getId()) {
                        case R.id.btnAdd:
                            result = num1 + num2;
                            break;
                        case R.id.btnSub:
                            result = num1 - num2;
                            break;
                        case R.id.btnMul:
                            result = num1 * num2;
                            break;
                        case R.id.btnDiv:
                            result = num1 / num2;
                            break;
                    }
                    txtResult.setText("계산결과 : " + result);
                }
            });
        }
        for(i=0; i< btnArr.length; i++) {
            final int index = i; // 익명 클래스 안에서 사용하기 위한 변수
            btnArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}