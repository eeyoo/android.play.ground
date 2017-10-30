package com.example.feilin.myapplication.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.feilin.myapplication.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by feilin on 2017/10/29.
 */

public class RefreshFragment extends Fragment {

    //private Context mContext;
    @Bind(R.id.refresh_progressbar)
    ProgressBar progressBar;
    @Bind(R.id.refresh_message)
    TextView message;

    public RefreshFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_refresh, container, false);
        ButterKnife.bind(this, root);

        message.setText("正在加载...");

        return root;
    }
}
