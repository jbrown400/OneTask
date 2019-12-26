package com.justin.onetask.common

import android.app.Application
import com.justin.onetask.common.di.AppComponent

/*
    Application class for the OneTask application

    Extends Android's application class
 */
class App : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

//        appComponent = DaggerAppComponent
    }
}