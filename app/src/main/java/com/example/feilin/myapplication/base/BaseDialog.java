package com.example.feilin.myapplication.base;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by feilin on 2017/10/30.
 */

public abstract class BaseDialog extends AlertDialog {

    private Context mContext;

    public BaseDialog(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getContentView());
    }

    protected abstract int getContentView();
}
