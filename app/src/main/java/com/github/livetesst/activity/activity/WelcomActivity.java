package com.github.livetesst.activity.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.github.livetesst.R;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer timer=new Timer();
        TimerTask task=new TimerTask(){
            public void run(){
                Intent intent=new Intent(WelcomActivity.this,StartActivity.class); //通过Intent实现跳转
                startActivity(intent);
                finish();
            }
        };
        timer.schedule(task,1000*2); //呈现2秒跳转到MainActivity(主界面)中
    }


}
