package com.example.feilin.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tab.*

/**
 * Created by feilin on 2017/11/12.
 * Kotlin Activity
 */
class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tab);

        coordinator_tab_layout.setTitle("测试")

        coordinator_tab_layout.setImageArray(intArrayOf(R.mipmap.ic_launcher, R.mipmap.ic_launcher_round),
                intArrayOf(android.R.color.holo_blue_light,
                    android.R.color.holo_red_light,
                    android.R.color.holo_orange_light,
                    android.R.color.holo_green_light))

        coordinator_tab_layout.setTranslucentNavigationBar(this)
    }
}