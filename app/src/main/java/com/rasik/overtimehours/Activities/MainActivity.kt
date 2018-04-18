package com.rasik.overtimehours.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import com.rasik.overtimehours.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this)
        val isInit = sharedPrefs.getBoolean("isInit", false)

        if (!isInit) {

        } else {

        }
    }
}
