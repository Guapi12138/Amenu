package com.example.administrator.cookman.ui.activity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.cookman.presenter.Presenter;
import com.umeng.analytics.MobclickAgent;

import butterknife.ButterKnife;



public abstract class BaseActivity extends AppCompatActivity {

    protected Context context;
    protected Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        context = this;
        ButterKnife.bind(this);

        //禁止横屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        init(savedInstanceState);

    }

    @Override
    protected void onResume() {
        super.onResume();

        //友盟统计
        MobclickAgent.onResume(this);

        if(presenter == null && getPresenter() != null){
            presenter = getPresenter();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();

        //友盟统计
        MobclickAgent.onPause(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        ButterKnife.unbind(this);

        if(presenter != null){
            presenter.destroy();
        }
    }

    public Context getContext(){
        return context;
    }

    protected abstract int getLayoutId();
    protected abstract Presenter getPresenter();
    protected abstract void init(Bundle savedInstanceState);

}
