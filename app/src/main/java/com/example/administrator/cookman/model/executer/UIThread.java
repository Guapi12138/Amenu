package com.example.administrator.cookman.model.executer;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;


public class UIThread implements PostExecutionThread{
    private UIThread() {

    }

    public static UIThread instance() {
        return Holder.INSTANCE;
    }

    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }

    private final static class Holder {
        private static final UIThread INSTANCE = new UIThread();
    }
}
