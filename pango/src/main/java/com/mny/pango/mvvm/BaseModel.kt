package com.mny.pango.mvvm

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.mny.pango.data.IRepository
import org.koin.core.KoinComponent
import org.koin.core.inject

/**
 *@author mny on 2020/5/17.
 *        Email：mny9@outlook.com
 *        Desc:
 */
abstract class BaseModel() : LifecycleObserver, KoinComponent {
    val mRepository: IRepository? by inject()

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
//        mRepository = null
    }

}