package com.example.feilin.myapplication.dialog;

import android.content.Context;

import com.example.feilin.myapplication.R;
import com.example.feilin.myapplication.base.BaseDialog;

/**
 * Created by feilin on 2017/10/30.
 */

public class SmileDialog extends BaseDialog {


    public SmileDialog(Context context) {
        super(context);
    }

    @Override
    protected int getContentView() {
        return R.layout.layout_dialog_foo;
    }


}
