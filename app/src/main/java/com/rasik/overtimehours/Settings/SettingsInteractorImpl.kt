package com.rasik.overtimehours.Settings

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

/**
 * Created by Rasa Cosmin on 20.04.2018.
 */
class SettingsInteractorImpl(context: Context) : SettingsContract.SettingsInteractor{
    private val sharedPreferences: SharedPreferences
    init {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    }

    override fun setUserSettings(settings: Settings, item: Int) {
        sharedPreferences.edit().putInt(settings.name,item).apply()
    }

    override fun getUserSettings(settings: Settings): Int {
        return sharedPreferences.getInt(settings.name, -1)
    }

}