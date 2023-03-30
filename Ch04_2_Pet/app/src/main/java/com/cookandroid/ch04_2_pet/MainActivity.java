package com.cookandroid.ch04_2_pet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtSel;
    CheckBox chkStart;
    RadioGroup rg;
    RadioButton rbDog, rbCat, rbRabbit;
    Button btnOK;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");
        txtSel = findViewById(R.id.txtSel);
        chkStart = findViewById(R.id.chkStart);
        rg = findViewById(R.id.rg);
        rbDog = findViewById(R.id.rbDog);
        rbCat = findViewById(R.id.rbCat);
        rbRabbit = findViewById(R.id.rbRabbit);
        btnOK = findViewById(R.id.btnOK);
        img = findViewById(R.id.img);

        txtSel.setVisibility(View.INVISIBLE);
        rg.setVisibility(View.INVISIBLE);
        btnOK.setVisibility(View.INVISIBLE);
        img.setVisibility(View.INVISIBLE);

        // 이미지 비우기
        img.setImageDrawable(null);

        chkStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chkStart.isChecked()) { // 체크박스가 체크 된 경우
                    txtSel.setVisibility(View.VISIBLE);
                    rg.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                }
                else { // 체크박스 체크 해제 (선택 초기화 설정 : 라디오 버튼 선택 없애기, 이미지 비우기)
                    txtSel.setVisibility(View.INVISIBLE);
                    rg.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                    img.setImageDrawable(null);
                    rg.clearCheck();
                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rg.getCheckedRadioButtonId()) {
                    case R.id.rbDog : img.setImageResource(R.drawable.dog); break;
                    case R.id.rbCat : img.setImageResource(R.drawable.cat); break;
                    case R.id.rbRabbit : img.setImageResource(R.drawable.rabbit); break;
                    default :
                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요.",
                                Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}