package com.peisia.lamaderivation;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class ActivityMain extends AppCompatActivity {
    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn1 = findViewById(R.id.main_btn_1);
        mBtn2 = findViewById(R.id.main_btn_2);
        mBtn3 = findViewById(R.id.main_btn_3);
        mBtn4 = findViewById(R.id.main_btn_4);
        mBtn5 = findViewById(R.id.main_btn_5);
        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityWorldList(getString(R.string.main_btn_1));
            }
        });
        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityWorldList(getString(R.string.main_btn_2));
            }
        });
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityWorldList(getString(R.string.main_btn_3));
            }
        });
        mBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityWorldList(getString(R.string.main_btn_4));
            }
        });
        mBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityWorldList(getString(R.string.main_btn_5));
            }
        });
    }
    private void openActivityWorldList(String title){
        Intent intent=new Intent(ActivityMain.this,ActivityWordList.class);
        intent.putExtra("title", title);
        startActivity(intent);
    }
}
