package com.soundbrenner.minuendo

import android.app.Application
import com.soundbrenner.minuendo.base.getApiModuleList
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class SBApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SBApplication)
            androidLogger()
            modules(getApiModuleList())
        }
    }

}