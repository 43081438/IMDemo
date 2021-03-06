package com.example.administrator.imtest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.imtest.R;
import com.example.administrator.imtest.base.BaseActivity;


/*
 *
 *
 * 作 者 :quzongyang
 *
 * 版 本 :1.0
 *
 * 创建日期 :2016/8/5  14:14
 *
 * 描 述 :主页面
 *
 * 修订日期 :
 */
public class MainActivity extends BaseActivity {

    Button btn_sign_in_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_sign_in_button = (Button) findViewById(R.id.btn_sign_in_button);
        btn_sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChatActivity.class));
            }
        });
    }
}
