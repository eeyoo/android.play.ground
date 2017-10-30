package com.example.feilin.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.feilin.myapplication.base.BaseActivity;
import com.example.feilin.myapplication.fragment.ContentFragment;
import com.example.feilin.myapplication.fragment.RefreshFragment;

import butterknife.Bind;

/**
 * Created by feilin on 2017/10/29.
 */

public class ShotActivity extends BaseActivity {

    final static String TAG = "ShotActivity";

//    @Bind(R.id.shot_name_tv)
//    TextView nameTv;
//    @Bind(R.id.shot_content_tv)
//    TextView contentTv;

    @Override
    protected int getContentView() {
        return R.layout.activity_shot;
    }

    @Override
    protected void initWidget() {
        super.initWidget();



        //FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
        //RefreshFragment refreshFragment = new RefreshFragment();
        //trans.add(R.id.content, refreshFragment);
        //trans.addToBackStack(null);
        //trans.commit();
        getSupportFragmentManager().beginTransaction().add(R.id.content, new ContentFragment()).commit();

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                ContentFragment fragment = new ContentFragment();
//                getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment).addToBackStack(null).commit();
//
//
//            }
//        }, 2000);

        //Log.e(TAG, "init widget");
        //Snackbar.make(getWindow().getDecorView(), "你好", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
    }


}
