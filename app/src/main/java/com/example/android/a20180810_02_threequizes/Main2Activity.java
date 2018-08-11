package com.example.android.a20180810_02_threequizes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class Main2Activity extends AppCompatActivity {

    public static final String key2 = "key2";
    private CharSequence mChoiseName;       //選項內容

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle 包 = intent.getExtras();
        String answer = 包.getString("key");
    }

    public void clickchoise(View view){
        RadioButton radio = (RadioButton)view;  //view 為當前所按的選鈕
        mChoiseName = radio.getText();          //取得選紐文字內容
    }

    public void clicknext(View view){
        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra(key2,mChoiseName);
        startActivity(intent);
    }

}
