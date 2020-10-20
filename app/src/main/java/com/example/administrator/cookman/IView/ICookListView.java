package com.example.administrator.cookman.IView;

import com.example.administrator.cookman.model.entity.CookEntity.CookDetail;

import java.util.ArrayList;



public interface ICookListView {

    public void onCookListUpdateRefreshSuccess(ArrayList<CookDetail> list);
    public void onCookListUpdateRefreshFaile(String msg);

    public void onCookListLoadMoreSuccess(ArrayList<CookDetail> list);
    public void onCookListLoadMoreFaile(String msg);
}
