package com.mny.pango.base

import android.app.Application
import android.content.Context
import com.mny.pango.base.delegate.AppDelegate
import com.mny.pango.base.delegate.AppLifecycle

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
class BaseApplication : Application() {
    private lateinit var mAppDelegate: AppLifecycle
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        mAppDelegate = AppDelegate(this)
    }

    override fun onCreate() {
        super.onCreate()
        mAppDelegate.onCreate(this)
    }

    override fun onTerminate() {
        super.onTerminate()
        mAppDelegate.onTerminate(this)
    }
}