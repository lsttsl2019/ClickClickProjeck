package com.isttis2019.clickclickprojeck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class numOneActivity extends AppCompatActivity {

    int[] rndNum=new int[9];
    ImageView[] imageViews= new ImageView[9];
    Random random=new Random();

    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_one);
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
            imageViews[i].setImageResource(R.drawable.num01+rndNum[i]);
            imageViews[i].setTag(rndNum[i]);
        }

        for (int i=0; i<9; i++){
            imageViews[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int btn= (int) v.getTag();

                    if (num==btn){
                        
                    }


                }
            });
        }



    }

}
