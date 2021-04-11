package com.example.test_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_email, TextInputEditText_password;
    RelativeLayout RelativeLayout_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); //화면매칭

        TextInputEditText_email = findViewById(R.id.TextInputEditText_email);
        TextInputEditText_password = findViewById(R.id.TextInputEditText_password);
        RelativeLayout_login = findViewById(R.id.RelativeLayout_login);

        //1. 값을 가져온다  activity_login.xml => MainActivity.java로 이메일과 패스워드를 들고옴
        //2. 클릭을 감지한다
        //3. 1번의 값을 다음 액티비티로 넘긴다

        // 사용자 입력 값을 가져옴 -> get.Text()
        String email = TextInputEditText_email.getText().toString();
        String password = TextInputEditText_password.getText().toString();

        //클릭 가능
        RelativeLayout_login.setClickable(true);
        //클릭 감지
        RelativeLayout_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = TextInputEditText_email.getText().toString();
                String password = TextInputEditText_password.getText().toString();

                //값을 넘겨줌 -> Intent 바로 위에서 받은 값을 들고 LoginResultActivity.java 로 감
                Intent intent = new Intent(MainActivity.this, LoginResultActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent);

            }
        });
    }
}