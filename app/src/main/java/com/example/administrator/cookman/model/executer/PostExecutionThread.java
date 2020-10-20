package com.example.administrator.cookman.model.executer;

import rx.Scheduler;


public interface PostExecutionThread {
    public Scheduler getScheduler();
}
