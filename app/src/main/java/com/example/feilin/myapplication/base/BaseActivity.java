package com.example.feilin.myapplication.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import butterknife.ButterKnife;

/**
 * Created by feilin on 2017/10/29.
 * shot activity
 */

public abstract class BaseActivity extends AppCompatActivity {

    final static String TAG = BaseActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.e(TAG, "onCreate");
        if (savedInstanceState != null) {

        }

        setContentView(getContentView());
        ButterKnife.bind(this);
        initWidget();
        initData();
    }

    protected void initData() {

    }

    protected void initWidget() {

    }


    protected abstract int getContentView();
}
