package com.justin.onetask.common.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Singleton
@Module
class AppModule(private val application: Application) {

    @Provides
    @Singleton
    fun providesApp(): Application {
        return application
    }
}