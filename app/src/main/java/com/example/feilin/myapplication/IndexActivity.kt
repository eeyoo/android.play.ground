package com.example.feilin.myapplication

import android.os.Bundle
import android.os.Handler
import android.support.design.widget.Snackbar
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View

import kotlinx.android.synthetic.main.activity_index.*
import kotlinx.android.synthetic.main.content_index.*

abstract class IndexActivity : AppCompatActivity(), SwipeRefreshLayout.OnRefreshListener {

    private val TAG = "IndexActivity"

    override fun onRefresh() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        swipe_refresher.setRefreshing(true)
        Handler().postDelayed( Runnable {
                //Log.e(TAG, "refresh")
            Snackbar.make(window.decorView, "刷新完成", Snackbar.LENGTH_SHORT).show()

            swipe_refresher.setRefreshing(false)
        }, 2000)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        swipe_refresher.setOnRefreshListener(this)


    }

}
