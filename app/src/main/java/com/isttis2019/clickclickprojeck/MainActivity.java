package com.isttis2019.clickclickprojeck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int nums=0; //현재 눌러야되는 숫자

    int re=0;
    LinearLayout bg;


    ImageView st;//스타트하게하는 버튼
    TextView tv;//스타트를 눌르면 바뀌는 TextView

    //9개의 배열을 만들어 아이디를 넣어준다
    ImageView[] iv=new ImageView[9];
    int[] arr=new int[9];
    Random rnd=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg=findViewById(R.id.bg);



        tv=findViewById(R.id.tv);
        st=findViewById(R.id.start);







    }


    public void clickimg(View view) {
        Intent intent=new Intent(this, numOneActivity.class);
        startActivity(intent);

        finish();


    }
}
