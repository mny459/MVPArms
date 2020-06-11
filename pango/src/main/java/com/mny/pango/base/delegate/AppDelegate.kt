package com.mny.pango.base.delegate

import android.app.Application
import android.content.Context
import com.mny.pango.di.module.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
class AppDelegate(private val context: Context) : AppLifecycle {
    override fun attachBaseContext(base: Context) {
    }

    override fun onCreate(application: Application) {
        startKoin {
            androidLogger()
            androidContext(application)
            androidFileProperties()
            modules(appModule)
        }
    }

    override fun onTerminate(application: Application) {
    }
}