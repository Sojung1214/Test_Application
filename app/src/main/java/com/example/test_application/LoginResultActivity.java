package com.example.test_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class LoginResultActivity extends AppCompatActivity {
// activity를 만들면 AndroidManifest.xml에 넣어줘야 함
    TextView TextView_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //화면매칭

        TextView_get = findViewById(R.id.TextView_get);

        //이제 여기서 MainActivity.java에서 넘어온 값을 받아야함
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String email = bundle.getString("email");
        String password = bundle.getString("password");

        TextView_get.setText(email + " / " + password); //activity_main.xml에서 값을을 표시(보여줌)
    }
}