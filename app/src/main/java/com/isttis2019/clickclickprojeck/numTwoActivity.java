package com.isttis2019.clickclickprojeck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class numTwoActivity extends AppCompatActivity {

    int[] rndNum=new int[9];
    ImageView[] imageViews= new ImageView[9];
    Random random=new Random();

    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_two);

        Intent intent=new Intent(this.getIntent());

        for (int i=0; i<9; i++){
            imageViews[i]=findViewById(R.id.img_01+i);
        }

        for (int i=0; i<9; i++){
            rndNum[i]=random.nextInt(9);
            for (int k=0; k<i;k++){
                if (rndNum[i]==rndNum[k]){
                    i--;
                }
            }
        }
        for (int i=0; i<9; i++){
            imageViews[i].setImageResource(R.drawable.num11+rndNum[i]);
            imageViews[i].setTag(rndNum[i]);
        }




    }


    public void clickBtn(View view) {

        int btn= (int) view.getTag();

        if (btn==num){
            view.setVisibility(View.INVISIBLE);
            num++;
        }else {
            Toast.makeText(this, "순서대로 눌러주세요.", Toast.LENGTH_SHORT).show();
        }
        if (num==8){
            Intent intent=new Intent(this, num3ThreeActivity.class);
            startActivity(intent);
            finish();
        }

    }
}



