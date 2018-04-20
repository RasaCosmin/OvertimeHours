package com.rasik.overtimehours.Settings

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rasik.overtimehours.R

class SettingsActivity : AppCompatActivity(), SettingsContract.SettingsView{

    lateinit var settingsPresenter: SettingsContract.SettingsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        settingsPresenter = SettingsPresenterImpl(this, SettingsInteractorImpl(this))
    }

    override fun getStartDayValue(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEndDayValue(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMealPeriod(): List<Int> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getWeekHours(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDayHours(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
