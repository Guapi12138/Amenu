package com.example.administrator.cookman.utils;

import android.os.Handler;



public class TimerUtil {
    public static void startTimer(int time, final TimerCallBackListener callBack){
        if(callBack != null){
            callBack.onStart();
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(callBack != null){
                    callBack.onEnd();
                }
            }
        }, time);
    }

    public interface TimerCallBackListener{
        public void onStart();
        public void onEnd();
    }
}
