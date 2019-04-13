package com.isttis2019.clickclickprojeck;

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


        for(int i=0; i<arr.length ; i++){
            arr[i]=rnd.nextInt(9);
            for(int k=0; k<i; k++){
               if(arr[i]==arr[k]){
                   i--;
                   break;
               }
               }
        }

        for(int i=0; i<iv.length;i++){
            iv[i]=findViewById(R.id.vi01+i);
        }
        //id와 달았다.




    }

    public void Rnd(){

        for(int i=0; i<arr.length ; i++){
            arr[i]=rnd.nextInt(9);
            for(int k=0; k<i; k++){
                if(arr[i]==arr[k]){
                    i--;
                    break;
                }
            }
        }

        for(int i=0; i<iv.length;i++){
            iv[i]=findViewById(R.id.vi01+i);
            iv[i].setVisibility(View.VISIBLE);
        }
    }

    public void clickst(View v){



        for(int i=0; i<iv.length ;i++){
            iv[i].setImageResource(R.drawable.num01+arr[i]);
            iv[i].setTag(arr[i]);
        }

        tv.setText("숫자를 순서대로 누르세요");

        st.setImageResource(R.drawable.starting);


    }

    public void clickBtn(View v){
        int btn=((int)v.getTag());
        if(btn==nums){
            v.setVisibility(View.INVISIBLE);
            nums++;
        }
        if(btn==8){

            if(re==0){
                bg.setBackgroundResource(R.drawable.bg2);
                nums=0;

                Rnd();
                for(int i=0; i<iv.length ;i++){
                    iv[i].setImageResource(R.drawable.num11+arr[i]);
                    iv[i].setTag(arr[i]);
                }


                re++;

            }else if(re==1){
                bg.setBackgroundResource(R.drawable.bg3);
                nums=0;
                Rnd();
                for(int i=0; i<iv.length ;i++){
                    iv[i].setImageResource(R.drawable.num21+arr[i]);
                    iv[i].setTag(arr[i]);
                }

                re++;
            }else if(re==2){
                tv.setText("Good End");
                st.setVisibility(View.INVISIBLE);
                bg.setBackgroundResource(R.drawable.bg4);
            }




        }


    }
}
