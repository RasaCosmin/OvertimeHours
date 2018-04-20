package com.rasik.overtimehours.Settings

/**
 * Created by Rasa Cosmin on 20.04.2018.
 */
interface SettingsContract {
    interface SettingsView {
        fun getStartDayValue(): Int
        fun getEndDayValue(): Int
        fun getMealPeriod(): List<Int>
        fun getWeekHours(): Int
        fun getDayHours(): Int
    }

    interface SettingsPresenter {
        fun saveUserSettings()
    }

    interface SettingsInteractor {
        fun setUserSettings(settings: Settings, item: Int)
        fun getUserSettings(settings: Settings): Int
    }
}